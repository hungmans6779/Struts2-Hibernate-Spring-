<%@ page language="java" contentType="text/html; charset=utf-8" %>

<%@ taglib uri="/struts-tags"  prefix="struts" %>
<div style="background:#eeeeee;" >
  JSP 自訂模版<br/> 圖書清單：
  <struts:select list="parameters.list" />
</div>