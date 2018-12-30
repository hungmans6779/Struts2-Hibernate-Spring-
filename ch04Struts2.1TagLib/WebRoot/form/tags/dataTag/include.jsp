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
       include 用於在 JSP 頁面中包含其他資源。
       相關屬性值如下所示：
       value ： 必選屬性，用來指定被包含的JSP或 Servlet 等資源檔。
       id    ： 可選屬性，用來指定該標籤的參考ID。
    --%>
   <struts:include value="includeFile.jsp" >
      <struts:param name="user" value="'kevin'" />
   </struts:include>
 
  </body>
  
  
</html>