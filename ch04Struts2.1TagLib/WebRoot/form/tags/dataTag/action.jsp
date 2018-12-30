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
       action 允許在 JSP 頁面中直接呼叫 Action ，要呼叫 Action 就需要指定 Action 的 name 和 namespace 等屬性。 
       相關屬性值如下所示：
       id                 ：可選屬性，用來指定被呼叫 Action 的參考 ID。
       name               ：必選屬性，用來指定被呼叫 Action 的名字。
       namespace          ：可選屬性，用來指定被呼叫 Action 所在的 namespace。
       executeResult      ：可選屬性，用來指定是否將 Action 的處理結果包含到目前頁面中，該屬性的預設值是false，即不包含 。
       ignoreContextParams：可選屬性，用來指定目前頁面中的參數是否需要傳給被呼叫的 Action，該屬性的預設值是false，
                            即預設將頁面中的參數傳給被呼叫 Action 。
    --%>
  
    下面呼叫第一個 Action，並將結果包含到本頁面中
    <struts:action name="tag1" executeResult="true" ignoreContextParams="true"  namespace="/ch04TagLibNS" />
    <hr/>
    
    下面第 2-1 個Action，並將結果包含到本頁面中。並且阻止目前頁面的參數傳入 Action。
    <struts:action name="tag2" executeResult="true" ignoreContextParams="true"  namespace="/ch04TagLibNS" />
    <hr/>
    
    
    下面第 2-2 個Action，並將結果包含到本頁面中。但接受目前頁面的參數傳入 Action。
    <struts:action name="tag2" executeResult="true" namespace="/ch04TagLibNS" />
    <hr/>
    
    下面第 2-3 個Action，並不將結果包含到本頁面中。但接受目前頁面的參數傳入 Action。
    <struts:action name="tag2" executeResult="false" namespace="/ch04TagLibNS" />
    <hr/>
    
    
    
    當前頁面傳送的參數 name 的值
    <span style="color:blue"><struts:property value="#request.name" /></span>
		
  </body>
  
  
</html>