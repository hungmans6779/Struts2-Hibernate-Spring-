<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>

<%@ taglib uri="/struts-tags"       prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags"  prefix="sx"     %>


<%@ include file="/form/user/header.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title><struts:text name="UserRegister" /></title>
    <sx:head />
  </head>
  
  <body>
    
    <center>
      
      <h3><struts:text name="UserRegister" /></h3>  
      <font color='red' ><struts:property value="tip" /></font>
      
      
      <struts:form action="register" method="post" namespace="/ch07SregNS" >
        <struts:textfield name="username"  key="UserName"           />
        <struts:password  name="password"  key="PassWord"           />
        <struts:textfield name="name"      key="Name"               />
        <struts:textfield name="nic"       key="NickName"           />
        <struts:textfield name="sex"       key="Sex"                />
        <struts:textfield name="age"       key="Age"                />
        <struts:textfield name="email"     key="Email"              />
        <struts:textfield name="phone"     key="Phone"              />
        <struts:textarea  name="selfshow"  key="brief.introduction" cols="30" rows="5" />
        
        <struts:submit key="Register" />
      </struts:form>
      
      
      <div style="clear:both" ></div>
      
      <%@ include file="/footer.jsp" %>
        
    </center>

  </body>
  
</html>