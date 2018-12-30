<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>

<%@ taglib uri="/struts-tags"      prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags" prefix="sx"     %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>【邏輯控制標籤】：主要用於進行條件和迴圈等流程控制</title>
    <sx:head />
  </head>
  
  <body>
    
    <struts:set name="dataObj" value="85"  />
    
    <struts:if test="#dataObj >=90" >成績優秀</struts:if> 
    <struts:elseif test="#dataObj >=80" >成績良好</struts:elseif>
    <struts:elseif test="#dataObj >=60" >成績合格</struts:elseif>
    <struts:else>成績不合格</struts:else>
     
  </body>
  
  
</html>
