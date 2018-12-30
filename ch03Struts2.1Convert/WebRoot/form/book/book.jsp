<%@ page language="java" contentType="text/html;charset=UTF-8" %>

<%@ taglib uri="/struts-tags"         prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags"    prefix="sx"     %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'book.jsp' starting page</title>
    <sx:head />
  </head>
  
  <body>
    <struts:form action="book"  namespace="/ch03ConvertNS" >
      <struts:textfield name="name"  label="圖書名稱" />
      <struts:textfield name="price" label="價    格" />
      <struts:textfield name="num"   label="發行數量" />
      
      <struts:submit value="送 出" method="addBook"  />
    </struts:form>
  </body>
  
</html>
