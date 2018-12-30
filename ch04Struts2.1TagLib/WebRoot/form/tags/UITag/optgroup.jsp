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
       optgroup：用來產生選項群組，需要嵌套在 select 標籤中使用。在下拉式選單中可包含多個選項群組，
                 所以 select 標籤能包含多個 optgroup 標籤。
                     
       相關屬性值如下所示：
       listKey  ：該屬性用來指定集合元素中的某個屬性作為核對盒的 value ，
                  如果集合元素是一個 Java 物件，那麼就指定該 Java 物件的name 屬性作為核對盒的value。
       listValue：該屬性用來指定集合元素中的某個屬性作對核對盒的標籤，
                  如果集合元素是一個 Java 物件，那麼就指定該 Java 物件的name 屬性作為核對盒的 value。
    --%>
  
    <struts:form action="optgroup"   namespace="/ch04TagLibNS" >
    
      <struts:select name="skillsArea"
                     list="#{'JavaScript':'JavaScript','Ajax':'Ajax'}" 
                     label="您所關心的技術" >
        <struts:optgroup label="Java Web" 
                         list="#{'JSP':'JSP','Servlet':'Servlet','JavaBean':'JavaBean'}" 
                         listKey="value" listValue="key" />    
        <struts:optgroup label="Java 開放原始碼 Framework" 
                         list="#{'SSH':'SSH','Struts2.x':'Struts2.x','Hibernate3':'Hibernate','Spring2.x':'Spring2.x'}" 
                         listKey="value" listValue="key" />      
      </struts:select>
    
    
      <struts:submit value="提 交" />
      
    </struts:form>
    
  </body>
  
</html>
