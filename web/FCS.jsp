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
            alert("Enter Username");
            document.ulogin.username.focus();
            return false;
        }
        if(pass==0){
            alert("Enter password");
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
				<li><a href="FCS.jsp">Users</a></li>
				<li><a href="admin.jsp">Admin</a></li>
				<li><a href="Fregister.jsp">Register</a></li>
			</ul>
        </div>
	</div>
</div>
<!-- end header -->
<div id="logo">
<!--	<h1><a href="#">Voyage </a></h1>-->
<h2 style="font-size: x-large">AES OVER FCS</h2><br>
</div><br>

<div id="banner"></div>

<!-- start page -->
<div id="page">
	<!-- start content -->
	<div style="font-size: 15px;">
		<div class="post" id="ulogin">
            <center>
			<h2 class="title"style="color: #EAF2F8">USER LOGIN </h2>        
                <form action="FLogin" name="ulogin" method="post" onsubmit="return validation()"> 
		<input type="text" name="username" placeholder="Enter Username"><br></br>
		<input type="password" name="password" placeholder="Enter password"><br></br>
		<input type="submit" value="Login"style="background-color: #EAF2F8"><br></br>
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
