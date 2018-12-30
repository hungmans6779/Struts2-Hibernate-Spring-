<%@ page language="java" contentType="text/html;charset=UTF-8" %>

<%@ page import="java.util.*" %>

<%@ taglib uri="/struts-tags"       prefix="struts"  %>
<%@ taglib uri="/struts-dojo-tags"  prefix="sx"      %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'errorMessageTag.jsp' starting page</title>
    <sx:head />
  </head>
  
  <body>
    <%--
      《actionerror、actionmessage》：輸出 Action 中的訊息。
                                      (1) actionerror：輸出 Action 中的 getActionError()方法的傳回值。
                                      (2) actionmessage：輸出 Action 中的  getActionMessage() 方法的傳回值。                    
    --%>
   
    <struts:actionerror />    <%-- 輸出 ActionError() 的資訊  --%>
    <hr/>
    <struts:actionmessage />  <%-- 輸出 ActionMessage() 的資訊  --%>
   
  </body>
  
</html>
