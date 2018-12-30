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
       updownselect：與select 標籤非常相似，不同的是，updownselect 標籤在產生清單方塊時同時產生 3個按鈕，
                     分別是表示上移、下移和全選。
                     
       相關屬性值如下所示：
       allowMoveUp   ：用來設定是否顯示支援上移的按鈕，預設值是 true，即顯示該按鈕。
       allowMoveDown ：用來設定是否顯示支援下移的按鈕，預設值是 true，即顯示該按鈕。
       allowSelectAll：用來設定是否顯示支援全選的按鈕，預設值是 true，即顯示該按鈕。
       moveUpLabel   ：用來設定支援上移按鈕的文字，預設值是""。
       moveDownLabel ：用來設定支援下移按鈕的文字，預設值是""。  
       selectAllLabel：用來設定支援全選按鈕的文字，預設值是"*"。         
    --%>
 
    <struts:form action="updownselect"  namespace="/ch04TagLibNS" >
     
      <struts:updownselect name="books1" 
                           list="{'SSH 從入門到精通','Struts2.x 從入門到精通','Ajax 實戰'}" 
                           label="圖書列表"
                           headerKey="-1" headerValue="------ 請選擇 ------"
                           emptyOption="true" selectAllLabel="全選" moveUpLabel="上移" moveDownLabel="下移" />
      
     
     
      <struts:updownselect  name="books2" 
                            list="#{'Java':'Java','.NET':'.NET','Database':'Database'}" 
                            label="您所關心的領域"
                            headerKey="-1" headerValue="------ 請選擇 ------"
                            emptyOption="true" selectAllLabel="全選" moveUpLabel="上移" moveDownLabel="下移" />
     
     
 
     
      <struts:bean name="com.bean.BookService" id="bs" />
      <struts:updownselect  name="books3"
                            list="#bs.books" 
                            listKey="name" listValue="name"
                            label="圖書列表"
                            headerKey="-1" headerValue="------ 請選擇 ------"
                            emptyOption="true" selectAllLabel="全選" moveUpLabel="上移" moveDownLabel="下移" />
      
      
      <struts:submit value="提 交" />
      
    </struts:form>
    
    
  </body>
  
</html>
