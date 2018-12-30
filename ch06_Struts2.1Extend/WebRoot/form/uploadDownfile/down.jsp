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
      檔案下載： Struts2.x 支援檔案下載，透過提供 stream 結果型態來實現。
      指定 stream 結果型態時，還需要指定 inputName 參數，此參數表示輸入流作為檔案下載的入口。
    --%>
    <a href="/ch06_Struts2.1Extend/ch06ExtendNS/download.action" >我要下載</a>
    
  </body>
  
</html>
