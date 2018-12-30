<%@ page language="java" pageEncoding="UTF-8"  contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>

<%@ taglib  uri="/struts-tags"        prefix="struts"  %>
<%@ taglib  uri="/struts-dojo-tags"   prefix="sx"      %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title><struts:text name="huizhi.title" /></title>
    <link rel="stylesheet" type="text/css" href="/css/style.css" />
    <sx:head /> 
  </head>
  
  <body> 
   
    <%--
      OGNL：Object-Graph Navigation Lanuage 物件導向語言
      
      1."#" 符號：
        (1) 存取 OGNL 上下文和 Action 上下文，相當於 ActionContext.getContext()。
        (2) 用於過濾和投影集合，例如： books.{?#this.price<100}。
        (3) 用於建構Map，例如：#{'book1':'23','book2':'55'}
       
       
      2. "%" 符號：
         "%" 符號的用途是當標籤的屬性為字串型態時，計算OGNL 運算式的值。
      
         
      3. "$" 符號：
         (1)  在國際化資源檔中使用OGNL 運算式，例如：年齡必須在 ${min} 和 ${max} 之間。
         (2)  在 Struts2.x 設定檔中使用 ONGL 運算式。
    --%>
    <p>request userName    ：<struts:property value="#request.userName"     /></p>
    <p>session userName    ：<struts:property value="#session.userName"     /></p>
    <p>application userName：<struts:property value="#application.userName" /></p>
    <hr/>
    
    
    <struts:iterator value="newList" >
      <struts:property value="nid" />. &nbsp; 
      <struts:property value="ntitle" />. &nbsp; 
      <struts:property value="ncontent" />
      <br/>
    </struts:iterator>
    <hr/>
    
    
    ID是 1 新聞標題： <struts:property value="newList.{?#this.nid==1}.{ntitle}[0]" /><br/>
    ID是 2 新聞標題： <struts:property value="newList.{?#this.nid==2}.{ntitle}[0]" /><br/>
    <hr/> 
     
     
    <struts:set name="books" value="#{'book1':'23','book2':'55'}" />
    book1的價格是： <struts:property value="#books.book1"    /> 元<br/>
    book2的價格是： <struts:property value="#books['book2']" /> 元<br/>
    <hr/> 
     
    
    <h3> % 的用途</h3> 
    <p><struts:url value="#books['book1']" /></p> 
    <p><struts:url value="%{#books['book1']}" /></p> 
     
  </body>
  
</html>
