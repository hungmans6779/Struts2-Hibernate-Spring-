<%@ page language="java" contentType="text/html;charset=UTF-8" %>

<%@ taglib uri="/struts-tags"         prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags"    prefix="sx"     %>



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'login.jsp' starting page</title>
    <sx:head />
  </head>
  
  <body> 
  
    <struts:form action="login" namespace="/ch03ConvertNS"  >
      <struts:textfield name="username" label="登入名稱" size="15" />
      <struts:password  name="password" label="登入密碼" size="15" /> 
      
      <struts:submit value="登 入" />
    </struts:form>
    
  </body>
  
</html>
