<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>

<%@ taglib uri="/struts-tags"       prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags"  prefix="sx"     %>

<%@ include file="/form/user/header.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title><struts:text name="users.welcome" /></title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
    <sx:head />
  </head>
  
  <body>
    
    <center>
      
      <font size="2" >
        <struts:text name="users.welcome" >
          <struts:param>
            <struts:property value="username" />
          </struts:param>
        </struts:text>
       </font>
     
       <br/><br/>
       
       <font size="2" >
         <struts:a href="findalluser.action?type=users" namespace="/ch07SregNS"  >
           <struts:text name="find.allusers" />  <%-- 查看所有用戶 --%>
         </struts:a>
       </font>
       
    </center>
    
    
    <div style="clear:both" ></div>
    
    <%@ include file="/footer.jsp" %>
  
  </body>
  
</html>