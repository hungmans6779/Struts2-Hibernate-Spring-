package com.framework.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.framework.entity.User;
import com.framework.util.DatabaseConn;

/*
 *  使用者 DAO 
 */
public class UserDao {

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
   *  判斷使用者名稱是否存在
   *  
   *  @userName 使用者名稱
   *  @return boolean 是否存在該使用者
   */
  public boolean findUsers(String userName){
    boolean flag = true;
      
    StringBuffer sqlStr = new StringBuffer();
    sqlStr.append("select * from user where userName = ? ");
    System.out.println("****************************************************************");
    System.out.println(UserDao.class.getName());
    System.out.println("findUsers Method SQL 語法：\n"+sqlStr.toString());
    System.out.println("****************************************************************");
    
    try{
      ps = dbc.getConn().prepareStatement(sqlStr.toString());
      ps.setString(1,userName);
      rs = ps.executeQuery();
      flag = rs.next();    
    }catch(Exception e){
      e.printStackTrace(); 
    }finally{
      try{
        if(rs!=null) { rs.close();  rs = null; }
        if(ps!=null) { ps.close();  ps = null; }
      }catch(Exception e1){
        e1.printStackTrace();
      }
    }
    return flag;
  } // end findUsers
  
  
  
  
  
  
  
  
  
  
  /*
   *  使用者註冊成功，向資料表中增加紀錄
   *  
   *  @param userName      使用者名稱
   *  @param userPassword  使用者密碼
   *  @param userSex       性別
   *  @param userBirthday  生日
   *  @param userTelephone 電話
   *  @param userEmail     電子郵件
   *  @param userAddress   地址 
   *  @param userRemark    簡介
   *  
   *  @return userId       使用者ID
   */
  public int saveUser(String userName,String userPassword,String userSex,String userBirthday,String userTelephone,String userEmail,String userAddress,String userRemark){
    int userId = 0;
    int i = 0;
    StringBuffer sqlStr = new StringBuffer();
    sqlStr.append("insert into user values(null,?,?,?,?,?,?,?,?) ");
    System.out.println("****************************************************************");
    System.out.println(UserDao.class.getName());
    System.out.println("saveUser Method SQL 語法：\n"+sqlStr.toString());
    System.out.println("****************************************************************");
    try{
      ps = dbc.getConn().prepareStatement(sqlStr.toString());
      ps.setString(1,userName);
      ps.setString(2,userPassword);
      ps.setString(3,userSex);
      ps.setString(4,userBirthday);
      ps.setString(5,userTelephone);
      ps.setString(6,userEmail);
      ps.setString(7,userAddress);
      ps.setString(8,userRemark);
      
      i = ps.executeUpdate();
     
      userId = findUserId(userName);  // 尋找使用者 userId 
    }catch(Exception e){
      e.printStackTrace();
    }finally{
      try{
        if(rs!=null)  { rs.close();   rs = null;  }
        if(ps!=null)  { ps.close();   ps = null;  }
      }catch(Exception e1){
        e1.printStackTrace();
      }
    }
    return userId;
  } // end saveUser
  
  
  
  
  
  
  
  
  
  
  /*
   *  尋找使用者 userId
   *  
   *  @ param userName   使用者名稱
   *  @ return userId    使用者ID
   */
  private int findUserId(String userName){
    int userId = 0;
    int i = 0;
    StringBuffer sqlStr = new StringBuffer();
    System.out.println("****************************************************************");
    System.out.println(UserDao.class.getName());
    sqlStr.append("select userId from user where userName = ? ");
    System.out.println("findUserId Method SQL 語法：\n"+sqlStr.toString());
    System.out.println("****************************************************************");
    
    try{
      ps = dbc.getConn().prepareStatement(sqlStr.toString());
      ps.setString(1,userName);
      
      rs = ps.executeQuery();
      if(rs.next()){
        userId = rs.getInt(1);
        System.out.println("userId = "+userId);
      }
    }catch(Exception e){
      e.printStackTrace();
    }finally{
      try{
        if(rs!=null)  { rs.close();   rs = null;  }
        if(ps!=null)  { ps.close();   ps = null;  }
      }catch(Exception e1){
        e1.printStackTrace();
      }
    }
    return userId;
  } // end findUserId
  
  
  
  
  
  
  
  
  
  
  /*
   *  使用者登入，判斷使用者名稱和密碼是否正確
   *  
   *  @param userName      使用者名稱
   *  @param userPassword  使用者密碼
   *  
   *  @return boolean      判斷使用者名稱和密碼是否正確
   */
  public boolean loginByNP(String userName,String userPassword){
    boolean flag = true;
    StringBuffer sqlStr = new StringBuffer();
    sqlStr.append("  select * from user                     \n");
    sqlStr.append("   where userName = ?                    \n");
    sqlStr.append("     and userPassword = ?                \n");
    System.out.println("****************************************************************");
    System.out.println(UserDao.class.getName());
    System.out.println("loginByNP Method SQL 語法：\n"+sqlStr.toString());
    System.out.println("****************************************************************");
    
    try{
      ps = dbc.getConn().prepareStatement(sqlStr.toString());
      ps.setString(1,userName);
      ps.setString(2,userPassword);
      rs = ps.executeQuery();
      flag = rs.next();
    }catch(Exception e){
      e.printStackTrace();
    }finally{
      try{
        if(rs!=null)  { rs.close();   rs = null;  }
        if(ps!=null)  { ps.close();   ps = null;  }
      }catch(Exception e1){
        e1.printStackTrace();
      }   
    }
    return flag;
  } // end loginByNP
  
  
  
  
  
  
  
  
  
  /*
   *  根據使用者名稱查詢使用者資訊
   *  
   *  @param userName 使用者名稱
   *  @return User    使用者物件
   */
  public User getUserByName(String userName){
    User user = null;
    StringBuffer sqlStr = new StringBuffer();
    sqlStr.append("select * from user where userName = ? ");
    System.out.println("****************************************************************");
    System.out.println(UserDao.class.getName());
    System.out.println("getUserByName Method SQL 語法：\n"+sqlStr.toString());
    System.out.println("****************************************************************");
    
    try{
      ps = dbc.getConn().prepareStatement(sqlStr.toString());
      ps.setString(1,userName);
      rs = ps.executeQuery();
      if(rs.next()){
        user = new User();
        user.setUserId(rs.getInt(1));
        user.setUserName(rs.getString("userName"));
        user.setUserPassword(rs.getString("userPassword"));
        user.setUserSex(rs.getString("userSex"));
        user.setUserBirthday(rs.getString("userBirthday"));
        user.setUserTelephone(rs.getString("userTelephone"));
        user.setUserEmail(rs.getString("userEmail"));
        user.setUserAddress(rs.getString("userAddress"));
        user.setUserRemark(rs.getString("userRemark"));
      } // end if(rs.next()){
    }catch(Exception e){
      e.printStackTrace();
    }finally{
      try{
        if(rs!=null)  { rs.close();   rs = null;  }
        if(ps!=null)  { ps.close();   ps = null;  }
      }catch(Exception e1){
        e1.printStackTrace();
      }   
    }
    return user;
  } // end getUserByName
  
  
  
  
  
  
}
