<%@ page language="java" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>

<%@ taglib uri="/struts-tags"      prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags" prefix="sx" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'myFolders.jsp' starting page</title>
    <sx:head />
    <link type="text/css" rel="stylesheet" href="/ch16_PhotoSystem/css/Style.css" />
    <style>
      ul,li{
        float: left;
        width:300px;
      }
    </style>
    <script type="text/javascript" >
      <!--
        function checkDelete(){
          if(!confirm('確定刪除嗎？')){
            return false;
          }
        } // end checkDelete()
      //-->
    </script>
  </head>
  
  <body style="background-image:url('/ch16_PhotoSystem/images/bg.jpg'); background-position: center;background-repeat: no-repeat;">
  
    <center>
     
      <jsp:include page="/jsp/struts2/top2.jsp" />
     
      <struts:iterator value="allFolders" status='st' >
      
        <ul>
          <struts:if test="folderName=='預設相冊'" >
            <li><img src='/ch16_PhotoSystem/images/face.jpg' style="width:128px;height:128px;" /></li>
            <li><struts:a href="photoes.action?folderId=1" >預設相冊</struts:a></li>
          </struts:if> 
          <struts:else>
            <li><img src='/ch16_PhotoSystem/images/face.jpg' style="width:128px;height:128px;" /></li>
            <li><a href="photoes.action?folderId=<struts:property value='folderId' />" ><struts:property value="folderName" /></a></li>
            <li><a href="deleteFolder.action?folderId=<struts:property value='folderId'   />" onClick="checkDelete();" >刪除</a></li>
          </struts:else>
        </ul>
      
      </struts:iterator>
  
      <jsp:include page="/jsp/struts2/bottom.jsp" />    
      
    </center>
    
  
     
  
  </body>
  
</html>
