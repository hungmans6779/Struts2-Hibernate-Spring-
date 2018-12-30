<%@ page language="java" pageEncoding="UTF-8"  contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>

<%@ taglib uri="/struts-tags"        prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags"   prefix="sx"      %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>第 六 章  Struts2.x 擴充與高級技巧(登入成功頁面)</title>
    <sx:head />
  </head>
  
  <body> 
    
    第一種方式：在 JSP 頁面填充帶預留位置的國際化訊息
    <center>
      <struts:text name="login.success" >
        <struts:param>
          <struts:property value="userName" />
        </struts:param>
      </struts:text>
    </center>
    
    第二種方式：在 Action 裡填充帶預留位置的國際化訊息。
    <center>
      <h3><struts:property value="tip" /></h3>
    </center>
    
  </body>
 
</html>