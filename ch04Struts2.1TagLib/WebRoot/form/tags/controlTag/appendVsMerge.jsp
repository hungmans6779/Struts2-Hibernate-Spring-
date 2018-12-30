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
	   background-image: url("/ch04Struts2.1TagLib/images/bg-0291.gif");
      }
      
      *{
        mapping:0;
        margin:0;
      }
    </style>
  </head>
  
  <body>
  
    <struts:append id="newList_append" >
      <struts:param value="{'Java 程式設計 案例教學','JSP 實作教學','Struts 2 完全學習手冊','SSH 從入門到精通'}" />
      <struts:param value="{'SCJP','SCWCD','ECSS','CEH'}" />
    </struts:append>    
    

    <struts:merge id="newList_merge" >
      <struts:param value="{'Java 程式設計 案例教學','JSP 實作教學','Struts 2 完全學習手冊','SSH 從入門到精通'}" />
      <struts:param value="{'SCJP','SCWCD','ECSS','CEH'}" />
    </struts:merge>    




    <h3 style="color:green" >反覆運算輸出由 append 標籤產生的新集合</h3>
    <div style="text-align:center;width:500px;">
      <struts:iterator value="#newList_append" status="st"  id="bookName1" >
        <ul <struts:if test="#st.odd" >style="background-color:wheat;width:500px;float:left;"</struts:if>  >
          <li style="width:200px;float:left;" ><struts:property value="bookName2"   /></li>
        </ul>
        <br/>
      </struts:iterator>
    </div>
    
    <hr/>
    
    <h3 style="color:green" >反覆運算輸出由 merge 標籤產生的新集合</h3>
    <div style="text-align:center;width:500px;">
      <struts:iterator value="#newList_merge" status="st"  id="bookName2" >
        <ul <struts:if test="#st.odd" >style="background-color:wheat;width:500px;float:left;"</struts:if>  >
          <li style="width:200px;float:left;" ><struts:property value="bookName2"   /></li>
        </ul>
        <br/>
      </struts:iterator>
    </div>
    
    <hr/>
    
    
  </body>
  
  
</html>
