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
  
    <struts:form action="stringlength1" namespace="/ch05ValidateNS" >
    
      <struts:textfield  name="userName"  label="使用者姓名"  />
      <struts:textfield  name="age"       label="年齡" />
      <sx:datetimepicker name="birthday"  type="date"  label="出生日期"  displayFormat="yyyy-MM-dd"  ></sx:datetimepicker>
      <struts:password   name="pass"      label="請輸入密碼"       />
      <struts:password   name="rpass"     label="請再輸入一次密碼" />
      <struts:textfield  name="email"     label="信箱"      /> 
      <struts:textfield  name="url"       label="網址" /> 
                           
      <struts:submit value="傳 送" />
    </struts:form>
    
  </body>

</html>