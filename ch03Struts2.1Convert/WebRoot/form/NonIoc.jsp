<%@ page language="java" contentType="text/html;charset=UTF-8" %>

<%@ taglib uri="/struts-tags"         prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags"    prefix="sx"     %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'NonIoc.jsp' starting page</title>
    <sx:head />
  </head>
  
  <body>
    非 IoC.jsp 測試頁面：<struts:property value="#session.message" />
  </body>
  
</html>
