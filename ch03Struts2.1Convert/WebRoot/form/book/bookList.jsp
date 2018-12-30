<%@ page language="java" contentType="text/html;charset=UTF-8" %>

<%@ taglib uri="/struts-tags"         prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags"    prefix="sx"     %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'bookList.jsp' starting page</title>
    <sx:head />
  </head>
  <body>
    <struts:form action="bookList"  namespace="/ch03ConvertNS" >
   
      <struts:iterator value="new int[3]" status="stat" >
        <tr>
          <td> 
            第 <struts:property value="#stat.index+1" /> 本書：
          </td>
        </tr>
        <struts:textfield name="bookList[%{#stat.index}].name"   label="圖書名稱"   />
        <struts:textfield name="bookList[%{#stat.index}].price"  label="價    格"   />
        <struts:textfield name="bookList[%{#stat.index}].num"    label="發行數量"   />
        <tr height='20pt' ><td></td></tr>
      </struts:iterator>
      <struts:submit value="增加" method="addBook"  /> 
        
    </struts:form>
  </body>
  
</html>
