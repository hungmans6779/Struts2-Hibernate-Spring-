<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*"  %>

<%@ taglib uri="/struts-tags"       prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags"  prefix="sx"     %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'register.jsp</title>   
    <sx:head />
    <link type="text/css" rel="stylesheet" href="/ch16_PhotoSystem/css/Style.css" />
    <script type="text/javascript" language="javascript" >
      <!--
         // alert("Test");
      //-->
    </script>
  </head>
  
  <body style="background-image:url('/ch16_PhotoSystem/images/bg.jpg'); background-position: center;background-repeat: no-repeat;">
    <jsp:include page="/jsp/struts2/top.jsp" />
    
    <center>
        <h3>使用者註冊</h3>
        
        <struts:form action="register" method="post" namespace="/namespace1"  >
          <struts:textfield  name="userName"      label="使用者名稱"        maxLength="15"  />
          <struts:password   name="userPassword"  label="密  碼"            maxLength="16"  />
          <struts:password   name="ruserPassword" label="再輸入一次密碼"    maxLength="16"  />
          <struts:radio      name="userSex"       label="性別" list="#{'male':'男','female':'女'}" value="'male'" listKey="key" listValue="value"  labelposition="left" /> 
          <sx:datetimepicker name="userBirthday"  label="生日" displayFormat="yyyy-MM-dd" />  
          <struts:textfield  name="userTelephone" label="電 話"     />
          <struts:textfield  name="userEmail"     label="電子郵件"  />
          <struts:textfield  name="userAddress"   label="地址"      />
          <struts:textarea   name="userRemark"    label="簡介" cols="17" rows="3" />   
          
          <struts:submit value="註  冊" />
        </struts:form>      
    
    </center>     
 
    <jsp:include page="/jsp/struts2/bottom.jsp" />    
  </body>
</html>