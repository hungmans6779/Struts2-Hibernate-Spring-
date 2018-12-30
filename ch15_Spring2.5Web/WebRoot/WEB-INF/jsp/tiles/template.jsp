<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib uri="http://jakarta.apache.org/struts/tags-tiles" prefix="tiles" %>

<!--  範本檔 -->


<html>

  <head>
    <title><tiles:getAsString name="title" /></title>
  </head>
  
  <body>
    <table width="100%" border="0" >
      <tr>
        <td><tiles:insert name="header" /></td>  <!-- 定義頁首 -->
      </tr>
      <tr>
        <td><tiles:insert name="body" /></td>    <!-- 定義內容區 -->
      </tr>
      <tr>
        <td><tiles:insert name="footer" /></td>  <!-- 定義頁尾 -->
      </tr>
    </table>
    
  </body>
  
</html>