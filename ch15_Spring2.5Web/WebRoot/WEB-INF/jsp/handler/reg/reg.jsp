<%@ page language="java" contentType="text/html;charset=UTF-8"  pageEncoding="UTF-8" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'reg.jsp' starting page</title>
  </head>
  
  <body>
  
    <form:form>
      使用者名稱：<form:input path="username" /><form:errors path="username" /><br/>
      密<span style="margin-left:3em" ></span>碼：<form:password path="password" /><form:errors path="password" /><br/>
      
      <input type="submit" value="註冊" />
      <input type="reset"  value="重置" />
    </form:form>
    
  </body>
  
</html>