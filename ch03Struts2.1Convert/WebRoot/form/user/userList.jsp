<%@ page language="java" contentType="text/html;charset=UTF-8" %>

<%@ taglib uri="/struts-tags"         prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags"    prefix="sx"     %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'userList.jsp' starting page</title>
    <sx:head />
  </head>
  
  <body>
    姓名：<struts:property value="#request.username" />
    年齡：<struts:property value="#request.age" />
  </body>
  
</html>
