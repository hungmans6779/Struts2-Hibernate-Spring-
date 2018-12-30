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
       select：用來產生一個下拉式選單，透過為該標籤的 list 屬性指定一個集合可以產生下拉式選單的選項。
                     
       相關屬性值如下所示：
       listKey  ：該屬性用來指定集合元素中的某個屬性作為核對盒的 value ，
                  如果集合元素是一個 Java 物件，那麼就指定該 Java 物件的name 屬性作為核對盒的value。
       listValue：該屬性用來指定集合元素中的某個屬性作對核對盒的標籤，
                  如果集合元素是一個 Java 物件，那麼就指定該 Java 物件的name 屬性作為核對盒的 value。
    --%>
  
    <struts:form action="select" namespace="/ch04TagLibNS" > 
     
       
      <struts:select list="{'Java 程式設計 案例教學','Ajax + JSP 巧學巧用','Struts2.x  完全學習手冊'}" 
                     name="books1" label="使用字串集合產生下拉式選單：" />
  
      
      <struts:select list="#{'SSH':'SSH 從入門到精通','JSF':'JSF 開發從入門到精通','ajax':'Ajax 完全學習手冊'}"  
                     name="books2" label="使用簡單物件來產生下拉式選單" /> 
                     
      
      <struts:bean name="com.bean.BookService" id="bs" />               
      <struts:select list="#bs.books" 
                     name="books3" label="使用 Java 物件產生下拉式選單"
                     labelposition="top" listKey="name" listValue="name" />
      
                     
      <struts:submit value="提 交" />
      
      
    </struts:form> 
    
  </body>
  
</html>
