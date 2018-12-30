<%@ page language="java" pageEncoding="UTF-8"  contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
  
<%@ taglib  uri="/struts-tags"     prefix="struts"  %>
<%@ taglib  uri="/struts-dojo-tags"   prefix="sx"      %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>第 六 章  Struts2.x 擴充與高級技巧(帳號登入頁面)</title>
    <sx:head />
  </head>
  
  <body> 
    
    <!-- 
       載入臨時指定範圍資源檔：
       採用這種方式，國際資源檔的存放位置和命名規則與載入全域範圍國際化資源檔的方式相同，
       不同的是，採用此種方式時，可以使用 i18n 標籤臨時動態地設定國際化資源檔。
       在 struts:i18n 標籤中定義 name 屬性，用來指定國際化資源檔名字中自訂的部份，該標籤要作為其他標籤的父標籤使用。
    -->
    <struts:i18n name="globalMessages_temp" >
     
      <h3><struts:text name="loginTitle_temp" /></h3>
    
      <struts:form action="login_temp" namespace="/ch06ExtendNS" >
        <struts:textfield name="userName" key="loginName_temp"       />
        <struts:password  name="pass"     key="loginPassword_temp"   />   
     
        <struts:submit key="loginBtn_temp" align="center" />
        <struts:token />
        
      </struts:form>

    </struts:i18n>
    
  </body>
 
</html>