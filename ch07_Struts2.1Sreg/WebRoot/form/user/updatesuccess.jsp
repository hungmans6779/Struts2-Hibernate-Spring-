<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>

<%@ taglib uri="/struts-tags"       prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags"  prefix="sx"     %>

<%@ include file="/form/user/header.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title><struts:text name="update.succ" /></title>
    <sx:head />
    <link href="/ch07_Struts2.1Sreg/css/main.css" type="text/css" rel="stylesheet" >
    <style>
      body {
	    background-color:#7BA5EA; 
      }
    </style>
  </head>
  
  <body>
  
    <div style="text-align:center" >
   	  <font size="3" ><struts:text name="update.succ" /></font>
   	</div>


    <div style="clear:both" ></div>

    <%@ include file="/footer.jsp" %>

  </body>
  
</html>