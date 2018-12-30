<%@ page language="java" contentType="text/html; charset=utf-8" %>

<%@ page import="java.util.*" %>

<%@ taglib uri="/struts-tags"       prefix="struts"  %>
<%@ taglib uri="/struts-dojo-tags"  prefix="sx"      %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'errorMessageTag.jsp' starting page</title>
    <sx:head />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  </head>
  
  <body>
  
    <%--
      《component》：可以自訂群組物件，例如，當需要多次使用某段程式碼時，就可以考慮將這段程式碼定義成一個自訂群組組件，
                     然後在頁面中使用 componet 標籤來呼叫自訂群組件。
                     
                     theme      ：用來指定自訂群組件所使用的主題，如果不指定該屬性，則預設使用 xhml 主題。
                     templateDir：用來指定自訂群組件所使用的主題目錄，如果不指定該屬性，則預設使用 template 的目錄。
                     template   ：用來指定自訂群組件所使用的模版檔案。  
                     
                     
                     myTemplate.jsp 需放在 /WebRoot/template/xhtml 資料夾下        
    --%>
   
    <struts:component template="myTemplate.jsp" >

      <struts:param name="list" 
                    value="{'Java 程式設計 案例教學','Ajax 完全學手冊','Struts2.x 完全學習手冊','JSP 實作教學','JSF 開發從入門到精通'}"  />
    
     </struts:component>
    
  </body>
  
</html>
