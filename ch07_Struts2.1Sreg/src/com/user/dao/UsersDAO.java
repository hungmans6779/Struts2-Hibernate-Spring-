package com.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.database.DataBaseDAO;
import com.vo.Users;


/*
 *  使用者 DAO 
 *  
 *  使用者資料庫操作類別
 *  
 */
public class UsersDAO {

  private Connection con;
  private PreparedStatement pt;
  private ResultSet rs;
  
  
  
  // 尋找使用者是否存在
  public boolean findUsers(String username){
	boolean flag = false; 
	  
	System.out.println(UsersDAO.class.getName()+",findUsers()... ");
	System.out.println("username = "+username);
	
	String sqlStr = "select * from users where username = ? ";
	System.out.println("尋找使用者是否存在 sql：\n"+sqlStr);
	  
	con = DataBaseDAO.getConnection(); // 獲得資料庫的連接
	try{
	  pt = con.prepareStatement(sqlStr);
	  pt.setString(1,username);
	  rs = pt.executeQuery();
	  flag = rs.next();
	}catch(SQLException e){
	  e.printStackTrace();	
	}finally{
	  DataBaseDAO.closeRs(rs);     // 關閉 ResultSet
	  pt = DataBaseDAO.closePt(pt);     // 關閉 PreparedStatement
	  con = DataBaseDAO.closeCon(con);  // 關閉 Connection
	}

	return flag;
  } // end findUsers
  
  
  
  
  
  
  
  
  // 使用者註冊
  public int save(Users users){
	int count = 0;
	  
	System.out.println(UsersDAO.class.getName()+",save()... ");
	System.out.println("users.getUsername() = "+users.getUsername());
		
	con = DataBaseDAO.getConnection();  // 獲得資料庫的連接
	try{
	  StringBuffer sqlStr =  new StringBuffer();
	  sqlStr.append("insert into users                                                 \n"); 
	  sqlStr.append("       (username,password,name,nic,sex,age,email,phone,selfshow)  \n"); 
	  sqlStr.append(" values(?,?,?,?,?,?,?,?,?)                                        \n"); 	  
		  
	  pt = con.prepareStatement(sqlStr.toString());
	  pt.setString(1,users.getUsername());
	  pt.setString(2,users.getPassword());
	  pt.setString(3,users.getName());
	  pt.setString(4,users.getNic());
	  pt.setString(5,users.getSex());
	  pt.setInt(6,users.getAge());
	  pt.setString(7,users.getEmail());
	  pt.setString(8,users.getPhone());
	  pt.setString(9,users.getSelfshow());
    
	  count = pt.executeUpdate();    // 執行sql敘述
    }catch(SQLException e){
	  e.printStackTrace();	
	}finally{
	  pt = DataBaseDAO.closePt(pt);     // 關閉 PreparedStatement
	  con = DataBaseDAO.closeCon(con);  // 關閉 Connection
    }
		
	return count;
  } // end save
  
  
  
  
  
  
  
  // 使用者登入的方法
  public boolean login(Users users){
	boolean flag = false;  // 設定識別字為 flag
	
	StringBuffer sqlStr = new StringBuffer();
	sqlStr.append("select * from users      \n");
	sqlStr.append(" where username = ?      \n");
	sqlStr.append("   and password = ?      \n");
	
	con = DataBaseDAO.getConnection();  // 取得連線物件
	try{
	  pt = con.prepareStatement(sqlStr.toString());
	  pt.setString(1,users.getUsername());
	  pt.setString(2,users.getPassword());
	  rs = pt.executeQuery();
	  flag = rs.next();
	}catch(Exception e){
	  e.printStackTrace();	
	}finally{
	  rs = DataBaseDAO.closeRs(rs);
	  pt = DataBaseDAO.closePt(pt);
	  con = DataBaseDAO.closeCon(con);
	}

	return flag;
  } // end login()
  
  
  
  
  
  
  
