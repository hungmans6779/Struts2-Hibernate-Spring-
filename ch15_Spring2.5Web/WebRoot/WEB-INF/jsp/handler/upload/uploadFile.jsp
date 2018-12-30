<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"    %>
<%@ taglib uri="http://www.springframework.org/tags"      prefix="spring"  %>

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
  
    <div style="float:left;text-align:left;width:100%" >
    
      <%-- 
        multipart/form-data，表示可以上傳檔案，以二進位傳輸資料。
        其中標籤名 attach 和 description 與表單物件 UploadBean 中的屬性相對應。
      --%>
      <form:form enctype="multipart/form-data" >檔案上傳<br>
        附件：<input type="file" name="attach" /><br><br>
        描述：<form:textarea path="description" cssClass="formStyle" /><br>
        <input type="submit" value="傳送" />
        <input type="reset"  value="重置" />
      </form:form>

    </div>
  
    <%@ include file="footer.jsp"%>

  </body>
  
</html>