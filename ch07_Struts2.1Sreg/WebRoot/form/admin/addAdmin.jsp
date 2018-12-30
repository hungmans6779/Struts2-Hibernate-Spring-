<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>

<%@ taglib uri="/struts-tags"       prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags"  prefix="sx"     %>


<%@ include file="/form/admin/header.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title><struts:text name="add.admin" /></title>
    <sx:head />
    <style>
      body{
	    width:100%;
	    background-image: url('/ch07_Struts2.1Sreg/images/bg.gif');
      }
    </style>
    <script type="text/javascript" >
      /*
	  function addadmin(){
		var qx=${qx}
		if(qx!=2){
			alert("您的權限不夠!");
			return false;
		}
	  }
	  */
    </script>
  </head>
  
  <body>
    
    <center>
      
      <div style="align:center;width:100%"  >
        
        <font color='red'><struts:property value="tip" /></font>
        <br/>
        
        <struts:text name="add.admin" />
        
        <struts:form action="addAdmin" namespace="/ch07SregNS" >
          <struts:textfield name="adminname" key="UserName" />
          <struts:password  name="password"  key="PassWord" />
          <struts:textfield name="name"      key="Name"     />
          <struts:textfield name="qx"        key="qx"       />
          
          <struts:submit  key="Register" />
        </struts:form>
        
      </div>
    
    </center>
  
  
    <div style="clear:both" ></div>
    
    <%@ include file="/footer.jsp"%> 
    
  </body>
  
</html>