<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>

<%@ taglib uri="/struts-tags" prefix="struts" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'photoes.jsp' starting page</title>
    <sx:head />
    <link type="text/css" rel="stylesheet" href="/ch16_PhotoSystem/css/Style.css" />
    <style>
      body {
        background-image: url('/ch16_PhotoSystem/images/bg.jpg');
        background-position: center;
        background-repeat: no-repeat;
      }
    </style>
     <sx:head />
  </head>

  <body>
    
    <center>
      <jsp:include page="/jsp/struts2/top2.jsp" />
      
      <div>
        <struts:if test="%{folderPhotoes.size() == 0}" >
          <ul>
            <li><img src="/ch16_PhotoSystem/images/nopic.gif" > </li>
          </ul>
        </struts:if>
        <struts:else>
          <struts:iterator value="folderPhotoes" status="st">
          <ul>
            <li>
              <img name=<struts:property value="photoId"/> src="http://localhost:8080/ch16_PhotoSystem/upload/<struts:property value="photoName"/>"  />
            </li>
            <li><struts:property value="photoName" /></li>
            <li><a href="deletePic.action?folderId=<struts:property value='folderId' />&photoId=<struts:property value='photoId' />" onclick="return checkDelete()" >刪除</a> &nbsp;&nbsp;&nbsp;&nbsp;<struts:a href="folderName.action"> </struts:a></li>
          </ul>     
        </struts:iterator>
    
        <br/>
        <ul>
          <li>
            <struts:property value="pageNumber" />/<struts:property value="totalPage" />
            <a href="photoes.action?folderId=<struts:property value='folderId'/>&pageNumber=1" >首頁</a>
            <a href="photoes.action?folderId=<struts:property value='folderId'/>&pageNumber=<struts:property value="pageNumber-1"/>" >上一頁</a>
            <a href="photoes.action?folderId=<struts:property value='folderId'/>&pageNumber=<struts:property value="pageNumber+1"/>" >下一頁</a>
            <a href="photoes.action?folderId=<struts:property value='folderId'/>&pageNumber=<struts:property value="totalPage"/>" >末頁</a>
          </li>
        </ul>
        </struts:else>
      
        
      </div>
      <br><br><br>
    
      <jsp:include page="/jsp/struts2/bottom.jsp" />        
    </center>
    
  </body>

</html>