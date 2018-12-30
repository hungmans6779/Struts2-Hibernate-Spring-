<%@ page language="java" contentType="text/html;charset=UTF-8" %>

<%@ taglib uri="/struts-tags"         prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags"    prefix="sx"     %>



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'news.jsp' starting page</title>
    <sx:head />
  </head>
  
  <body>

    <struts:form action="public"  namespace="/interceptorNS"  >
      <struts:textfield name="title"    label="標題"  />
      <struts:textarea  name="content" cols="30" rows="5" label="內容"  />
      
      <struts:submit value="傳 送"  />
    </struts:form>

  </body>
  
</html>
