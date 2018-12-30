<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>

<%@ taglib uri="/struts-tags"      prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags" prefix="sx"     %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>【邏輯控制標籤】：主要用於進行條件和迴圈等流程控制</title>
    <sx:head />
    <style>
      body {
	   background-image: url("images/bg-0291.gif");
      }
      
      *{
        mapping:0;
        margin:0;
      }
    </style>
  </head>
  
  <body>
  
    <struts:append id="newList" >
      <struts:param value="{'Java 程式設計 案例教學','JSP 實作教學','Struts 2 完全學習手冊','SSH 從入門到精通'}" />
      <struts:param value="{'SCJP','SCWCD','ECSS','CEH'}" />
    </struts:append>
    
    <div style="text-align:center;width:500px;">
      <struts:iterator value="#newList" status="st"  id="bookName" >
        <ul <struts:if test="#st.odd" >style="background-color:wheat;width:500px;float:left;"</struts:if>  >
          <li style="width:200px;float:left;" ><struts:property value="bookName"   /></li>
        </ul>
        <br/>
      </struts:iterator>
    </div>
    
    
  </body>
  
  
</html>
