<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
  <head>
    <title>窗內網論壇使用者註冊</title>
    <style>
      .formStyle {
        width: 140px;
        text-align: left
      }
    </style>
  </head>
  
  <body>
    <%@ include file="header.jsp"%>

    <div style="float:left;text-align:left;width:100%" >
      <form:form>
        聯繫方式<br/>
        地址：<form:input path="address" cssClass="formStyle" /><br/>
        電話：<form:input path="tel"     cssClass="formStyle" /><br>
        <input type="submit" name="_target0" value="上一步"  />
        <input type="submit" name="_target2" value="下一步"  />
        <input type="submit" name="_cancel"  value="取消"    /> 
      </form:form>
    </div>
    
    <%@ include file="footer.jsp" %>
  
  </body>
  
</html>