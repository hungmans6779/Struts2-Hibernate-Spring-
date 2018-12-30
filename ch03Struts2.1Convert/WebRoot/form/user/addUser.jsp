<%@ page language="java" contentType="text/html;charset=UTF-8" %>

<%@ taglib uri="/struts-tags"         prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags"    prefix="sx"     %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'addUser.jsp' starting page</title>
    <sx:head />
  </head>
  
  <body>
    
    <struts:form action="addUser" namespace="/ch03ConvertNS" >
      <struts:textfield name="username" lable="使用者名稱" />
      <struts:textfield name="age"      lable="年齡"       />
      <struts:submit value="增加姓名"  method="addUser" />
    </struts:form>
    
  </body>
  
</html>
