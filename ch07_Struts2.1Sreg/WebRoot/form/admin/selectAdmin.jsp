<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*"  %>

<%@ taglib uri="/struts-tags"      prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags" prefix="sx"     %>

<%@ include file="/form/admin/header.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title><struts:text name="show.info"/></title>
    <sx:head />
    <style>
      body{
	    width:900px;
	    background-image: url('../images/bg.gif');
      }
      
      ul,li{
	    list-style: none;
	    float:left;
      }
      
      ul.newuul{width:900px;}
      
      li.newuli{
	    width:160px;
	    border:1px solid gray;
      }
    </style>
  </head>
  
  <body>
  
    <center>
		
	  <div style="align:center;width:1000px;"  >
		
		<struts:text name="show.info" />
  
	
        <struts:form action="updateAdmin" method="post" >
    	  <struts:textfield name="adminname" key="UserName" value="%{#session.admin.adminname}"  readonly="true" />
    	  <struts:textfield name="password"  key="PassWord" value="%{#session.admin.password}"                   />
    	  <struts:textfield name="name"      key="Name"     value="%{#session.admin.name}"                       />
    	  <struts:textfield name="qx"        key="qx"       value="%{#session.admin.qx}"                         />
    	  <struts:hidden    name="id"        value="%{#session.admin.id}"                                        />
    	  <struts:submit  key='Update'  /> 				
        </struts:form>
	
	  </div>
	
	</center>
	
	<div style="clear:both;" ></div>
	
	<%@ include file="/footer.jsp" %>
  
  </body>
  
</html>
