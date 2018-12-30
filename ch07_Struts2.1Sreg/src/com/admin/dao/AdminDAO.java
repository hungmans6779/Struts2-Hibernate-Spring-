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
 *  �t�κ޲z�� DAO 
 *  
 *  �t�κ޲z�̸�Ʈw�ާ@���O
 *  
 */
public class AdminDAO {

  private Connection con;
  private PreparedStatement pt;
  private ResultSet rs;
  
  
  // �M��t�κ޲z�̦W�٬O�_�s�b
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
  
  
  
  
  
  // �W�[�s�޲z��
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
  
  
  
  // �޲z���n�J
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
  
  
  
  // �˵��Ҧ��޲z��
  public List findAllAdmin(){
	//  �x�s�t�κ޲z�̪� List ����
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
  
  
  
  
  
  
  // �o��Y�Ӻ޲z������T
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
  
  
  
  
  // �ק�޲z�̸�T
  public int update(Admin admin){
	int i = 0;
	
	StringBuffer sqlStr = new StringBuffer();
	sqlStr.append("  update admin                \n");
	sqlStr.append("     set password = ?,        \n");
	sqlStr.append("         name = ?,            \n");
	sqlStr.append("         qx = ?               \n");
	sqlStr.append("   where username = ?         \n");
	sqlStr.append("     and id=  ?               \n");
	System.out.println("�ק�޲z�̸�T SQL �y�k�G\n"+sqlStr.toString());

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
  
  
  
  
  
  
  // �R���t�κ޲z��  
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
