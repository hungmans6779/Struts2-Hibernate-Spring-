package com.framework.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.framework.entity.User;
import com.framework.util.DatabaseConn;

/*
 *  �ϥΪ� DAO 
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
   *  �P�_�ϥΪ̦W�٬O�_�s�b
   *  
   *  @userName �ϥΪ̦W��
   *  @return boolean �O�_�s�b�ӨϥΪ�
   */
  public boolean findUsers(String userName){
    boolean flag = true;
      
    StringBuffer sqlStr = new StringBuffer();
    sqlStr.append("select * from user where userName = ? ");
    System.out.println("****************************************************************");
    System.out.println(UserDao.class.getName());
    System.out.println("findUsers Method SQL �y�k�G\n"+sqlStr.toString());
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
   *  �ϥΪ̵��U���\�A�V��ƪ��W�[����
   *  
   *  @param userName      �ϥΪ̦W��
   *  @param userPassword  �ϥΪ̱K�X
   *  @param userSex       �ʧO
   *  @param userBirthday  �ͤ�
   *  @param userTelephone �q��
   *  @param userEmail     �q�l�l��
   *  @param userAddress   �a�} 
   *  @param userRemark    ²��
   *  
   *  @return userId       �ϥΪ�ID
   */
  public int saveUser(String userName,String userPassword,String userSex,String userBirthday,String userTelephone,String userEmail,String userAddress,String userRemark){
    int userId = 0;
    int i = 0;
    StringBuffer sqlStr = new StringBuffer();
    sqlStr.append("insert into user values(null,?,?,?,?,?,?,?,?) ");
    System.out.println("****************************************************************");
    System.out.println(UserDao.class.getName());
    System.out.println("saveUser Method SQL �y�k�G\n"+sqlStr.toString());
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
     
      userId = findUserId(userName);  // �M��ϥΪ� userId 
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
   *  �M��ϥΪ� userId
   *  
   *  @ param userName   �ϥΪ̦W��
   *  @ return userId    �ϥΪ�ID
   */
  private int findUserId(String userName){
    int userId = 0;
    int i = 0;
    StringBuffer sqlStr = new StringBuffer();
    System.out.println("****************************************************************");
    System.out.println(UserDao.class.getName());
    sqlStr.append("select userId from user where userName = ? ");
    System.out.println("findUserId Method SQL �y�k�G\n"+sqlStr.toString());
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
   *  �ϥΪ̵n�J�A�P�_�ϥΪ̦W�٩M�K�X�O�_���T
   *  
   *  @param userName      �ϥΪ̦W��
   *  @param userPassword  �ϥΪ̱K�X
   *  
   *  @return boolean      �P�_�ϥΪ̦W�٩M�K�X�O�_���T
   */
  public boolean loginByNP(String userName,String userPassword){
    boolean flag = true;
    StringBuffer sqlStr = new StringBuffer();
    sqlStr.append("  select * from user                     \n");
    sqlStr.append("   where userName = ?                    \n");
    sqlStr.append("     and userPassword = ?                \n");
    System.out.println("****************************************************************");
    System.out.println(UserDao.class.getName());
    System.out.println("loginByNP Method SQL �y�k�G\n"+sqlStr.toString());
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
   *  �ھڨϥΪ̦W�٬d�ߨϥΪ̸�T
   *  
   *  @param userName �ϥΪ̦W��
   *  @return User    �ϥΪ̪���
   */
  public User getUserByName(String userName){
    User user = null;
    StringBuffer sqlStr = new StringBuffer();
    sqlStr.append("select * from user where userName = ? ");
    System.out.println("****************************************************************");
    System.out.println(UserDao.class.getName());
    System.out.println("getUserByName Method SQL �y�k�G\n"+sqlStr.toString());
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
