<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>

<%@ taglib uri="/struts-tags"       prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags"  prefix="sx"     %>

<%@ include file="/form/user/header.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title><struts:text name="show.info" /></title>
    <sx:head />
    <script type="text/javascript" >
  	  function back(){
  		history.go(-1);
  	  }
    </script>
  </head>
  
  <body>
    
    <br/><br/>
    
    <center>
    	 
      <div style="align:center;width:900px;"  >
			
	    <struts:text name="show.info" />
        
        <font color='red' ><struts:property value="tip" /></font>
        
        
        <struts:form action="update" mehtod="post" namespace="/ch07SregNS" >
          <struts:textfield name="username" key="UserName"           value="%{#session.users.username}" readonly="true"    />
          <struts:textfield name="password" key="PassWord"           value="%{#session.users.password}"                    />
          <struts:textfield name="name"     key="Name"               value="%{#session.users.name}"                        />
          <struts:textfield name="nic"      key="NicName"            value="%{#session.users.nic}"                         />
          <struts:textfield name="sex"      key="Sex"                value="%{#session.users.sex}"                         />
          <struts:textfield name="age"      key="Age"                value="%{#session.users.age}"                         />
          <struts:textfield name="email"    key="Email"              value="%{#session.users.email}"                       />
          <struts:textfield name="phone"    key="Phone"              value="%{#session.users.phone}"                       />
          <struts:textarea name="selfshow"  key="brief.introduction" value="%{#session.users.selfshow}" cols="30" rows="5" />
             
          <struts:hidden name="id" value="%{#session.users.id}" />
          
          <struts:submit key="Update" />
        </struts:form>
      
      </div>
      
    </center>

    <div style="clear:both" ></div>

    <%@ include file="/footer.jsp" %>

  </body>
  
</html>