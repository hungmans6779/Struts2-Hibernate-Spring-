<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>窗內網論壇使用者註冊</title>
  </head>
  
  <body>
    <%@ include file="header.jsp" %>
    
    <div style="float:left ; text-align:left;width:100%" >
      <form:form>
        註冊成功<br>
        使用者名稱：${fulluser.username}， <br/>
        密碼：${fulluser.password}<br>
        郵件地址： ${fulluser.email}<br>
        通訊地址：${fulluser.address}，<br/>
        電話號碼：${fulluser.tel}<br>
        愛好：${fulluser.favor}<br>
      </form:form>
    </div>
    
    
    <%@ include file="footer.jsp" %>
  </body>

</html>