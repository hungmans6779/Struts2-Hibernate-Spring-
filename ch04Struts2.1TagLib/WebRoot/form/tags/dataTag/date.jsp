<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>

<%@ taglib uri="/struts-tags"      prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags" prefix="sx"     %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>【資料標籤】：主要用於進行資料儲存和處理(用來實現獲得或存取各種資料的功能)。 </title>
    <sx:head />
    <style>
      body {
	   background-image: url("/ch04Struts2.1TagLib/images/bg-0291.gif");
      }
    </style>

  
  </head>
  
  <body>
   <%--
       date：用於格式化輸出一個日期，還可以計算指定時間到目前時間的時差。
       相關屬性值如下所示：
       
       nice  ：指定是否輸出指定時間與目前時間的時差，預設值為 false，即不輸出時差。
       name  ：用來指定要被格式化輸出的日期值。
       id    ：用來指定該元素的參考ID。
       format：用來指定日期格式化。
    --%>
 
   <url>
     <li><struts:date name="currentDate" format="dd/MM/yyyy"         /></li>   
     <li><struts:date name="currentDate" format="MM/dd/yyyy"         /></li>
     <li><struts:date name="currentDate" format="MM/dd/yy"           /></li>
     <li><struts:date name="currentDate" format="MM/dd/yy hh:mm"     /></li>
     <li><struts:date name="currentDate" format="MM/dd/yy hh:mm:ss"  /></li>
   </url>
   <hr/>
   
   
   <url>
     <li><struts:date name="currentDate" nice="false" /></li>
     <li><struts:date name="currentDate" nice="true"  /></li>
   </url>
   
   
   
  </body>
  
  
</html>