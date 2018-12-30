<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>

<%@ taglib uri="/struts-tags"       prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags"  prefix="sx"     %>

<%@ include file="/form/user/header.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>
      <struts:text name="show" ><struts:param>${users.username}</struts:param></struts:text>
    </title>
    <sx:head />
    <link href="/ch07_Struts2.1Sreg/css/main.css" type="text/css"  rel="stylesheet" >
    <style>
      body {
	    background-color:#7BA5EA;
      }
    </style>

  </head>
  
  <body>
    
    <br/><br/>
    
    <center>

      <h3>
        <struts:text name="show" >
          <struts:param><struts:property value="#session.users.username" /></struts:param>
        </struts:text>
      </h3>
      
      
      <div style="padding:0px;width:50%;" class="toptable grid" >
        
        <ul style="background:url(/ch07_Struts2.1Sreg/images/r_0.gif);width:100%;">
	      <li><struts:text name="show"><struts:param>${users.username}</struts:param></struts:text></li>
        </ul>
        
        <struts:form action="findalluser.action?type=users" mehtod="post" namespace="/ch07SregNS" >
          <struts:textfield name="username"  key="UserName"           value="%{#session.users.username}"                     />
          <struts:textfield name="password"  key="PassWord"           value="%{#session.users.password}"                     />
          <struts:textfield name="name"      key="Name"               value="%{#session.users.name}"                         />
          <struts:textfield name="nick"      key="NickName"           value="%{#session.users.nic}"                          />
          <struts:textfield name="sex"       key="Sex"                value="%{#session.users.sex}"                          />
          <struts:textfield name="age"       key="Age"                value="%{#session.users.age}"                          />
          <struts:textfield name="email"     key="Email"              value="%{#session.users.email}"                        />
          <struts:textfield name="phone"     key="Phone"              value="%{#session.users.phone}"                        />
          <struts:textarea  name="selfshow"  key="brief.introduction" value="%{#session.users.selfshow}" cols="30" rows="5"  />

          <struts:submit key="Back"  />
        </struts:form>
      
      </div>
      
    </center>

    <div style="clear:both" ></div>

    <%@ include file="/footer.jsp" %>

  </body>
  
</html>