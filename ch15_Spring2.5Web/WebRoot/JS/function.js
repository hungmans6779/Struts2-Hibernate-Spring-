// JavaScript Document

         //顯示/隱藏標籤標籤
		function switchcontent(obj)
		{
			document.getElementById('cm_video').style.display='none';
			document.getElementById('cm_article').style.display='none';
			document.getElementById('cm_titleli01').className = '';
			document.getElementById('cm_titleli02').className = '';
			obj.className = 'cmt_left_nonce';
		}
         //顯示/隱藏ID是name的DIV內容
		function style_display_on(name) {
			document.getElementById(name).style.display = window.XMLHttpRequest?"":"block";
			
		} 
		//驗證使用者登入表單
	   		function CheckUserName(f)
			{
				if(f.UserName.value=="")
				{
					alert("使用者名稱不能為空!");
					return false;
				}
				if(f.PassWord.value=="")
				{
					alert("密碼不能為空!");
					return false;
				}
				FORM1.Button1.disabled=true;
				FORM1.Button1.value='請稍候...';
			}
          //顯示/隱藏Div標籤內容
		function showorhidediv(obj,oimg)
		{
			document.getElementById(obj).style.display = document.getElementById(obj).style.display=='none'?'':"none";
			if(oimg.src=='images/title_menu.gif'){
				 oimg.src=='images/title_menu1.gif';
				}
			else
				{
				oimg.src=='images/title_menu1.gif';
				}
		}
		//切換站內搜索方式
		function switchsearch_mid(obj)
		{
			document.getElementById('search_mid1').style.display='none';
			document.getElementById('search_mid2').style.display='none';
			document.getElementById('search_mid3').style.display='none';
			document.getElementById('search_mid4').style.display='none';
			document.getElementById('sm_01').className = 'sm_02';
			document.getElementById('sm_02').className = 'sm_02';
			document.getElementById('sm_03').className = 'sm_02';
			document.getElementById('sm_04').className = 'sm_02';
			obj.className = 'sm_01';
		}	
		//切換排行榜類別
			function showorhidecrc(id)
			{
				for(var i=1;i<=7;i++){
				document.getElementById("crc06_" + i).style.display="none";
				document.getElementById("imgcrc" + i).src = "images/title_menu1.gif";
				}
				document.getElementById("crc06_" + id).style.display ="";
				document.getElementById("imgcrc" + id).src = document.getElementById("crc06_" + id).style.display !=""?'images/title_menu1.gif':"images/title_menu.gif";
			}