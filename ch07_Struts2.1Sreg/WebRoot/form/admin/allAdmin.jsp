<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*"  %>

<%@ taglib uri="/struts-tags"      prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags" prefix="sx"     %>

<%@ include file="/form/admin/header.jsp" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title><struts:text name="find.alladmin" /></title>
    <sx:head />
    <style>
      body{
	    width:1000px;
	    background-image: url('/ch07_Struts2.1Sreg/images/bg.gif');
      }
      ul,li{
	    list-style: none;
	    float:left;
      }
      ul.newuul{ width:1000px;}
      
      li.newuli{
	    width:140px;
	    border:1px solid gray;
	  }
    </style>
    <script type="text/javascript">
  	  function del(){
  		if(!confirm('您確定要刪除嗎？')){
  		  return false;
  		}
  		
  		var qx=${qx};
  		if(qx!=2){
  		  alert("您的權限不夠!");
  		  return false;
  		}
  	  } // end del()
  	
  	
  	  function update(){
  		var qx=${qx}
  		if(qx!=2){
  		  alert("您的權限不夠!");
  		  return false;
  		}
  	  } // end update()
    </script>
    
  </head>
   
  
  
  <body> 
  
    <center>		
	  
	  <div style="align:center;width:1000px;"  >
	  
		<struts:text name="find.alladmin" />
		<ul class="newuul">
		  <li class="newuli" ><struts:text name="UserName" /></li>
		  <li class="newuli" ><struts:text name="PassWord" /></li>
		  <li class="newuli" ><struts:text name="Name"     /></li>
		  <li class="newuli" ><struts:text name="qx"       /></li>
		  <li class="newuli" ><struts:text name="Update"   /></li>
		  <li class="newuli" ><struts:text name="delete"   /></li>
		</ul> 
		<struts:iterator value="list">
		  <ul class="newuui"  onmouseover="this.className='highlight'" onmouseout="this.className=''">
			<li class="newuli" ><struts:property value="adminname" /></li>
		    <li class="newuli" ><struts:property value="password"/></li>
			<li class="newuli" ><struts:property value="name"/></li>
			<li class="newuli" ><struts:property value="qx"/></li>
		    <li class="newuli" ><struts:a href="findAdmin.action?id=%{id}" onclick="return update();" ><struts:text name="Update"/></struts:a></li>
		    <li class="newuli" > 
			  <struts:a href="deleteAdmin.action?id=%{id}" onclick="return del();" ><struts:text name="delete" /></struts:a>
			</li>
		  </ul>	
		</struts:iterator>
		
      </div>
	
	</center>  
    
    <div style="clear:both" ></div>
    
    <%@ include file="/footer.jsp" %>
    
  </body>
  
  
</html>
