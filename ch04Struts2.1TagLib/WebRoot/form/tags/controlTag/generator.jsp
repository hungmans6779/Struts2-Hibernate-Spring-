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
       generator 用於將一個字串解析成一個集合。 
       相關屬性值如下所示：
       count    ：可選屬性，用來指定所產生集合中元素的總數。
       val      ：必選屬性，指定被解析的字串。 
       separator：必選屬性，用來指定分隔符號。
       converter：可選屬性，用來指定一個轉換器，該轉換器負責將集合中的每個字串轉換成物件。
       id       ：可選屬性，如果指定該屬性，則新產生的集合會被放在 pageContext 屬性中。
   
    --%>
    <struts:generator val="'Java 程式設計 案例教學,Ajax + JSP 巧學巧用,Struts 2 完全學習手冊,JSP 實作教學,JSF 開發從入門到精通'"
                      separator=',' id="genStr" >
      <struts:iterator id="itStr"  value="#genStr" status='st' >
        <!-- 
        <ul <struts:if test="#st.odd" >style="background-color:wheat;width:400px;"</struts:if> >
          <li style="width:400px" ><struts:property value="#itStr" /></li>
        </ul>
        -->
        <struts:if test="#st.odd" >
          <ul style="background-color:wheat;width:400px;" >
             <li style="width:400px" ><struts:property value="#itStr" /></li>
          </ul>
        </struts:if> 
        <struts:elseif test="#st.even" >
          <ul style="background-color:green;width:400px;" >
             <li style="width:400px" ><struts:property value="#itStr" /></li>
          </ul>
        </struts:elseif> 
      </struts:iterator>
                        
    </struts:generator>
    
  </body>
  
  
</html>
