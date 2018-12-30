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
       combobox：使用comobobox 標籤時，會產生兩個元素，分別是單行文字方塊和下拉式選單。
                 其中文字方塊的值對應請求參數，而下拉式選單用來輔助輸入，並沒有name 屬性，也不會產生請求參數。
                 當選擇下拉式選單中的一個選項時，該選項會自動出現在文字方塊中。該標籤透過 list 屬性所指定的集合來產生清單項。
    --%>
    
    <struts:form action="combobox" namespace="/ch04TagLibNS" >
    
      <struts:combobox list="{'Java 程式設計  案例教學','Ajax + JSP 巧學巧用','Struts2.x 完全學習手冊','JSF 開發從入門到精通'}"
                       name="books1" label="圖書列表" labelposition="left"
                       size="20" maxlength="20"  />
  
      
      <br/>
      
      <struts:bean name="com.bean.BookService"  id="bs" />
      <struts:combobox list="#bs.books" 
                       name="books2" label="圖書列表" labelposition="left"
                       listKey="name" listValue="name" />
  
      <struts:submit value="提 交" /> 
      
    </struts:form>
    
    
  </body>
  
</html>
