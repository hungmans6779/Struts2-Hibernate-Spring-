<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>

<%@ taglib uri="/struts-tags"       prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags"  prefix="sx"     %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title><struts:text name="AdminLogin" /></title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
    <link type="text/css" rel="stylesheet" href="/ch07_Struts2.1Sreg/css/main.css" />
    <sx:head />
  </head>
  
  <body>
    
    <br/><br/>
    
    <center>
      <h3><Struts:text name="AdminLogin" /></h3>
      
      <struts:property value="tip" />
       
      <struts:form action="adminLogin" method="post" namespace="/ch07SregNS" >
        <struts:textfield name="adminname" key="UserName" />
        <struts:password  name="password"  key="PassWord" />
        
        <struts:submit key="Login" />
      </struts:form>
      
    </center>
    
    <div style="clear:both" ></div>
    
    <%@ include file="/footer.jsp" %>
    
  </body>
  
</html>