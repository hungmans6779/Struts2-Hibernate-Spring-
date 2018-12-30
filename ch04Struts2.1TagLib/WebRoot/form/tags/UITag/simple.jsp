<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<%@ page import="java.util.*" %>

<%@ taglib uri="/struts-tags"      prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags" prefix="sx"     %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'simple.jsp' starting page</title>
    <style>
      body {
	    background-image: url("/ch04Struts2.1TagLib/images/bg-0291.gif");
      }
    </style>
  </head>
  
  <body>
  
    <struts:form action="addUser" namespace="/ch04TagLibNS" theme="simple" >
      
      <struts:textfield name="loginname" label="登入名稱" />
      <struts:password  name="password"  label="登入密碼" />
      <struts:textarea name="info" label="個人簡介" cols="28" rows="3" />
      
      <struts:submit value="註冊" />
      <struts:reset  value="重填" />
    </struts:form>
  
  </body>
  
</html>
