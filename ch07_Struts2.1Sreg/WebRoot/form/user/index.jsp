<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>

<%@ taglib uri="/struts-tags"       prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags"  prefix="sx"     %>

<%@ include file="/form/user/header.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title><struts:text name="UserLogin" /></title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
    <sx:head />
  </head>
  
  <body>
    
    
    <center>
    
      <h3><struts:text name="UserLogin" /></h3>
    
      <div style="align:center" >
        <struts:property value="tip" />
    
        <struts:form action="login" method="post" namespace="/ch07SregNS"  >
          <struts:textfield name="username"  key="UserName" />
          <struts:password  name="password"  key="PassWord" />      
          <struts:submit key="Login" />
        </struts:form>
    
        <struts:a href="/ch07_Struts2.1Sreg/form/register/register.jsp" ><struts:text name="Register" /></struts:a>
    
      </div>
    
    </center>
    
    <div style="clear:both" ></div>
    
    <%@ include file="/footer.jsp" %>

  </body>
  
</html>