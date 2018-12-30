package com.dao.database;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Properties;

import com.vo.Users;


/*
 *  資料庫連結設定 for MySQL
 */
public class DataBaseDAO {

  private static Connection con = null;                                                         // 連接物件
  
  /*
  private static final String DRIVER = "com.mysql.jdbc.Driver";                                    // 資料庫驅
  private static final String url = "jdbc:mysql://localhost:3306/reg?characterEncoding=UTF-8";     // 連接資料庫的URL，指定資料庫 reg
  private static final String NAME = "root";                                                       // MySQL 的使用者名稱
  private static final String PASSWORD = "19786779";                                               // MySQL 的使用者密碼
  */
  
  private static String DRIVER = "";      // 資料庫驅
  private static String url = "";         // 連接資料庫的URL，指定資料庫 reg
  private static String NAME = "";        // MySQL 的使用者名稱
  private static String PASSWORD = "";    // MySQL 的使用者密碼
  
  
  
  // 類似單例模式，載入一次即可獲得驅動
  static{
	  
	Properties p = new Properties();
	InputStream ins = null;
	
	try{
      ins = DataBaseDAO.class.getResourceAsStream("dataBase.properties");
      p.load(ins);
      
      DRIVER = p.getProperty("DRIVER").trim();
      url = p.getProperty("url").trim();
      NAME = p.getProperty("NAME").trim();
      PASSWORD = p.getProperty("PASSWORD").trim();
      
      System.out.println("******************************************************************************");
      System.out.println(DataBaseDAO.class.getName()+",static ");
	  System.out.println("01.DRIVER   = "+DRIVER);
	  System.out.println("02.url      = "+url);
	  System.out.println("03.NAME     = "+NAME);
	  System.out.println("04.PASSWORD = "+PASSWORD);
      System.out.println("******************************************************************************");
      
      
	  Class.forName(DRIVER);  // 載入驅動
	}catch(ClassNotFoundException e){
	  e.printStackTrace();
	}catch(Exception e1){
      e1.printStackTrace();	
	}finally{
	  try{
        if(ins !=null ){ ins.close();  ins = null; }		
	  }catch(Exception e1){
		e1.printStackTrace(); 
	  }
	}
  } // static
  
  
  
  
  // 獲得資料庫的連接
  public static Connection getConnection(){
	try{
	  con = DriverManager.getConnection(url,NAME,PASSWORD);	
	}catch(SQLException e){
	  e.printStackTrace();	
	}
	return con;
  } // end getConnection
  
  
  
  
  // 關閉 Connection
  public static Connection closeCon(Connection con){
	try{
	  if(con!=null) { con.close();  con = null; }	  
	}catch(SQLException e){
	  e.printStackTrace();	
	}
	return con;
  } // end closeCon
  
  
  
  
  // 關閉 PreparedStatement
  public static PreparedStatement closePt(PreparedStatement pt){
	try{
	  if(pt!=null) { pt.close();  pt = null; }	  
	}catch(SQLException e){
	  e.printStackTrace();	
	}
	return pt;
  } // end closePt
  
  
  
  
  // 關閉 ResultSet
  public static ResultSet closeRs(ResultSet rs){
	try{
	  if(rs!=null) { rs.close();  rs = null; }	  
	}catch(SQLException e){
	  e.printStackTrace();	
	}
	return rs;
  } // end closeRs
    
  
  
  
  
  
  // 測試
  public static void main(String [] args){
	
	StringBuffer sqlStr = new StringBuffer();
	
	sqlStr.append("SELECT * FROM users  \n");
	
	PreparedStatement ps = null;
	ResultSet rs = null;
	Collection<Users> col = new ArrayList<Users>();
	
	try{
      con = getConnection();  
      ps = con.prepareStatement(sqlStr.toString());
      rs = ps.executeQuery();
      Users user = null;
      while(rs.next()){
    	user = new Users();  
    	user.setId(Integer.parseInt(rs.getString("id")));
    	user.setUsername(rs.getString("username"));
    	user.setPassword(rs.getString("password"));
    	user.setName(rs.getString("name"));
    	user.setNic(rs.getString("nic"));
    	user.setSex(rs.getString("sex"));
    	user.setAge(Integer.parseInt(rs.getString("age")));
    	user.setEmail(rs.getString("email"));
    	user.setPhone(rs.getString("phone"));
    	user.setSelfshow(rs.getString("selfshow"));
    	col.add(user);
      } // end while(rs.next()){
      
      
      
      System.out.println("******************************************************************************");
      System.out.println(DataBaseDAO.class.getName()+",main() execute... ");
      
      Iterator itCol = col.iterator();
      while(itCol.hasNext()){
    	user = (Users) itCol.next();

    	System.out.println("id       = "+user.getId());
    	System.out.println("username = "+user.getUsername());
    	System.out.println("password = "+user.getPassword());
    	System.out.println("name     = "+user.getName());
    	System.out.println("nic      = "+user.getNic());
    	System.out.println("sex      = "+user.getSex());
    	System.out.println("age      = "+user.getAge());
    	System.out.println("email    = "+user.getEmail());
    	System.out.println("phone    = "+user.getPhone());
    	System.out.println("selfshow = "+user.getSelfshow());
 
    	System.out.println("\n");
      } // end while(itCol.hasNext()){
      System.out.println("******************************************************************************");
      
	}catch(Exception e){
	  e.printStackTrace();	
	}finally{
	  rs = closeRs(rs);
      ps = closePt(ps);
      con = closeCon(con);
	}
	
  } // end main()
  
  
  
}
