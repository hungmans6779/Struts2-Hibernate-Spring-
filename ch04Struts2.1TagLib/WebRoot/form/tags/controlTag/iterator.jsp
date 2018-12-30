<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>

<%@ taglib uri="/struts-tags"      prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags" prefix="sx"     %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>【邏輯控制標籤】：主要用於進行條件和迴圈等流程控制</title>
    <sx:head />
  </head>
  
  <body>
    
    <struts:iterator value="{'Java 程式設計 案例教學','JSP 實作教學','Struts 2 完全學習手冊','SSH 從入門到精通'}" id="boookName" >
       <struts:property value="boookName" /><br/>
    </struts:iterator>
    
  </body>
  
</html>
