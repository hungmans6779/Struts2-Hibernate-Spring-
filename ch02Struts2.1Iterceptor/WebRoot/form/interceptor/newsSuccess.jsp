<%@ page language="java" contentType="text/html;charset=UTF-8" %>

<%@ taglib uri="/struts-tags"         prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags"    prefix="sx"     %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'newsSuccess.jsp' starting page</title>
    <sx:head />
  </head>
  
  <body>
     標題：<struts:property value="title"    /><br/>
     內容：<struts:property value="content"  /><br/>
  </body>
  
</html>