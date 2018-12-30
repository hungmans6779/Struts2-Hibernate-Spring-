<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*"  %>

<%@ taglib uri="/struts-tags"        prefix="struts"  %>
<%@ taglib uri="/struts-dojo-tags"   prefix="sx"      %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>第 五 章  Struts2.x 輸入驗證</title>
    <sx:head />
  </head>
  
  <body> 
  
    <struts:form action="requiredstring"  method="post" namespace="/ch05ValidateNS" >
      <struts:textfield name="name" label="姓名" />
      <struts:password  name="pass" label="密碼" />
      
      <struts:submit value="傳  送" />
      
    </struts:form>
    
  </body>
  
</html>
