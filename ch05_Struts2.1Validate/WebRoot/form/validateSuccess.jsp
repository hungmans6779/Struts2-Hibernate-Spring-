<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*"  %>

<%@ taglib uri="/struts-tags"        prefix="struts"  %>
<%@ taglib uri="/struts-dojo-tags"   prefix="sx"      %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'validate.jsp' starting page</title>
    <sx:head />
  </head>
  
  <body> 
   
    姓名：<struts:property value="username" /><br/>
    密碼：<struts:property value="passwd"   /><br/>
    
  </body>
  
</html>
