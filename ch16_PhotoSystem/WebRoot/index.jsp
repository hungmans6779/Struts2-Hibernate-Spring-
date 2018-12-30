<%@ page language="java" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>

<%@ taglib uri="/struts-tags" prefix="struts" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'index.jsp' starting page</title>
    <link type="text/css" rel="stylesheet" href="/ch16_PhotoSystem/css/Style.css" />
  </head>
  
  <body style="background-image:url('/ch16_PhotoSystem/images/bg.jpg'); background-position: center;background-repeat: no-repeat;">
    
    <jsp:include page="/jsp/struts2/top.jsp" />
    
    <center>
        
      <h3>使用者登入</h3>
      <struts:property value="popedom" />
      
      <struts:form action="login" method="post"  namespace="/namespace1"  >
        <struts:textfield name="userName"     label="使用者名稱" />
        <struts:password  name="userPassword" label="密      碼" />
       
        <struts:submit value="登入" />
      </struts:form>

    </center>

    <jsp:include page="/jsp/struts2/bottom.jsp" />
    
  </body>
  
</html>
