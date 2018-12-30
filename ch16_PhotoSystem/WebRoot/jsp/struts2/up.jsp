<%@ page language="java" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>

<%@ taglib uri="/struts-tags"      prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags" prefix="sx"     %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>檔案上傳</title>
	<meta http-equiv="pragma"        content="no-cache" >
	<meta http-equiv="cache-control" content="no-cache" >
	<meta http-equiv="expires"       content="0" >    
	<meta http-equiv="keywords"      content="keyword1,keyword2,keyword3" >
	<meta http-equiv="description"   content="This is my page" >
    <sx:head />
    <link type="text/css" rel="stylesheet" href="/ch16_PhotoSystem/css/Style.css" />
  </head>
  
  <body style="background-image:url('/ch16_PhotoSystem/images/bg.jpg'); background-position: center;background-repeat: no-repeat;">
  
    <center>
       <jsp:include page="/jsp/struts2/top2.jsp" />
       
       <h3>上傳圖片</h3>
       <struts:form action="upAction" method="post" namespace="/namespace1" enctype="multipart/form-data" >
         <struts:file name="doc" cssStyle="width:280px" ></struts:file>
         <struts:textarea cssStyle="width:280px;" value="圖片說明" name="photoInfo" ></struts:textarea>
         <struts:select list="allFoldersName" name="folderId" listKey="folderId" listValue="folderName" />
         <struts:submit value="上傳" />
       </struts:form>
       <br/><br/><br/>
     
       <jsp:include page="/jsp/struts2/bottom.jsp" />      
   
    </center>
 
  </body>
  
</html>
