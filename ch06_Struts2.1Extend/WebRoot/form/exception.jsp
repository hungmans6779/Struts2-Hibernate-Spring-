<%@ page language="java" pageEncoding="UTF-8"  contentType="text/html; charset=UTF-8" %>

<%@ page import="java.util.*" %>

<%@ taglib  uri="/struts-tags"        prefix="struts"  %>
<%@ taglib  uri="/struts-dojo-tags"   prefix="sx"      %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title><struts:text name="huizhi.title" /></title>
    <sx:head />
  </head>
  
  <body> 
    
    <struts:form action="exception" theme="simple" >
      <struts:textfield name="a" label="" cssStyle="width:60px"  /> 除以
      <struts:textfield name="b" label="" cssStyle="width:60px"  /> 等於
      <struts:textfield name="c" label="" cssStyle="width:60px"  />
        
      <struts:submit value="計 算" method="jisuan"  />
    </struts:form>
    
  </body>
  
</html>
