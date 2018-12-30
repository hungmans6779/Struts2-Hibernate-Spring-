<%@ page language="java" pageEncoding="UTF-8"  contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>

<%@ taglib  uri="/struts-tags"        prefix="struts"  %>
<%@ taglib  uri="/struts-dojo-tags"   prefix="sx"      %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>第 六 章  Struts2.x 擴充與高級技巧(帳號登入頁面)</title>
    <sx:head />
  </head>
  
  <body> 
    
    <!-- 
       載入全域指定範圍資源檔：
       載入全域範圍資料檔(把xxx.property 放到 src 的目錄下)，並設定 struts.xml 的常數:struts.custom.i18n.resources。
    -->
    
    <!-- i18n 讀取國際化資源檔 (globalMessages_語言_國家.properties)  -->
    <h3><struts:text name="loginTitle" /></h3>
    
    <struts:form action="login" namespace="/ch06ExtendNS" >
      <struts:textfield name="userName" key="loginName"       />
      <struts:password  name="pass"     key="loginPassword"   />   
     
      <struts:submit key="loginBtn" align="center" />
      <struts:submit value="登 錄-1" align="center" method="login" />
    </struts:form>
    
    
  </body>
 
</html>
