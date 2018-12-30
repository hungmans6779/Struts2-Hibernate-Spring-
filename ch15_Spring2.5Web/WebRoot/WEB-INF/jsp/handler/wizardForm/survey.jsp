<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>

<html>
  <head>
    <title>窗內網論壇使用者註冊</title>
    <style>
      .formStyle {
        width: 140px;
        text-align:left;
      }
    </style>
  </head>
  
  <body>
  
    <%@ include file="header.jsp" %>
   
    <div style="align:center" >
      <form:form cssClass="formStyle" >
        <span style="margin-left:2em" ></span>愛好<br>
        <form:checkbox path="favor" value="看書"       /> 看書 <br/>
        <form:checkbox path="favor" value="想最愛的人" /> 想最愛的人<br/>
        <form:checkbox path="favor" value="旅遊"       /> 旅遊<br/>
        <form:checkbox path="favor" value="看科幻電影" /> 看科幻電影<br/>
        <form:checkbox path="favor" value="睡覺"       /> 睡覺<br/>
        
        <input type="submit" name="_target1"  value="上一步" />
        <input type="submit" name="_finish"   value="確定"   />
        <input type="submit" name="_cancel"   value="取消"   />
      </form:form>
    </div>
    
    <%@ include file="footer.jsp" %>
  
  </body>
  
</html>