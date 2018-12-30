<%@ page language="java" pageEncoding="UTF-8"  contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>

<%@ taglib  uri="/struts-tags"        prefix="struts"  %>
<%@ taglib  uri="/struts-dojo-tags"   prefix="sx"      %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title><struts:text name="huizhi.title" /></title>
    <link rel="stylesheet" type="text/css" href="/css/style.css" />
    <sx:head /> 
  </head>
  
  <body> 
  
    <%--
     《檔案上傳》：在 Struts2.x 中實現檔案上傳，需要註冊一個"上傳解析器"，開啟 struts.properties 設定檔，可以看到解析器的註冊程式碼。
                   如果表單中包含一個 name 屬性為 xxx 的檔案域，那麼在 Action 中可以使用如下3個屬性來封裝檔案域資訊：
                   File xxx             ：封裝檔案域對應的檔案內容;
                   String xxxFileName   ：封裝上傳檔案的檔案名稱; 
                   String xxxContentType：封裝上傳的檔案型態；
    --%>
    <center>
      請選擇要上傳的檔案
      <struts:form action="up" method="post" name="upform" id="form1" enctype="multipart/form-data"  namespace="/ch06ExtendNS" >
        <struts:file name="upload" cssStyle="width:300px;" />
        <struts:submit value="確定" />
      </struts:form>  
    </center>
  
  </body>
  
</html>
