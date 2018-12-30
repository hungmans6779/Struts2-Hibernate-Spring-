<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<%@ page import="java.util.*" %>

<%@ taglib uri="/struts-tags"      prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags" prefix="sx"     %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>《UI》 標籤：【表單標籤】： 主要用於產生 HTML 中的表單 </title>
    <sx:head />
    <style>
      body {
	    background-image: url("/ch04Struts2.1TagLib/images/bg-0291.gif");
      }
    </style>
  </head>
  
  
  <body>
    books1:<struts:property value="books1" /><br/>
    books2:<struts:property value="books2" /><br/>
    books3:<struts:property value="books3" /><br/>
    
  </body>
  
</html>
