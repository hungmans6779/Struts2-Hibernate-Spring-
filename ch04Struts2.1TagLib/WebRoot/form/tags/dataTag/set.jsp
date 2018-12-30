<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<%@ taglib uri="/struts-tags"        prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags"   prefix="sx"     %>

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
       set：用於設定一個新變數，並把一個已有的變數值複製給這個新變數，同時可以把這個新蠻放到指定的範圍內，例如 application 範圍和 session 範圍等。
       相關屬性值如下所示：
       name ：用來定義新變數的名字。
       value：用來定義將要賦給新變數的值。
       id   ：用來定義該元素的參考 ID。
       scope：用來定義新變數的使用範圍，可選值有 application、session、request、response、page 和 action。
    --%>

    <struts:set name="technologyName" value="%{'Struts 2'}" />
	Technology Name:<span style="color: green" ><struts:property value="#technologyName" /></span>

    <hr/>
    
    
    <h2>使用s:set設置一個新變量</h2>
	<struts:bean name="com.bean.Person" id="p" >
	  <struts:param name="name" value="'kevin'" />
    </struts:bean>
 
    scope屬性值為action範圍:
	<span style="color: green" > 
	  <struts:set name="user" value="#p" scope="action" /> 
	  <struts:property value="#attr.user.name" /> <br>
	</span>
	<br>
		
	scope屬性值為session範圍:
	<span style="color: green" > 
	  <struts:set name="user" value="#p" scope="session" /> 
	  <struts:property value="#session.user.name" /> 
	</span>
	<br>
  
  </body>

</html>