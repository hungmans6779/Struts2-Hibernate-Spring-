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
    
    <center>
      <b>上傳成功！！！</b><br/>
      <struts:property value="uploadFileName"  /><br/>
       <img src="<struts:property value="'/ch06_Struts2.1Extend/save/'+uploadFileName"/> ">
    </center>
  
  </body>
  
</html>