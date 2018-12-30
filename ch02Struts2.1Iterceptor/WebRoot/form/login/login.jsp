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
    
    <center>
      <struts:property value="message" />
      <br/>
      <b>使用者登入</b><br/>
      <struts:form action="login" namespace="/interceptorNS" >
        <struts:textfield label="使用者名稱" name="username" />
        <struts:password  label="密碼"       name="password" />
        
        <struts:submit value="傳 送" />      
      </struts:form>
      
    </center>
    
  </body>
  
</html>