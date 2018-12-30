<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/struts-tags"        prefix="struts"  %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>第 五 章  Struts2.x 輸入驗證</title>
  </head>
  
  <body> 
  
    <struts:form action="client" validate="true"  namespace="/ch05ValidateNS"  >
      <struts:textfield name="userName" label="姓名"  />
      <struts:password  name="pass"     label="密碼"  />
      
      <struts:submit value="提  交" />
    </struts:form>
    
  </body>
  
</html>