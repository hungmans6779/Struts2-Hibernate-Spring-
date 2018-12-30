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
       radio：用來產生單選框，透過指定list、listKey、listValue 等屬性來產生HTML 元素，實際用法與 checkboxlist 標籤用法幾乎完全相同，
              不同的是，checkboxlist 標籤產生的是核對盒，而redio 標籤產生的是單選框。
                     
       相關屬性值如下所示：
       listKey  ：該屬性用來指定集合元素中的某個屬性作為核對盒的 value ，
                  如果集合元素是一個 Java 物件，那麼就指定該 Java 物件的name 屬性作為核對盒的value。
       listValue：該屬性用來指定集合元素中的某個屬性作對核對盒的標籤，
                  如果集合元素是一個 Java 物件，那麼就指定該 Java 物件的name 屬性作為核對盒的 value。
    --%>
    
    使用字集合產生多個單選框：<br/>
    <struts:radio list="{'JSP','Servlet','Struts 2','Ajax'}"  
                  name="skills" label="熟悉技術" labelposition="left" />
    <hr/>
    
    使用Map 物件產生多個單選框：<br/>
    <struts:radio list="#{'Java':'Java','.Net':'.Net','Database':'Database','Ajax':'Ajax'}"
                  name="skillsarea" label="您所關心的技術領域" labelposition="left" 
                  listKey="key" listValue="value" />
    <hr/>
    
      
    使用 Java 物件產生多個單選框：<br/>
    <struts:bean name="com.bean.BookService" id="bs" /> 
    <struts:radio list="#bs.books" 
                  name="books" label="請選擇您喜歡的圖書" labelposition="top" 
                  listKey="name"  listValue="name" /> 
    <hr/>
                         
  </body>
  
  
</html>
