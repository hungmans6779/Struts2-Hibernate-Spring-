<%@ page language="java" contentType="text/html;charset=UTF-8" %>

<%@ taglib uri="/struts-tags"         prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags"    prefix="sx"     %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'method.jsp' starting page</title>
    <sx:head />
  </head>
  
  <body>
    
    <struts:form action="method" namespace="/interceptorNS" >
      <struts:submit value="execut1 按鈕" method="execute1" /><br/>
      <struts:submit value="execut2 按鈕" method="execute2" /><br/>
      <struts:submit value="execut3 按鈕" method="execute3" /><br/>
      <struts:submit value="execut4 按鈕" method="execute4" /><br/>
    </struts:form>
  
  </body>
  
</html>
