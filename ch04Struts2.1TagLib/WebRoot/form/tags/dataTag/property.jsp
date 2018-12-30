<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>

<%@ taglib uri="/struts-tags"      prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags" prefix="sx"     %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>【資料標籤】：主要用於進行資料儲存和處理(用來實現獲得或存取各種資料的功能)。 </title>
    <sx:head />
  </head>
  
  <body>
   <%--
       property：用於輸出某個值。
       相關屬性值如下所示：
       default：用來指定當屬性值為null時輸出的值。
       escape ：用來指定是否顯示標籤程式碼，不顯示則指定屬性值為false。
       value  ：用來指定要輸出的屬性值。
       id     ：用來指定該元素的參考 ID。
    --%>
   
   request value - t1：<struts:property value="#request.param1" /><br/>
   request value - t2：<struts:property value="#request['param1']" /><br/>
   session value - t1：<struts:property value="#session.param2" /><br/>
   session value - t2：<struts:property value="#session['param2']" /><br/>
   
   <hr/>
   
   <!-- 用來指定當屬性值為null時輸出的值  -->
   <struts:property value="defaultValue" default="給定的預設值" />
   
   
   
  </body>
  
  
</html>