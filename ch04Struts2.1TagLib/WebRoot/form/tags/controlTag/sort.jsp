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
       sort 用於對集合進行排序。 
       相關屬性值如下所示：
       comparator ：可選屬性，該屬性用來指定來源集合。
       source  ：可選屬性，該屬性用來指定子集合中元素的個數，如果不指定該屬性，則預設取得來源集合中的所有元素。 
    --%>
    
    <struts:bean id="myComparator" name="com.MyComparator" />
    
    <struts:sort source="{'1111111111','2222','333333','4444444'}" comparator="#myComparator" >
    
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
               
    </struts:sort>
    
  </body>
  
  
</html>
