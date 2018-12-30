package com.framework.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.framework.entity.Photo;
import com.framework.util.DatabaseConn;


/*
 *  �ۤ��� DAO
 */
public class PhotoDao {

  private DatabaseConn dbc;

  public DatabaseConn getDbc() {
    return dbc;
  }

  public void setDbc(DatabaseConn dbc) {
    this.dbc = dbc;
  }
  
  
  private PreparedStatement ps;
  private ResultSet rs;
  
  
  
  /*
   *  �P�_�ϥΪ�id�d�ߨϥΪ̹Ϥ��O�_�s�b
   */
  public boolean findPhoto(String userId){
    boolean flag = false;   
    StringBuffer sqlStr = new StringBuffer();
    sqlStr.append(" select b.photoId,b.photoName,b.photoInfo,b.folderId  \n");
    sqlStr.append("   from folder a,photo b                              \n");
    sqlStr.append("  where 1 = 1                                         \n");
    sqlStr.append("    and b.folderId = a.folderId                       \n");
    sqlStr.append("    and a.userId = ?                                  \n");
    
    System.out.println("�P�_�ϥΪ�id�d�ߨϥΪ̹Ϥ��O�_�s�b SQL�G \n"+sqlStr.toString());
    System.out.println("�Ѽƭ�");
    System.out.println("01. userId = "+userId);
    
    try{
      ps = dbc.getConn().prepareStatement(sqlStr.toString());
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
  } // end findPhoto
  
  
  
  
  
  
  
  
  
  /*
   *  �x�s�Ϥ�
   *  
   *  @param photoName    �Ϥ��W��
   *  @param folderId     ��ïID
   */
  public int savePhoto(String photoName,String photoInfo,int folderId){
    int photoId = 0;
    
    StringBuffer sqlStr = new StringBuffer();
    sqlStr.append(" insert into photo value(null,?,?,?)  \n");
    System.out.println("�x�s�Ϥ� SQL�G \n"+sqlStr.toString());
    System.out.println("�Ѽƭ�");
    System.out.println("01. photoName = "+photoName);
    System.out.println("02. photoInfo = "+photoInfo);
    System.out.println("03. folderId  = "+folderId);
    
    try{
      ps = dbc.getConn().prepareStatement(sqlStr.toString());
      ps.setString(1,photoName);
      ps.setString(2,photoInfo);
      ps.setInt(3,folderId);
      int i = ps.executeUpdate();
      photoId = (i!=0)?findMaxPhotoId():photoId;
      
    }catch(Exception e){
      e.printStackTrace();     
    }finally{
      try{
        if(ps!=null) { ps.close(); ps = null; }
      }catch(Exception e1){
        e1.printStackTrace();
      }
    } 
    return photoId;
  } // end savePhoto
  
  
  
  
  
  
  
  
  
  /*
   *  ��M�Ϥ����ثe�̷s�� photoId
   *  
   *  @return photoId
   */
  public int findMaxPhotoId(){
    int photoId = 0 ;
    StringBuffer sqlStr = new StringBuffer();
    sqlStr.append(" select max(photoId) from photo   \n");
    System.out.println("��M�Ϥ����ثe�̷s�� photoId SQL�G \n"+sqlStr.toString());
    
    try{
      ps = dbc.getConn().prepareStatement(sqlStr.toString());
      rs = ps.executeQuery();
      photoId = rs.next()?rs.getInt(1):photoId;
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
    return photoId;
  } // end findMaxPhotoId
  
  
  
  
  
  
  
  
  
  /*
   *  �d�ߨϥΪ̬Y�ӬۥU�����Ϥ��ƶq 
   *  
   *  @param folderId    ��ïID
   */
  public int picNum(int folderId){
    int i = 0 ;
    StringBuffer sqlStr = new StringBuffer();
    sqlStr.append("select count(*) from photo where folderId = ?   ");
    System.out.println("�d�ߨϥΪ̬Y�ӬۥU�����Ϥ��ƶq SQL�G \n"+sqlStr.toString());
    System.out.println("�Ѽƭ�");
    System.out.println("01. folderId = "+folderId);
    
    try{
      ps = dbc.getConn().prepareStatement(sqlStr.toString());
      ps.setInt(1,folderId);
      rs = ps.executeQuery();
      i = rs.next()?rs.getInt(1):0;
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
    return i;
  } // end picNum
  
  
  
  
  
  
  
  
  
  /*
   *  �����A�Ǧ^�ثe���ƩM�`����
   *  
   *  @param picAmout
   *  @param pageNumberStr
   *  @param pageSize
   *  
   *  @return int[]
   */
  public int [] pageNumber(int picAmount,String pageNumberStr,int pageSize){
    int [] paging = new int[2];
    int totalPage = (picAmount > 0)? (picAmount % pageSize == 0 ?(picAmount/pageSize):(picAmount/pageSize + 1)):1;
    
    int pageNumber = Integer.parseInt(pageNumberStr);
        pageNumber = (pageNumber <=0)?1:pageNumber;                     // �̤p�������b
        pageNumber = (pageNumber > totalPage) ? totalPage :pageNumber;  // �̤j�������b
    
    paging[0] = pageNumber;
    paging[1] = totalPage;
    
    return paging;
  } // end pageNumber
  
  
  
  
  
  
  
  
  
  /*
   *  �d�߬Y�ӬۥU���Ҧ��Ϥ�
   *  
   *  @param folderId
   *  @pageNumber
   *  @pageSize
   *  
   *  @return List<Photo>
   */
  public List<Photo> folderPic(int folderId,int pageNumber,int pageSize){
    List <Photo> list = new ArrayList<Photo>();
    
    String sql = "select * from photo where folderId = ? limit "+ pageSize * (pageNumber - 1) + "," + pageSize;
    System.out.println("*****************************************************************************");
    System.out.println("�d�߬Y�ӬۥU���Ҧ��Ϥ� SQL�G \n"+sql);
    System.out.println("�Ѽƭ�");
    System.out.println("01. folderId = "+folderId);

    try{
      ps = dbc.getConn().prepareStatement(sql);
      ps.setInt(1,folderId);
      rs = ps.executeQuery();
      Photo photo = null;
      while(rs.next()){
        photo = new Photo();
        photo.setFolderId(folderId);
        photo.setPhotoId(rs.getInt("photoId"));
        photo.setPhotoName(rs.getString("photoName"));
        photo.setPhotoInfo(rs.getString("photoInfo"));
        
        System.out.println("���G���G");
        System.out.println("folderId  = "+folderId);
        System.out.println("photoId   = "+rs.getInt("photoId"));
        System.out.println("photoName = "+rs.getString("photoName"));
        System.out.println("photoInfo = "+rs.getString("photoInfo"));
        

        list.add(photo);
      } // end  while(rs.next()){
      
      System.out.println("list size = "+list.size());
      System.out.println("*****************************************************************************");
      
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
  } // end folderPic
  
  
  
  
  
  
  
  
  
  /*
   *  �R����ƪ����Ϥ���T
   * 
   *  @param folderId ��ïID
   *  @param photoId  �Ϥ�ID
   *  
   *  @return int  �P�_�R����ƪ����Ϥ���T�O�_���\
   */
  public int deletePic(int folderId,int photoId){
    int i = 0;
    StringBuffer sqlStr = new StringBuffer();
    sqlStr.append(" delete from photo      \n");
    sqlStr.append("  where folderId = ?    \n");
    sqlStr.append("    and photoId = ?     \n");
    System.out.println("********************************************************************************");
    System.out.println("�R����ƪ����Ϥ���T SQL�G \n"+sqlStr.toString());
    System.out.println("�Ѽƭ�");
    System.out.println("01. folderId = "+folderId);
    System.out.println("02. photoId  = "+photoId);
    System.out.println("********************************************************************************");
    try{
      ps = dbc.getConn().prepareStatement(sqlStr.toString());
      ps.setInt(1,folderId);
      ps.setInt(2,photoId);
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
  } // end deletePic
  
  
  
  
  
  
  
  
  
  /*
   * �d�߬Y�ӬۥU���Ϥ��A�����ۥU�ʭ� 
   * 
   * @param folderId  ��ïID
   */
  public Photo folderPicName(int folderId){
    Photo photo = new Photo();
    StringBuffer sqlStr = new StringBuffer();
    sqlStr.append(" select max(photoId) from photo  \n");
    sqlStr.append("  where folderId = ?             \n");
    System.out.println("********************************************************************************");
    System.out.println("�d�߬Y�ӬۥU���Ϥ��A�����ۥU�ʭ� SQL�G \n"+sqlStr.toString());
    System.out.println("�Ѽƭ�");
    System.out.println("01. folderId = "+folderId);
    System.out.println("********************************************************************************");
    try{
      ps = dbc.getConn().prepareStatement(sqlStr.toString());
      ps.setInt(1,folderId);
      rs = ps.executeQuery();
      while(rs.next()){
        photo.setFolderId(rs.getInt("photoId"));
        photo.setPhotoName(rs.getString("photoName"));
        photo.setPhotoInfo(rs.getString("photoInfo"));
      } // end  while(rs.next()){
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
    return photo;
  } // end folderPicName
  
  
  
  
}
