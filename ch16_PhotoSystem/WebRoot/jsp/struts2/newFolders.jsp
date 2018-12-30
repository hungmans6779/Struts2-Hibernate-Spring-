<%@ page language="java" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>

<%@ taglib uri="/struts-tags"       prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags"  prefix="sx" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'newFolders.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    <sx:head />
    <link type="text/css" rel="stylesheet" href="/ch16_PhotoSystem/css/Style.css" />
  </head>
  
  <body style="background-image:url('/ch16_PhotoSystem/images/bg.jpg'); background-position: center;background-repeat: no-repeat;">
    
    <jsp:include page="/jsp/struts2/top2.jsp" />
    <center>
      
      <h3>新增相簿</h3>  
      <struts:form action="newFolder" method="post" namespace="/namespace1" >
        <struts:textfield name="folderName" label="相簿名稱" />
        <struts:textarea  name="folderInfo" label="相簿說明" cols="17" rows="3"  />

        <struts:submit value="傳送" />
      </struts:form>  
       
    </center>
    <jsp:include page="/jsp/struts2/bottom.jsp" />        
  
  </body>
  
</html>