<%@ page language="java" contentType="text/html;charset=UTF-8" %>

<%@ taglib uri="/struts-tags"         prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags"    prefix="sx"     %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'bookSuccess.jsp' starting page</title>
    <sx:head /> 
  </head>
  
  <body>
    圖書名稱：<struts:property value="name"   /><br/>
    價    格：<struts:property value="price"  /><br/>
    發行數量：<struts:property value="num"    /><br/>
  </body>
  
</html>
