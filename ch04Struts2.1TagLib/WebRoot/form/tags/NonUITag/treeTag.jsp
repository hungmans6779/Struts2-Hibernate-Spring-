<%@ page language="java" contentType="text/html; charset=utf-8" %>

<%@ page import="java.util.*" %>

<%@ taglib uri="/struts-tags"       prefix="struts"  %>
<%@ taglib uri="/struts-dojo-tags"  prefix="sx"      %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'errorMessageTag.jsp' starting page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <sx:head />
  </head>
  
  <body>
  
    <%--
      《tree、treenode》：主要用來產生一個樹狀結構，例如常見的樹狀選單和樹狀列表。
                          其中 
                             tree    ：用來產生樹狀結構。
                             treenode：標籤用來產生樹狀結構中的節點。
    --%>
   
    <sx:tree label="電腦程式設計系列圖書" 
             id="books" 
             showRootGrid="true"
             showGrid="true"
             treeSelectedTopic="treeSelected" >
             
      <sx:treenode label="Java 基礎" id="ajax" >
        <sx:treenode label="Java 程式設計 案例教學" id="javascript" />
        <sx:treenode label="JSP 實作教學"           id="javascript" />
        <sx:treenode label="Ajax + JSP 巧學巧用"    id="javascript" />
        <sx:treenode label="Ajax 完全學習手冊"      id="ajaxsz"     />
      </sx:treenode>
      <sx:treenode label="WebFramework" id="Java" >
        <sx:treenode label="JSF 開發從入門到精通"       id="jsf"       />
        <sx:treenode label="SSH 從入門到精通"           id="ssh"       />
        <sx:treenode label="Struts2.x 完全學習手冊"     id="struts"    />
        <sx:treenode label="Hibernate3.x 從入門到精通"  id="hibernate" />
      </sx:treenode>
    </sx:tree>
    
  </body>
  
</html>
