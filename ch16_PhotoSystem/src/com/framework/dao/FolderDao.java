package com.framework.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.framework.entity.Folder;
import com.framework.util.DatabaseConn;

/*
 *  �ۥU�� DAO
 */
public class FolderDao {
  
  private DatabaseConn dbc;
  private PreparedStatement ps;
  private ResultSet rs;
  
 
  public DatabaseConn getDbc() {
    return dbc;
  }

  public void setDbc(DatabaseConn dbc) {
    this.dbc = dbc;
  }
 
  
  
  /*
   *  �P�_�ۥU�W�٬O�_�s�b
   *  
   *  @param folderId ��ïID
   *  @return boolean �P�_�ۥU�W�٬O�_�s�b
   */
  public boolean findFolder(int folderId){
    boolean flag = false;
    
    StringBuffer sqlStr = new StringBuffer();
    sqlStr.append("  select * from folder  \n");
    sqlStr.append("   where folderId = ?   \n");
    System.out.println("********************************************************************************");
    System.out.println(FolderDao.class.getName()+",�P�_�ۥU�W�٬O�_�s�b�� SQL�G \n"+sqlStr.toString());
    System.out.println("�Ѽƭ�");
    System.out.println("01. userId = "+folderId);
    System.out.println("********************************************************************************");
   
    try{
      ps = dbc.getConn().prepareStatement(sqlStr.toString());
      ps.setInt(1,folderId);
      rs = ps.executeQuery();
      flag = rs.next(); 
    }catch(Exception e){
      e.printStackTrace();
    }finally{
      try{
        if(rs!=null) { rs.close(); rs = null; }
        if(ps!=null) { ps.close(); ps = null; }
      }catch(Exception e1){
        e1.printStackTrace();
      }
    }
    return flag;
  } // end findFolder
  
  
  
  
  
  
  
  
  
  /*
   *  �W�[�ۥU��T
   *  
   *  @param folderName  ��ï�W
   *  @param folderInfo  ��ï����
   *  @param userId      �ϥΪ�ID
   *  @return int        �W�[��T������
   */
  public int saveFolder(String folderName,String folderInfo,int userId){
    int i = 0;
    StringBuffer sqlStr = new StringBuffer();
    sqlStr.append(" insert into folder values(null,?,?,?)  \n");
    System.out.println("********************************************************************************");
    System.out.println(FolderDao.class.getName()+",�W�[�ۥU��T�� SQL�G \n"+sqlStr.toString());
    System.out.println("�Ѽƭ�");
    System.out.println("01. folderName = "+folderName);
    System.out.println("02. folderInfo = "+folderInfo);
    System.out.println("03. userId     = "+userId);
    System.out.println("********************************************************************************");
    try{
      ps = dbc.getConn().prepareStatement(sqlStr.toString());
      ps.setString(1,folderName);
      ps.setString(2,folderInfo);
      ps.setInt(3,userId);      
      i = ps.executeUpdate();
    }catch(Exception e){
      e.printStackTrace();
    }finally{
      try{
        if(ps!=null) { ps.close(); ps = null; }
      }catch(Exception e1){
        e1.printStackTrace();
      }
    }
    return i;
  } // end saveFolder
  
  
  
  
  
  
  
  
  
  /*
   *  �ӨϥΪ̪��Ҧ����ۥU
   *  
   *  @param userId          �ϥΪ�ID
   *  @return List<Folder>   �Ҧ��ϥΪ̪��ۥU
   */
  public List<Folder> allFolders(int userId){
    List<Folder> list = new ArrayList<Folder>();
    StringBuffer sqlStr = new StringBuffer();
    sqlStr.append(" select * from folder where userId = ?  \n");
    System.out.println("********************************************************************************");
    System.out.println(FolderDao.class.getName()+",�ӨϥΪ̪��Ҧ����ۥU�� SQL�G \n"+sqlStr.toString());
    System.out.println("�Ѽƭ�");
    System.out.println("01. userId     = "+userId);
    System.out.println("********************************************************************************");
    try{
      ps = dbc.getConn().prepareStatement(sqlStr.toString());
      ps.setInt(1,userId);      
      rs = ps.executeQuery();
      Folder folder = null;
      while(rs.next()){
        folder = new Folder();
        folder.setFolderId(rs.getInt("folderId"));         // ��ïID
        folder.setFolderName(rs.getString("folderName"));  // ��ï�W
        folder.setFolderInfo(rs.getString("folderInfo"));  // ��ï����
        
        list.add(folder);
      } // end while
    }catch(Exception e){
      e.printStackTrace();
    }finally{
      try{
        if(rs!=null) { rs.close(); rs = null; }
        if(ps!=null) { ps.close(); ps = null; }
      }catch(Exception e1){
        e1.printStackTrace();
      }
    }
    return list;
  } // end allFolders
  
  
  
  
  
  
  
  
  
  /*
   *  �R���ۥU
   *  
   *  @param folderId  ��ïID
   *  @return int      �R���ۥU�O�_���\
   */
  public int deleteFolder(int folderId){
    int i = 0;
    
    // �R���ӬۥU�����Ҧ��ۤ�
    int deletePhotoResult = deletePhotoByFolderId(folderId);
    System.out.println("�R���ӬۥU�����Ҧ��ۤ� deletePhotoResult = "+deletePhotoResult);
    
    int picNum = new PhotoDao().picNum(folderId);
    if(picNum == 0){  
      try{
        StringBuffer sqlStr = new StringBuffer();
        sqlStr.append(" delete from folder where folderId = ?  \n");
        System.out.println("********************************************************************************");
        System.out.println(FolderDao.class.getName()+",�R���ۥU�� SQL�G \n"+sqlStr.toString());
        System.out.println("�Ѽƭ�");
        System.out.println("01. folderId     = "+folderId);
        System.out.println("********************************************************************************");
        ps = dbc.getConn().prepareStatement(sqlStr.toString());
        ps.setInt(1,folderId);      
        i = ps.executeUpdate();
      }catch(Exception e){
        e.printStackTrace();
      }finally{
        try{
          if(ps!=null) { ps.close(); ps = null; }
        }catch(Exception e1){
          e1.printStackTrace();
        }
      }   
    } // end  if(deletePhotoByFolderId(folderId) == 1)
    return i;
  } // end deleteFolder
  
  
  
  
  
  
  
  
  
  /*
   *  �R���ӬۥU�����Ҧ��ۤ�
   *  
   *  @param folderId  ��ïID
   *  @return int      �R���ӬۥU�����Ҧ��ۤ��O�_���\
   */
  private int deletePhotoByFolderId(int folderId){
    int i = 0;
    StringBuffer sqlStr = new StringBuffer();
    sqlStr.append(" delete from photo where folderId = ? \n");
    System.out.println("********************************************************************************");
    System.out.println(FolderDao.class.getName()+",�R���ӬۥU�����Ҧ��ۤ��� SQL�G \n"+sqlStr.toString());
    System.out.println("�Ѽƭ�");
    System.out.println("01. folderId     = "+folderId);
    System.out.println("********************************************************************************");
    try{
      ps = dbc.getConn().prepareStatement(sqlStr.toString());
      ps.setInt(1,folderId);      
      i = ps.executeUpdate();
    }catch(Exception e){
      e.printStackTrace();
    }finally{
      try{
        if(ps!=null) { ps.close(); ps = null; }
      }catch(Exception e1){
        e1.printStackTrace();
      }
    }
    return i;  
  } // end deletePhotoByFolderId
  
  
  
  
  
  
  
  
  
  
}
