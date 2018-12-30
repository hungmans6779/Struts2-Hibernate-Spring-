<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>

<%@ taglib uri="/struts-tags"       prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags"  prefix="sx"     %>

<%@ include file="/form/admin/header.jsp" %>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title><struts:text name="delete.success" /></title>
    <sx:head />
    <link href="/ch07_Struts2.1Sreg/css/main.css" type="text/css" rel="stylesheet" >
    <style>
      body{
	   background-color:#7BA5EA;
      }
    </style>
  </head>
  
  <body>
    
    <center>
      <font size="3" ><struts:property value="tip" /></font>
    </center>
 
    <div style="clear:both" ></div>
 
    <%@ include file="/footer.jsp" %>
  
  </body>
  
</html>