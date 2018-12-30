<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>

<%@ taglib uri="/struts-tags"       prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags"  prefix="sx"     %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>【資料標籤】：主要用於進行資料儲存和處理(用來實現獲得或存取各種資料的功能)。 </title>
    <style>
      body {
	    background-image: url("/ch04Struts2.1TagLib/images/bg-0291.gif");
      }
      
      *{
        mapping:0;
        margin:0;
      }
    </style>
    <sx:head />
  </head>
  
  <body>
   <%--
       bean 目前頁面中建立 JavaBean 實例物件，在使用該標籤建立JavaBean 物件時，可以嵌套 param 標籤，為該 JavaBean 實例定屬性值。 
       相關屬性值如下所示：
       name：必選屬性，用來指定可以產生實體 JavaBean 的實現類別。
       id  ：可選屬性，如果指定該屬性，就可以直接透過 id 來存取這個 JavaBean 實例。
    --%>
    
    <struts:bean name="com.bean.Person" id="pObj" >
      <struts:param name="name" value="'kevin'"         />
      <struts:param name="age"  value="35"              />
      <struts:param name="sex"  value="'男'"            />
      <struts:param name="home" value="'北京市懷柔區'"  />   
    </struts:bean>
    
    姓名：<span style="color:green;" ><struts:property value="#pObj['name']" ></struts:property></span><br/>
    年齡：<span style="color:green;" ><struts:property value="%{#pObj.age}"  ></struts:property></span><br/>
    性別：<span style="color:green;" ><struts:property value="#pObj.sex"     ></struts:property></span><br/>
    籍實：<span style="color:green;" ><struts:property value="#pObj.home"    ></struts:property></span><br/>
    
  </body>
  
  
</html>