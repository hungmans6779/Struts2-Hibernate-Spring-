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
  
    <struts:iterator value="{'Java 程式設計 案例教學','JSP 實作教學','Struts 2 完全學習手冊','SSH 從入門到精通'}" id="boookName" status="stat" >
       <ul <struts:if test="#stat.odd" >style='color:red'</struts:if> >
         <li><struts:property value="boookName" /></li>
       </ul>
    </struts:iterator>
   
   
    <hr/>
    
    
    <div style="text-align:center;width:500px;">
      <ul style="width:500px" >
        <li style="width:200px;float: left;" >姓名</li>
        <li style="width:200px;float: left;" >年齡</li>  
      </ul>
      <struts:iterator value="#{'aa':'11','bb':'22','cc':'33','dd':'44','ee':'55'}" status="st" >
        <ul <struts:if test="#st.odd" >style="background-color:wheat;width:500px;float:left;"</struts:if>  >
          <li style="width:200px;float:left;" ><struts:property value="key"   /></li>
          <li style="width:200px;float:left;" ><struts:property value="value" /></li>
        </ul><br/>
      </struts:iterator>
    </div>
    
    
  </body>
  
  
</html>
