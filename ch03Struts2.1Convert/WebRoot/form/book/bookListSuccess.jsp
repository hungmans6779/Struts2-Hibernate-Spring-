<%@ page language="java" contentType="text/html;charset=UTF-8" %>

<%@ taglib uri="/struts-tags"         prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags"    prefix="sx"     %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'bookListSuccess.jsp' starting page</title>
    <sx:head />
  </head>
        
  <body>
    bookList 共有：<struts:property value="bookList.size" /> 本書！！！<br/><br/><br/>
    <struts:iterator value="bookList" id="book" status="stat" >
      第 <struts:property value="#stat.index+1" /> 本書：<br/>
      圖書名稱：<struts:property  value="name"  /><br/>
      價    格：<struts:property  value="price" /><br/>
      發行數量：<struts:property  value="num"   /><br/>
      <br />
    </struts:iterator>
  </body>
  
</html>
