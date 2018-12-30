<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*"  %>

<%@ taglib uri="/struts-tags"        prefix="struts"  %>
<%@ taglib uri="/struts-dojo-tags"   prefix="sx"      %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>第 五 章  Struts2.x 輸入驗證 成功頁面</title>
    <sx:head />
  </head>
  
  <body> 
     姓名      ：<struts:property value="name"      /><br/>
     使用者名稱：<struts:property value="userName"  /><br/>
     密碼      ：<struts:property value="pass"      /><br/>
     年齡      ：<struts:property value="age"       /><br/>
     出生日期  ：<struts:property value="birthday"  /><br/>
     郵件      ：<struts:property value="email"     /><br/>
     網址      ：<struts:property value="url"       /><br/>
  </body>
  
</html>