  // 檢視所有使用者的資訊
  public List findAllUsers(){
    
	List list = new ArrayList(); // 獲得一個 list 物件來增加所有使用者
	con = DataBaseDAO.getConnection();
	try{
	  pt = con.prepareStatement("select * from users "); 	
	  rs = pt.executeQuery();
	  Users users = null;
	  while(rs.next()){
		users = new Users();
		users.setId(rs.getInt("id"));
		users.setUsername(rs.getString("username"));
		users.setPassword(rs.getString("password"));
		users.setName(rs.getString("name"));
		users.setNic(rs.getString("nic"));
		users.setSex(rs.getString("sex"));
		users.setAge(rs.getInt("age"));
		users.setEmail(rs.getString("email"));
		users.setPhone(rs.getString("phone"));
		users.setSelfshow(rs.getString("selfshow"));
		
		list.add(users);
	  } // end while(rs.next()){
	}catch(SQLException e){
	  e.printStackTrace();
	}finally{
	  rs = DataBaseDAO.closeRs(rs);
	  pt = DataBaseDAO.closePt(pt);
	  con = DataBaseDAO.closeCon(con);	
	}
	 
	return list;
  } // end findAllUsers()
  
  
  
  
  
  
  // 檢視使用者個人資訊
  public Users selectInfo(String username){
	
	Users users = new Users();
	con = DataBaseDAO.getConnection();
	try{
	  pt = con.prepareStatement("select * from users where username = ? ");
	  pt.setString(1,username);
	  rs = pt.executeQuery();
	  if(rs.next()){
	    users.setId(rs.getInt("id"));
		users.setUsername(rs.getString("username"));
		users.setPassword(rs.getString("password"));
		users.setName(rs.getString("name"));
		users.setNic(rs.getString("nic"));
		users.setSex(rs.getString("sex"));
		users.setAge(rs.getInt("age"));
		users.setEmail(rs.getString("email"));
		users.setPhone(rs.getString("phone"));
		users.setSelfshow(rs.getString("selfshow"));
	  } // end if(rs.next()){
	}catch(SQLException e){
	  e.printStackTrace();	
	}finally{
	  rs = DataBaseDAO.closeRs(rs);
	  pt = DataBaseDAO.closePt(pt);
	  con = DataBaseDAO.closeCon(con);
	}
	  
	return users;
  } // end selectInfo
  
  
  
  
  
  
  // 修改個人資訊
  public int update(Users users){
	int i = 0;
	
	StringBuffer sqlStr = new StringBuffer();
	sqlStr.append("  update users                \n");
	sqlStr.append("     set password = ?,        \n");
	sqlStr.append("         name = ?,            \n");
	sqlStr.append("         nic = ?,             \n");
	sqlStr.append("         sex = ?,             \n");
	sqlStr.append("         age = ?,             \n");
	sqlStr.append("         email = ?,           \n");
	sqlStr.append("         phone = ?,           \n");
	sqlStr.append("         selfshow = ?         \n");
	sqlStr.append("   where username = ?         \n");
	sqlStr.append("     and id=  ?               \n");
	System.out.println("修改個人資訊 SQL 語法：\n"+sqlStr.toString());
	
	
	con = DataBaseDAO.getConnection();
	try{
	  pt = con.prepareStatement(sqlStr.toString());
	  pt.setString(1,users.getPassword());
	  pt.setString(2,users.getName());
	  pt.setString(3,users.getNic());
	  pt.setString(4,users.getSex());
	  pt.setInt(5,users.getAge());
	  pt.setString(6,users.getEmail());
	  pt.setString(7,users.getPhone());
	  pt.setString(8,users.getSelfshow());
	  pt.setString(9,users.getUsername());
	  pt.setInt(10,users.getId());
		
	  i = pt.executeUpdate();
	}catch(SQLException e){
	  e.printStackTrace();	
	}finally{
	  pt = DataBaseDAO.closePt(pt);
	  con = DataBaseDAO.closeCon(con);
	}
	
	return i;  
  } // end update
  
  
  
  
  
  
  // 刪除使用者
  public boolean deleteUser(int id){
	boolean flag = false;
	con = DataBaseDAO.getConnection();
	try{
	  pt = con.prepareStatement("delete from users where id = ? ");
	  pt.setInt(1,id);
	  int count = pt.executeUpdate();
	  flag = count > 0;
	}catch(SQLException e){
	  e.printStackTrace();
	}finally{
	  pt = DataBaseDAO.closePt(pt);
	  con = DataBaseDAO.closeCon(con);
	}
	
	return flag;
  } // end deleteUsed
  
  
  
  
  
  
  
  // 查看新增使用者
  public List listNewUsers(){
	List<Users> list = new ArrayList<Users>();
	
	con = DataBaseDAO.getConnection();
	try{
	  pt = con.prepareStatement("select * from users order by id desc  limit 0,8");	
	  rs = pt.executeQuery();
	  Users users = null; 
	  while(rs.next()){
		users = new Users();
			
		users.setId(rs.getInt("id"));
		users.setUsername(rs.getString("username"));
		users.setPassword(rs.getString("password"));
		users.setName(rs.getString("name"));
		users.setNic(rs.getString("nic"));
		users.setSex(rs.getString("sex"));
		users.setAge(rs.getInt("age"));
		users.setEmail(rs.getString("email"));
		users.setPhone(rs.getString("phone"));
		users.setSelfshow(rs.getString("selfshow"));
		
		list.add(users);
	  } // end while(rs.next()){
	  
	}catch(SQLException e){
	  e.printStackTrace();	
	}finally{
	  rs = DataBaseDAO.closeRs(rs);
	  pt = DataBaseDAO.closePt(pt);
	  con = DataBaseDAO.closeCon(con);
	}
	
	return list;  
  } // end listNewUsers
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  // 測試
  public static void main(String [] args){
	  
	UsersDAO userDAO = new UsersDAO();
	  	
	Users user = new Users();
	user.setUsername("kevin8");
	user.setPassword("1234");
	user.setName("洪嘉宏");
	user.setNic("自由人");	
	user.setSex("男");
	user.setAge(35);
	user.setEmail("hungmans6779@msn.com");
	user.setPhone("0986876892");
	user.setSelfshow("Web 程式設計師");
	  
	
	
	// 尋找使用者是否存在
	boolean flag = userDAO.findUsers(user.getUsername());  // 尋找使用者是否存在
	System.out.println("尋找使用者："+user.getUsername()+" 是否存在 flag = "+(flag?"已存在":"不存在"));
	
	
	System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
	
	
	
	// 使用者註冊
	if(!flag){
	  int count = userDAO.save(user); // 使用者註冊
	  System.out.println("使用者註冊 count = "+count);
	  if(count > 0){
		System.out.println("註冊成功...");  
	  }else{
		System.out.println("註冊失敗！！！");  
	  }
	  System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
	} // end if(!flag){
	
	
	
	
	
	
	// 使用者登入的方法
	Users userLogin = new Users();
	userLogin.setUsername("kevin14");
	userLogin.setPassword("1234");
	boolean loginFlag = userDAO.login(userLogin);
	System.out.println("使用者登入的方法："+userLogin.getUsername()+" 登入是否成功 loginFlag = "+(loginFlag?"【成功】":"【失敗】"));
	
	System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
	
	
  } // end main
  
  
}
