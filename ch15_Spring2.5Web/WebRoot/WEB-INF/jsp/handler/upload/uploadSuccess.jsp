<%@ page language="java" contentType="text/html; charset=UTF-8" %> 

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"   %>
<%@ taglib  uri="http://www.springframework.org/tags"     prefix="spring" %>

<html>
  <head>
    <title>窗內網論壇</title>
    <style>
      .formStyle {
        width: 195px;
        text-align: left
      }
    </style>
  </head>
 
  <body>
 
    <%@ include file="header2.jsp" %>
 
    <div style="float:left;text-align:left;width:100%">

      <form:form>檔案上傳成功<br>
        檔案名：${description.filename}<br>
        <img src="upload/${description.filename}" ><br>
        檔案描述：${description.description}<br>
      </form:form>
  
    </div>
    <%@ include file="footer.jsp"%>

  </body>

</html>