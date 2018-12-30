<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>

<%@ taglib uri="/struts-tags"       prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags"  prefix="sx"     %>

<%@ include file="/form/admin/header.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title><struts:text name="backstage.admin" /></title>
    <sx:head />
    <style>
      body{
	    background-image: url('/ch07_Struts2.1Sreg/images/bg.gif');
      }
    </style>
  </head>
  
  <body>
    
    <center>

      <font size="2" >
        <struts:text name="users.welcome" >
          <struts:param><struts:property value="adminname" /></struts:param>
        </struts:text>
      </font><br><br> 
      <font size="2" >
        <struts:a href="newusers.action" ><struts:text name="show.newusers"/></struts:a>
      </font><br><br> 
      <font size="2" >
        <struts:a href="findalluser.action?type=admin" ><struts:text name="find.allusers" /></struts:a>
      </font><br><br>
      <font size="2" >
        <struts:a href="findalladmin.action" ><struts:text name="find.alladmin"/></struts:a>
      </font>
    	
    
    </center>

    <div style="clear:both" ></div>
    
    <%@ include file="/footer.jsp" %>
 
  </body>
  
</html>