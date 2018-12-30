<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<%@ page import="java.util.*" %>

<%@ taglib uri="/struts-tags"      prefix="struts" %>
<%@ taglib uri="/struts-dojo-tags" prefix="sx"     %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>《UI》 標籤：【表單標籤】： 主要用於產生 HTML 中的表單 </title>
    <sx:head />
    <style>
      body {
	    background-image: url("/ch04Struts2.1TagLib/images/bg-0291.gif");
      }
    </style>
  </head>
  
  <body>
  
    <%--
       datetimepicker：可以產生一個動態日曆，當按一下文字方塊時就會產生出現日曆選擇框，
                       從中可以選擇日期和時間，選擇日期和時間後，系統就會把選擇的日期和時間輸出到指定文字方塊中。
                     
       相關屬性值如下所示：
       
       displayFormat：該屬性用來指定日期的顯示格式，例如：可以指定 yyyy-MM-dd 作為日期顯示的格式。
       
       displayWeeks：該屬性用來指定日曆顯示出星期數。
       
       endDate：該屬性用來指定日曆可以顯示的最後日期，例如：endDate="2012-12-21"，表示日曆將不顯示 2012-12-21之後的日期。
       
       language：該屬性用來指定日曆顯示的語言，例如，如果需要顯示簡體中文，就將屬性設定為 zh_CN。
       
       startDate：表示日曆可以顯示的開始日期，指定該屬性後，日曆將不顯示之前的日期。
       
       toggleDruation：將屬性用來指定日曆選擇框出現和隱藏的切換時間。
       
       toggleType：用來指定日曆選擇框出現和隱藏的切換效果，有4個值可供選擇：plain、wipe、explode 和 false。
       
       type：用來指定選擇框的型態，有兩個值可供選擇 date 和 time，分別表示日期選擇框和時間選擇框。
       
       value：用來指定目前日期和時間。
  
       weekStartsOn：用來指定哪一天才是一周的第一天，在預設情況下，0 表示星期天。     
    --%>
  
    <struts:form action="datetimepicker" namespace="/ch04TagLibNS" >
    
      <sx:datetimepicker name="birthday"   type="date"  label="出生日期" displayFormat="yyyy/MM/dd"  />
    
      <sx:datetimepicker name="recordtime" type="time"  label="記錄時間" />
      
      <struts:submit value="提 交"  />
       
    </struts:form>
    
  </body>
  
</html>
