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
   <%--
       subset 用於截取集合的一部份，形成一個新的子集合。 
       相關屬性值如下所示：
       source ：可選屬性，該屬性用來指定來源集合。
       count  ：可選屬性，該屬性用來指定子集合中元素的個數，如果不指定該屬性，則預設取得來源集合中的所有元素。 
       start  ：可選屬性，該屬性用來指定從來源集合的第幾個元素開始擷取。
       decider：可選屬性，該屬性用來指定是否勾選目前元素。
    --%>
    <struts:subset source="{'Java 程式設計 案例教學','JSP 實作教學','Struts 2 完全學習手冊','SSH 從入門到精通'}"
                   start="1" count="2" >
      <struts:iterator status='st' >
        <struts:if test="#st.odd" >
          <ul style="background-color:wheat;width:400px;" >
             <li style="width:400px" ><struts:property /></li>
          </ul>
        </struts:if> 
        <struts:elseif test="#st.even" >
          <ul style="background-color:green;width:400px;" >
             <li style="width:400px" ><struts:property /></li>
          </ul>
        </struts:elseif> 
      </struts:iterator>               
    </struts:subset>
    
  </body>
  
  
</html>
