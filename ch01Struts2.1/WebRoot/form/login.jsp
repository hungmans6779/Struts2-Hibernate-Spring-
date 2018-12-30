<%@ page language="java" contentType="text/html;charset=UTF-8"  %>

<%@ taglib uri ="/struts-tags"      prefix="struts"  %>
<%@ taglib uri="/struts-dojo-tags"  prefix="sx"      %>

<%@ page import="java.util.*" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'login.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    <sx:head />  
    <style type="text/css" >
      <!--
        * {
          font-size:12px;
        }
      //-->
    </style>
  </head>
  
  <body>
    
    <div align="center" style="font-size:14px;font-weight:bold" >使用者登入</div>
    
    <div align="center" >
      <struts:form action="checkLogin" namespace="/login" >
        <struts:textfield name="username" style="font-size:12px;width:120px;" label="登入名稱" />
        <struts:password  name="password" style="font-size:12px;width:120px;" label="登入密碼" />
        
        <struts:submit value="登入" />
      </struts:form>
    </div>
    
  </body>
  
</html>
