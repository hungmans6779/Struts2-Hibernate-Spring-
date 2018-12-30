<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>

<%@ taglib uri="/struts-tags"       prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags"  prefix="sx"     %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>錯誤</title>
    <sx:head />
    <link type="text/css" rel="stylesheet" href="/ch07_Struts2.1Sreg/css/main.css" />
    <style>
      body {
	    background-color:#7BA5EA;
      }
     </style>
  </head>
  
  <body>
     	<center>
    	<font size="3"><struts:property value="tip" /></font>
  	</center>

  </body>
  
</html>