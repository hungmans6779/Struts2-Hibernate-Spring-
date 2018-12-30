<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>

<%@ taglib uri="/struts-tags"      prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags" prefix="sx"     %>


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
       param 用於設定一個參數，通常用做 bean 標籤和 url 標籤的子標籤。
       相關屬性值如下所示： 
       name  ： 參數名稱。
       value ： 參數內容。
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
    <hr/>
    
    <struts:include value="includeFile.jsp" >
      <struts:param name="user" value="'kevin'" />
    </struts:include>
    <hr/>
   

  </body>
  
  
</html>