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
       optiontransferselect：與 updownselect 標籤非常相似，不同的是，optiontransferselect 標籤產生兩個清單方塊，
                             在每個清單方塊中都可以對選項進行上移、下移和全選等操作，而且在這兩個清單方塊之間可以進行左移、右移和全選等操作。
                     
       相關屬性值如下所示：
       
       addAllToLeftLabel  ：用來設定【全部左移】按鈕上的文字。
       addAllToRightLabel ：用來設定【全部右移】按鈕上的文字。
       addToLeftLabel     ：用來設定【左移】按鈕上的文字。
       addToRightLabel    ：用來設定【右移】按鈕上的文字。
       allowAddAllToLeft  ：用來設定是否出現【全部左移】按鈕上的文字。
       allowAddAllToRight ：用來設定是否出現【全部右移】按鈕上的文字。
       allowAddToLeft     ：用來設定是否出現【左移】按鈕上的文字。
       allowAddToRight    ：用來設定是否出現【右移】按鈕上的文字。
       leftTitle          ：用來設定左邊清單方塊的標題。
       rightTitle         ：用來設定右邊清單方塊的標題。
       allowSelectAll     ：用來設定是否出現【全部選擇】按鈕上的文字。
       selectAllLabel     ：用來設定【全選】按鈕上的文字。
       name               ：用來設定第一個清單方塊的 name 屬性。
       value              ：用來設定第一個清單方塊的 value 屬性。
       multiple           ：用來設定第一個清單方塊是否可以多選。
       list               ：用來設定第一個清單方塊的集合。
       listKey            ：用來設定第一個清單方塊選項 value 的集合。
       listValue          ：用來設定第一個清單方塊選項 label 的集合。
       doubleList         ：用來設定第二個清單方塊的集合。
       doubleListKey      ：用來設定第二個清單方塊選項 value 的集合。
       doubleListValue    ：用來設定第二個清單方塊選項 label 的集合。
       doubleName         ：用來設定第二個清單方塊的 name 屬性。
       doubleValue        ：用來設定第二個清單方塊的 value 屬性。
       doubleMultiple     ：用來設定第二個清單方塊是否可以多選。
      
    --%>
 
    <struts:form action="optiontransferselect"  >
    
      <struts:optiontransferselect name="canSkills" 
                                   label="您目前已經掌握的技術" 
                                   leftTitle="技術資訊列表"
                                   rightTitle="您的選擇"
                                   list="{'HTML','JavaScript','Ajax','JSP','SSH','Servlet','JavaBean','Struts2.x','Hibernate3.x','Spring3.x','JSF'}"
                                   multiple="true"
                                   headerKey="headerKey"
                                   headerValue="------ 請選擇 ------"
                                   emptyOption="true"
                                   doubleList=""
                                   doubleName="rightSideCartoonCharacters"
                                   doubleHeaderKey="doubleHeaderKey"
                                   doubleHeaderValue="------ 請選擇 ------"
                                   doubleEmptyOption="true"
                                   doubleMultiple="true"
                                   addAllToLeftLabel="全部左移"
                                   addAllToRightLabel="全部右移"
                                   addToLeftLabel="左移"
                                   addToRightLabel="右移"
                                   selectAllLabel="全選"
                                   rightDownLabel="下移"
                                   rightUpLabel="上移"
                                   leftDownLabel="下移"
                                   leftUpLabel="上移" />
      
      
    </struts:form>
    
    
  </body>
  
</html>
