<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<%@ page import="java.util.*" %>

<%@ taglib uri="/struts-tags"      prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags" prefix="sx"     %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>《UI》 標籤：【表單標籤】： 主要用於產生 HTML 中的表單 </title>
    <sx:head />
    <style>
      body {
	    background-image: url("/ch04Struts2.1TagLib/images/bg-0291.gif");
      }
    </style>
  </head>
  
  <body>
  
    <%--
       doubleselect：用來產生兩個相互關聯的下拉式選單，當選擇第1個下拉式選單的值時，第2個下拉式選單的內容會改變，
                     這兩個下拉式選單是相互關聯的，相當於串聯下拉式清單。
    --%>
  
  
    <struts:form action="doubleselect" namespace="/ch04TagLibNS" >
    
      <struts:set name="pc" 
                  value="#{'北京市':{'朝陽區','西城區','海澱區'},
                          '上海市':{'黃埔區','南匯區','徐匯區'},
                          '鄭州市':{'二七區','金水區','鄭東新區'} }"  />
            
      <struts:doubleselect name="city" 
                           list="#pc.keySet" 
                           doubleName="area"
                           doubleList="#pc[top]"
                           label="所在城市" />
                           
      <struts:submit value="提 交" /> 
      
    </struts:form>
    
  </body>
  
</html>
