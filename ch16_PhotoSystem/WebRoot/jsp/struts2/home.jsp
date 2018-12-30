<%@ page language="java" pageEncoding="UTF-8" %>
<%@ page import="java.util.*"  %>

<%@ taglib uri="/struts-tags" prefix="struts" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>窗內視訊網</title>
    <link type="text/css" rel="stylesheet" href="/ch16_PhotoSystem/css/Style.css" />
  </head>
  
  <body style="background-image:url('/ch16_PhotoSystem/images/bg.jpg'); background-position: center;background-repeat: no-repeat;" >
    
    <center>
      <jsp:include page="/jsp/struts2/top.jsp" />
      <br/>
      <ul>
        <li><struts:a href="myFolders.action" >我的相冊</struts:a></li>
      </ul>    
      <br/><br/>
      <ul>
        <li>登入成功！歡迎您來到窗內網！</li>
      </ul>
      <jsp:include page="/jsp/struts2/bottom.jsp" />
    </center>
    
  </body>
  
</html>