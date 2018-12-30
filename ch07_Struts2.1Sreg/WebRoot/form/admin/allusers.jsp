<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>

<%@ taglib uri="/struts-tags"       prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags"  prefix="sx"     %>

<%@ include file="/form/user/header.jsp" %>
 
<%--
   檢視所有一般使用者
--%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title><struts:text name="find.allusers" /></title>
    <sx:head />
    <style type="text/css">
      ul,li{
	    list-style: none;
	    float:left;
      }
    </style>
  </head>
  
  <body>
     
    <center style="align:center" >
  
      <br/><br/>
      
      <div style="align:center;width:100%;" >
      
        <struts:text name="find.allusers" />
        
        <ul style="width:100%;margin-left:10px" >
          <li style="width:15%;border-top:1px solid gray;border-right:1px solid gray;border-bottom:1px solid gray;" class="category" >
            <struts:text name="UserName" />
          </li> 
          <li style="width:20%;border-top:1px solid gray;border-right:1px solid gray;border-bottom:1px solid gray;" class="category">
			<struts:text name="NickName" />
		  </li>
		  <li style="width:20%;border-top:1px solid gray;border-right:1px solid gray;border-bottom:1px solid gray;" class="category">
			<struts:text name="Name" />
		  </li>
		  <li style="width:20%;border-top:1px solid gray;border-bottom:1px solid gray;" class="category">
		    <struts:text name="look.detailed" />
		  </li>
        </ul>
        <struts:iterator value="list" >
          <ul style="width:100%;margin-left:10px;" onmouseover="this.className='highlight'" onmouseout="this.className=''" >
            <li style="width:15%;border-right:1px solid gray;border-bottom:1px solid gray;" > 
			  <struts:property value="username" />
			</li>
			<li style="width:20%;border-right:1px solid gray;border-bottom:1px solid gray;" >
			  <struts:property value="nic" />
			</li>
			<li style="width:20%;border-right:1px solid gray;border-bottom:1px solid gray;" > 
			  <struts:property value="name"/>
		    </li>
			<li style="width:20%;border-bottom:1px solid gray;" > 
			  <struts:a href="selectinfo.action?username=%{username}&type=allusers" >
			    <struts:text name="look.detailed" />
			  </struts:a>
			</li>  
          </ul>
        </struts:iterator>
      </div>
      
    </center>  

    <div style="clear:both" ></div>
    
    <%@ include file="/footer.jsp" %>
 
  </body>
  
</html>