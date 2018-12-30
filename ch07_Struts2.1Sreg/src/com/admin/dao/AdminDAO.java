package com.admin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.database.DataBaseDAO;
import com.vo.Admin;
import com.vo.Users;

/*
 *  系統管理者 DAO 
 *  
 *  系統管理者資料庫操作類別
 *  
 */
public class AdminDAO {

  private Connection con;
  private PreparedStatement pt;
  private ResultSet rs;
  
  
  // 尋找系統管理者名稱是否存在
  public boolean findAdmin(String username){
	boolean flag = false;
	
	con = DataBaseDAO.getConnection();
	try{
	  pt = con.prepareStatement("select * from admin where username = ? ");
	  pt.setString(1,username);
	  rs = pt.executeQuery();
	  flag = rs.next();
	}catch(SQLException e){
	  e.printStackTrace();
	}finally{
	  rs = DataBaseDAO.closeRs(rs);
	  pt = DataBaseDAO.closePt(pt);
	  con = DataBaseDAO.closeCon(con);
	}

	return flag;
  } // findAdmin
  
  
  
  
  
  // 增加新管理員
  public int save(Admin admin){
	int count = 0;
	
	StringBuffer sqlStr = new StringBuffer();
	sqlStr.append("  insert into admin                     \n");
	sqlStr.append("          (username,password,name,qx)   \n");
	sqlStr.append("    values(?,?,?,?)                     \n");
	con = DataBaseDAO.getConnection();
	try{
	  pt = con.prepareStatement(sqlStr.toString());
	  pt.setString(1,admin.getAdminname());
	  pt.setString(2,admin.getPassword());
	  pt.setString(3,admin.getName());
	  pt.setInt(4,admin.getQx());
	  
	  count = pt.executeUpdate();
	}catch(Exception e){
	  e.printStackTrace();
    }finally{
      pt = DataBaseDAO.closePt(pt);
      con = DataBaseDAO.closeCon(con);
    }
	
	return count;  
  } // end save
  
  
  
  // 管理員登入
  public boolean login(Admin admin){
	boolean flag = false;
	
	con = DataBaseDAO.getConnection();
	try{
	  pt = con.prepareStatement("select * from admin where username = ?  and password = ? ");	
	  pt.setString(1,admin.getAdminname());
	  pt.setString(2,admin.getPassword());
	  rs = pt.executeQuery();
	  if(rs.next()){
		flag = true;
		admin.setQx(rs.getInt("qx"));
	  }
	}catch(SQLException e){
	  e.printStackTrace();	
	}finally{
	  rs = DataBaseDAO.closeRs(rs);
	  pt = DataBaseDAO.closePt(pt);
	  con = DataBaseDAO.closeCon(con);
	}
	
	return flag;
  }  // end login
  
  
  
  // 檢視所有管理者
  public List findAllAdmin(){
	//  儲存系統管理者的 List 物件
    List <Admin>list = new ArrayList<Admin>();
    con = DataBaseDAO.getConnection();
    try{
      pt = con.prepareStatement("select * from admin ");	
      rs = pt.executeQuery();
      Admin admin = null;
      while(rs.next()){
    	admin = new Admin();
    	admin.setId(rs.getInt("id"));
    	admin.setAdminname(rs.getString("username"));
    	admin.setPassword(rs.getString("password"));
    	admin.setName(rs.getString("name"));
    	admin.setQx(rs.getInt("qx"));
    	
    	list.add(admin);
      }
    }catch(SQLException e){
      e.printStackTrace();
    }finally{
      rs = DataBaseDAO.closeRs(rs);
      pt = DataBaseDAO.closePt(pt);
      con = DataBaseDAO.closeCon(con);
    }
    
    return list;
  } // end findAllAdmin
  
  
  
  
  
  
  // 得到某個管理員的資訊
  public Admin selectInfo(String id){
	Admin admin = null;
	con = DataBaseDAO.getConnection();
	try{
	  pt = con.prepareStatement("select * from admin where id = ? ");
	  pt.setString(1,id);
	  rs = pt.executeQuery();
	  if(rs.next()){
	    admin = new Admin();
		admin.setId(rs.getInt("id"));
	    admin.setAdminname(rs.getString("username"));
	    admin.setPassword(rs.getString("password"));
	    admin.setName(rs.getString("name"));
	    admin.setQx(rs.getInt("qx"));
	  }
	  
	}catch(SQLException e){
	  e.printStackTrace();	
	}finally{
	  rs = DataBaseDAO.closeRs(rs);
	  pt = DataBaseDAO.closePt(pt);
	  con = DataBaseDAO.closeCon(con);		
	}
	
    return admin;
  } // end selectInfo
  
  
  
  
  // 修改管理者資訊
  public int update(Admin admin){
	int i = 0;
	
	StringBuffer sqlStr = new StringBuffer();
	sqlStr.append("  update admin                \n");
	sqlStr.append("     set password = ?,        \n");
	sqlStr.append("         name = ?,            \n");
	sqlStr.append("         qx = ?               \n");
	sqlStr.append("   where username = ?         \n");
	sqlStr.append("     and id=  ?               \n");
	System.out.println("修改管理者資訊 SQL 語法：\n"+sqlStr.toString());

	con = DataBaseDAO.getConnection();
	try{
	  pt = con.prepareStatement(sqlStr.toString());
	  pt.setString(1,admin.getPassword());
	  pt.setString(2,admin.getName());
	  pt.setInt(3,admin.getQx());
	  pt.setString(4,admin.getAdminname());
	  pt.setInt(5,admin.getId());
	  i = pt.executeUpdate();
	}catch(SQLException e){
	  e.printStackTrace();	
	}finally{
	  pt = DataBaseDAO.closePt(pt);
	  con = DataBaseDAO.closeCon(con);
	}
	
	return i;  
  } // end update
  
  
  
  
  
  
  // 刪除系統管理員  
  public boolean deleteAdmin(int id){
	boolean flag = false;
	
	con = DataBaseDAO.getConnection();
	try{
	  pt = con.prepareStatement("delete from admin where id = ? ");
	  pt.setInt(1,id);
	  int count = pt.executeUpdate();
	  flag = count > 0 ;
	}catch(SQLException e){
	  e.printStackTrace();	
	}finally{
	  pt = DataBaseDAO.closePt(pt);
	  con = DataBaseDAO.closeCon(con);	
	}
	
	return flag;
  } // end deleteAdmin
  
  
  
}
