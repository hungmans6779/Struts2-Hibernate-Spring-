package com.framework.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.framework.entity.Folder;
import com.framework.util.DatabaseConn;

/*
 *  相冊表 DAO
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
   *  判斷相冊名稱是否存在
   *  
   *  @param folderId 相簿ID
   *  @return boolean 判斷相冊名稱是否存在
   */
  public boolean findFolder(int folderId){
    boolean flag = false;
    
    StringBuffer sqlStr = new StringBuffer();
    sqlStr.append("  select * from folder  \n");
    sqlStr.append("   where folderId = ?   \n");
    System.out.println("********************************************************************************");
    System.out.println(FolderDao.class.getName()+",判斷相冊名稱是否存在的 SQL： \n"+sqlStr.toString());
    System.out.println("參數值");
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
   *  增加相冊資訊
   *  
   *  @param folderName  相簿名
   *  @param folderInfo  相簿說明
   *  @param userId      使用者ID
   *  @return int        增加資訊的筆數
   */
  public int saveFolder(String folderName,String folderInfo,int userId){
    int i = 0;
    StringBuffer sqlStr = new StringBuffer();
    sqlStr.append(" insert into folder values(null,?,?,?)  \n");
    System.out.println("********************************************************************************");
    System.out.println(FolderDao.class.getName()+",增加相冊資訊的 SQL： \n"+sqlStr.toString());
    System.out.println("參數值");
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
   *  該使用者的所有的相冊
   *  
   *  @param userId          使用者ID
   *  @return List<Folder>   所有使用者的相冊
   */
  public List<Folder> allFolders(int userId){
    List<Folder> list = new ArrayList<Folder>();
    StringBuffer sqlStr = new StringBuffer();
    sqlStr.append(" select * from folder where userId = ?  \n");
    System.out.println("********************************************************************************");
    System.out.println(FolderDao.class.getName()+",該使用者的所有的相冊的 SQL： \n"+sqlStr.toString());
    System.out.println("參數值");
    System.out.println("01. userId     = "+userId);
    System.out.println("********************************************************************************");
    try{
      ps = dbc.getConn().prepareStatement(sqlStr.toString());
      ps.setInt(1,userId);      
      rs = ps.executeQuery();
      Folder folder = null;
      while(rs.next()){
        folder = new Folder();
        folder.setFolderId(rs.getInt("folderId"));         // 相簿ID
        folder.setFolderName(rs.getString("folderName"));  // 相簿名
        folder.setFolderInfo(rs.getString("folderInfo"));  // 相簿說明
        
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
   *  刪除相冊
   *  
   *  @param folderId  相簿ID
   *  @return int      刪除相冊是否成功
   */
  public int deleteFolder(int folderId){
    int i = 0;
    
    // 刪除該相冊內的所有相片
    int deletePhotoResult = deletePhotoByFolderId(folderId);
    System.out.println("刪除該相冊內的所有相片 deletePhotoResult = "+deletePhotoResult);
    
    int picNum = new PhotoDao().picNum(folderId);
    if(picNum == 0){  
      try{
        StringBuffer sqlStr = new StringBuffer();
        sqlStr.append(" delete from folder where folderId = ?  \n");
        System.out.println("********************************************************************************");
        System.out.println(FolderDao.class.getName()+",刪除相冊的 SQL： \n"+sqlStr.toString());
        System.out.println("參數值");
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
   *  刪除該相冊內的所有相片
   *  
   *  @param folderId  相簿ID
   *  @return int      刪除該相冊內的所有相片是否成功
   */
  private int deletePhotoByFolderId(int folderId){
    int i = 0;
    StringBuffer sqlStr = new StringBuffer();
    sqlStr.append(" delete from photo where folderId = ? \n");
    System.out.println("********************************************************************************");
    System.out.println(FolderDao.class.getName()+",刪除該相冊內的所有相片的 SQL： \n"+sqlStr.toString());
    System.out.println("參數值");
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
