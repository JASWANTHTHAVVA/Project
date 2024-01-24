<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Data Encryption</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="default.css" rel="stylesheet" type="text/css" />
<script>
    function validation(){
        var uname=document.ulogin.username.value;
        var pass=document.ulogin.password.value;
        
        if(uname==0){
            alert("Enter filename");
            document.ulogin.username.focus();
            return false;
        }
        if(pass==0){
            alert("Enter key");
            document.ulogin.password.focus();
            return false;
        }
    }
</script>
</head>
<body>
<!-- start header -->
<div id="header">
	<div id="menu">
        <div>
			<ul>
				<li><a class="current_page_item" href="home.jsp">Home</a></li>
				<li><a href="viewAES.jsp">View Files</a></li>
				<li><a href="AESDecrypt.jsp">Decrypt</a></li>
			</ul>
        </div>
	</div>
</div>
<!-- end header -->
<div id="logo">
<!--	<h1><a href="#">Voyage </a></h1>-->
<h2 style="font-size: x-large">DECRYPTING OF DATA</h2><br>
</div><br>

<div id="banner"></div>

<!-- start page -->
<div id="page">
	<!-- start content -->
	<div style="font-size: 15px;">
		<div class="post" id="ulogin">
            <center>
			<h2 class="title"style="color: #EAF2F8">DECRYPT OF DATA </h2>        
                <form action="AESDecrypt" name="ulogin" method="post" onsubmit="return validation()"> 
		<input type="text" name="fname" placeholder="Enter filename"><br></br>
		<input type="text" name="keey" placeholder="Enter key"><br></br>
                <select name="algo" >
                   <option  value="aes">AES</option>
                    <option value="des">DES</option>
                                           
</select><br></br>
<textarea rows="10" cols="30" ><%=request.getAttribute("dataa")%></textarea><br></br>
		<input type="submit" value="SUBMIT"style="background-color: #EAF2F8"><br></br>
				</form>
                       
            </center>
		
	</div>
	<!-- end content -->
	<!-- start sidebar -->
	
	<!-- end sidebar -->
	<div style="clear: both;">&nbsp;</div>
</div>
<!-- end page -->
<!-- start footer -->
<div id="footer">
	<p id="legal">Copyright</p>
</div>
<!-- end footer -->

</body>
</html>
