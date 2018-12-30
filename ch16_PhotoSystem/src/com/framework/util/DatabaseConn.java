package com.framework.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConn {

  private Connection conn;
  private final String DRIVER = "com.mysql.jdbc.Driver";
  private final String URL = "jdbc:mysql://localhost:3306/xc";


  /*
   *  �إ߳s�u
   */
  public Connection createConn() {
    try {
      Class.forName(DRIVER);
      conn = DriverManager.getConnection(URL, "root", "19786779");
    } catch (Exception e) {
      e.printStackTrace();
    }
    return conn;
  } // end createConn()


  
  /*
   *  ���o�s�u
   */
  public Connection getConn() {
    if (conn == null) {
      createConn();
    }
    return conn;
  } // end getConn()


  
  /*
   *  �����s�u
   */
  public void closeConn() {
    if (conn != null) {
      try {
        conn.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    conn = null;
  } // end closeConn


  
  
  
}
