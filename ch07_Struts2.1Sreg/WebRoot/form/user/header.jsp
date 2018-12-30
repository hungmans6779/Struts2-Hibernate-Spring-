<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>

<%@ taglib uri="/struts-tags"       prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags"  prefix="sx"     %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
    <sx:head />
	<style type="text/css">
      <!-- 
        body {
	      background-image: url('/ch07_Struts2.1Sreg/images/bg.gif');
	      font-size: 12px;
        }

        .style4 {
	      color: #333399
        }

        * {
	      margin: 0px;
	      padding: 0px;
        }
     -->
    </style>
  </head>
  
  <body>
    
    <center>
      <ul style="width: 900px; height: 68px;">
		<li style="width: 200px; height: 79px; float: left;">
		  <img src="/ch07_Struts2.1Sreg/images/logo.jpg" >
		</li>
		<li	style="width: 700px; margin-top: 30px; float: left; text-align: right;">
		  <script language="javascript" >
	        // 製作年月日的JavaScript程式碼
	       var today = new Date();
	        var month = today.getMonth() + 1;
	        if (today.getDay() == 1) {
		       document.write("&nbsp;" + today.getFullYear() + " 年" + month + "月"+ today.getDate() + "日 星期一");
	        }
	        if(today.getDay() == 2) {
		       document.write("&nbsp;" + today.getFullYear() + " 年" + month + "月"+ today.getDate() + "日 星期二");
	        }
	        if (today.getDay() == 3) {
		       document.write("&nbsp;" + today.getFullYear() + " 年" + month + "月"+ today.getDate() + "日 星期三");
	        }
	        if (today.getDay() == 4) {
		      document.write("&nbsp;" + today.getFullYear() + " 年" + month + "月"+ today.getDate() + "日 星期四");
	        }
	        if (today.getDay() == 5) {
		      document.write("&nbsp;" + today.getFullYear() + " 年" + month + "月"+ today.getDate() + "日 星期五");
	        }
	        if (today.getDay() == 6) {
		      document.write("&nbsp;" + today.getFullYear() + " 年" + month + "月"+ today.getDate() + "日 星期六");
	        }
	        if (today.getDay() == 0) {
		      document.write("&nbsp;" + today.getFullYear() + " 年" + month + "月"+ today.getDate() + "日 星期日");
	        }
		  </script>
	      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|
		  <span class="style4" ><struts:text name="login.users" />:${username}</span>&nbsp;&nbsp;|
		  <a href="/ch07_Struts2.1Sreg/form/user/index.jsp" ><struts:text name="home" /> </a>|
		  <a href="/ch07_Struts2.1Sreg/ch07SregNS/findalluser.action?type=users" ><struts:text name="find.allusers" /> </a>|
		  <a href="/ch07_Struts2.1Sreg/ch07SregNS/selectinfo.action?username=${username}&type=users"><struts:text name="show.info" /> </a>|
		  <a href="/ch07_Struts2.1Sreg/ch07SregNS/exit.action?type=users"><struts:text name="exit" /> </a>|
		</li>
      </ul>
    </center>

  </body>
  
</html>