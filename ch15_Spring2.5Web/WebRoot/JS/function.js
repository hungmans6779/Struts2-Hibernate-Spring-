// JavaScript Document

         //���/���ü��Ҽ���
		function switchcontent(obj)
		{
			document.getElementById('cm_video').style.display='none';
			document.getElementById('cm_article').style.display='none';
			document.getElementById('cm_titleli01').className = '';
			document.getElementById('cm_titleli02').className = '';
			obj.className = 'cmt_left_nonce';
		}
         //���/����ID�Oname��DIV���e
		function style_display_on(name) {
			document.getElementById(name).style.display = window.XMLHttpRequest?"":"block";
			
		} 
		//���ҨϥΪ̵n�J���
	   		function CheckUserName(f)
			{
				if(f.UserName.value=="")
				{
					alert("�ϥΪ̦W�٤��ର��!");
					return false;
				}
				if(f.PassWord.value=="")
				{
					alert("�K�X���ର��!");
					return false;
				}
				FORM1.Button1.disabled=true;
				FORM1.Button1.value='�еy��...';
			}
          //���/����Div���Ҥ��e
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
		//���������j���覡
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
		//�����Ʀ�]���O
			function showorhidecrc(id)
			{
				for(var i=1;i<=7;i++){
				document.getElementById("crc06_" + i).style.display="none";
				document.getElementById("imgcrc" + i).src = "images/title_menu1.gif";
				}
				document.getElementById("crc06_" + id).style.display ="";
				document.getElementById("imgcrc" + id).src = document.getElementById("crc06_" + id).style.display !=""?'images/title_menu1.gif':"images/title_menu.gif";
			}