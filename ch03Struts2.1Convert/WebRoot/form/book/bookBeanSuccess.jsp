<%@ page language="java" contentType="text/html;charset=UTF-8" %>

<%@ taglib uri="/struts-tags"         prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags"    prefix="sx"     %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'bookBeanSuccess.jsp' starting page</title>
    <sx:head />
  </head>
  
  <body>
     圖書名稱：<struts:property  value="book.name"   /><br/>
     價    格：<struts:property  value="book.price"  /><br/>
     發行數量：<struts:property  value="book.num"    /><br/>
  </body>
  
</html>
