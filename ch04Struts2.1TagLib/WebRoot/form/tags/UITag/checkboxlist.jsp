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
       checkboxlist：主要用來根據 list 屬性指定的集合一次建立多個核對盒，即一次產生多個 HTML 表單標籤中的 <input type="checkbox" /> 。
                     如果 list 屬性是一個字串集合，那就不需要再指定該標籤的其他屬性，如果list 屬性是一個 Java 物件或者 Map 物件，
                     那麼需要指定該標籤的 listKey 和 listValue 屬性。
                     
       相關屬性值如下所示：
       listKey  ：該屬性用來指定集合元素中的某個屬性作為核對盒的 value ，
                  如果集合元素是一個 Java 物件，那麼就指定該 Java 物件的name 屬性作為核對盒的value。
       listValue：該屬性用來指定集合元素中的某個屬性作對核對盒的標籤，
                  如果集合元素是一個 Java 物件，那麼就指定該 Java 物件的name 屬性作為核對盒的 value。
    --%>

    
    使用字集合產生多個核對盒：<br/>
    <struts:checkboxlist list="{'JSP','Servlet','Struts 2','Ajax'}" 
                         name="skills" label="熟悉技術" labelposition="top" />
 
    <hr/>
    
    使用Map 物件產生多個核對盒：<br/>
    <struts:checkboxlist list="#{'Java':'Java','.Net':'.Net','Database':'Database','Ajax':'Ajax'}"
                         name="skillsarea" label="您所關心的技術領域" labelposition="top" 
                         listKey="key" listValue="value" />
    
    <hr/>
    
    使用 Java 物件產生多個核對盒：<br/>
    <struts:bean name="com.bean.BookService" id="bs" /> 
    <struts:checkboxlist list="#bs.books" 
                         name="books" label="請選擇您喜歡的圖書" labelposition="top" 
                         listKey="name"  listValue="name" /> 
    
 
  </body>
  
  
</html>
