<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags"      prefix="spring" %>

<html>
  <head>
    <title>窗內網論壇使用者註冊(精靈控制器)</title>
    <style>
      .formStyle {
        width: 140px;
        text-align: right
      }
    </style>
  </head>
  
  <body>
    <%@ include file="header.jsp" %>

    <div style="float:left;text-align:left;width:100%" >
      <form:form>
        基本資訊<br/>
        <spring:message code="reg.username" />：<form:input    path="username" cssClass="formStyle" /><br/>
        <spring:message code="reg.password" />：<form:password path="password" cssClass="formStyle" /><br/>
        <spring:message code="reg.email"    />：<form:input    path="email"    cssClass="formStyle" /><br/>
        
        <input type="submit" name="_target1" value="<spring:message code='reg.next' />"     />
        <input type="submit" name="_cancel"  value="<spring:message code='reg.cancel' />"   />
      </form:form>
    </div>
  
    <%@ include file="footer.jsp" %>
  </body>
  
</html>