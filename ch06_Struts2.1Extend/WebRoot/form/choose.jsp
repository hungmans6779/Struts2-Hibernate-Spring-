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
    <script type="text/javascript" >
      <!--
        function changeLocale(){
          document.langForm.submit();
        }
      //-->
    </script> 
  </head>
  
  <body> 
    
    <!--  
      實現自由選擇語言環境：很多完善的網站系統中，通常會提供一個下拉式清單方塊讓使用者自行選擇語言環系。  
    -->
    
    <div id="topMain">
    
      <div id="top"> 
        <a href="index.html">
          <img src="/ch06_Struts2.1Extend/images/logo.gif" alt="charged"  border="0" class="logo" />
        </a> 
        
        <struts:form name="serch" action="#" method="post" theme="simple" >
          <struts:textfield  name="serch" cssClass="txtBox1" />
          <struts:submit     name="go"    key="huizhi.go"    />
        </struts:form>
      </div><!--top end -->

    </div><!--topMain end -->



    <div id="navMain">

      <div id="nav">

        <ul>
          <li><a href="#" class="hover" ><struts:text name="huizhi.home"  /></a></li>
          <li><a href="#" ><struts:text name="huizhi.about"    /></a></li>
          <li><a href="#" ><struts:text name="huizhi.forum"    /></a></li>
          <li><a href="#" ><struts:text name="huizhi.class"    /></a></li>
          <li><a href="#" ><struts:text name="huizhi.blog"     /></a></li>
          <li><a href="#" ><struts:text name="huizhi.support"  /></a></li>
          <li>
          
          
             <%--
                此程式碼把英語、簡體、繁體的 Locale 儲存在一個 Map 物件中，i18n 攔截器會自動尋找用戶端請求一個名字為request_locale 的參數，
                並根據該參數的值產生實體一個 Locale 物件，該物件是地區語言環境類別，然後 Struts2.x 會把 Locale 物件儲存在 Session 中一個名字為
                WW_TRANS_I18N_LOCALE 的屬性中，該屬性的值將會作為瀏覽器預設的 Locale 。
             --%>
             
             <!-- 將使用者 session 中的 i18n 資訊設定成 SESSION_LOCALE -->
             <struts:set name="SESSION_LOCALE"  value="#session['WW_TRANS_I18N_LOCALE']" />
             
             
             <!-- 透過 com.action.ChooseAction 類別，將 SESSION_LOCALE 的值傳入 current -->
             <struts:bean id="localeList" name="com.action.ChooseAction" >
                <!-- 如果該值為空，則為本機的Locale，否則為選擇的 SESSION_LOCALE -->
                <struts:param name="current" value="#SESSION_LOCALE==null ? locale : #SESSION_LOCALE"  />
             </struts:bean>
             
             
             
             <form action="<struts:url />" name="langForm" >
                <struts:select cssStyle="width:100px" 
                               list="#localeList.locales" 
                               name="request_locale"
                               value="#SESSION_LOCALE==null ? locale : #SESSION_LOCALE"
                               id="langSelecter"
                               listKey="value"
                               listValue="key"
                               onchange="changeLocale()"  
                               theme="simple" />
             </form>
             
             
          </li>
        </ul>
        
      </div>  <!-- end id="nav" -->
      
    </div> <!--  end id="navMain" -->
    
  </body>
 
</html>
