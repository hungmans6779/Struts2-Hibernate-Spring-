<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>

<%@ taglib uri="/struts-tags"        prefix="struts"  %>
<%@ taglib uri="/struts-dojo-tags"   prefix="sx"      %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>【資料標籤】：主要用於進行資料儲存和處理(用來實現獲得或存取各種資料的功能)。 </title>
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
  
   <%--
       url：用於產生一個 URL 位址，也可以透過嵌套 param 標籤來為 URL 指定發送參數。
       相關屬性值如下所示：
       
       includeParams ：用來指定是否包含請求參數，有3個可選參數值：none、get 和 all。
       value         ：用來指定 URL 的地址值。
       action        ：用來指定一個 Action 作為 URL 位址值。
       namespace     ：用來指定命名空間。
       method        ：用來指定呼叫 Action 的方法名。
       encode        ：用來指定是否寫程式請求參數。
       includeContext：用來指定是否將目前上下立包含在 URL 位址值中。
       id            ：用來指定 URL 元素的參考ID。
    --%>
 
   指定 action 屬性，且使用 struts:param 標籤傳入參數<br/>
   <struts:url action="showPerson" >
     <struts:param name="name" value="'kevin'" />
   </struts:url>  
   <hr/>
   
   
   指定value 屬性，且使用struts:param 標籤傳入參數<br/>
   <struts:url value="http://3w.eztravel.com.tw:8080/ch04Struts2.1TagLib/form/tags/dataTag/XXX.jsp" >
     <struts:param name="name" value="'kevin'" />
   </struts:url>
   <hr/>
   
   既不指定 action 屬性，也不指定 value屬性，但使用 struts:param 標籤傳入參數。<br/>
   <struts:url includeParams="get" >
     <struts:param name="name" value="'kevin'" />
   </struts:url>
   <hr/>
   
   
  </body>
  
  
</html>