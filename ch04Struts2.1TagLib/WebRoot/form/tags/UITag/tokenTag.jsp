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
  
    <%--
       token：主要用來防止使用者多次傳送表單，例如：沒有發送請求， 而重新傳回到相應頁面時的重複傳送。
              該標籤不會在頁面上進行任何輸出，也沒有屬性，只是產生一個 HTML 隱藏欄位。每次載入該頁面時隱藏欄位的值都不同，
              當從表單傳送請求時，攔截器會進行攔截，如果兩次請求時隱藏攔位的值相同就阻止表單被傳送。
    --%>
   
    <struts:form acion="checkLogin"  namespace="/ch04TagLibNS" >
      <struts:textfield name="name"   label="登入名稱"   />
      <struts:password  name="passwd" lable="登入密碼"   />
    
      <struts:submit value="登 入" />  
      
      <struts:token />
      <struts:actionerror />
    </struts:form>
    
  </body>
  
</html>
