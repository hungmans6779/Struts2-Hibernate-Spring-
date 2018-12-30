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
  
    
    <struts:form action="validate" namespace="/ch05ValidateNS" >
      <struts:textfield name="username" label="姓名" />
      <struts:password  name="passwd"   label="密碼" />
      
      <struts:submit value="提 交" />
    </struts:form>
  
    <hr/>
    錯誤資訊：<struts:fielderror />
  
  </body>
  
</html>
