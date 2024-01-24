
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
    String driver = "com.mysql.cj.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "cds";
String userid = "root";
String password = "";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
    %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Data Confidentiality</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="default.css" rel="stylesheet" type="text/css" />
<script>
    function validation(){
    
    }
</script>
</head>
<body>
    
    
     
<!-- start header -->
<div id="header">
	<div id="menu">
        <div>
			<ul>
                     <li><a href="admin.jsp">Home</a></li>
                    <li><a href="viewIBE.jsp">View Files</a></li>
                    <li><a href="IBEDecrypt.jsp">Decrypt</a></li>
			</ul>
        </div>
	</div>
</div>
<!-- end header -->
<div id="logo">
<!--	<h1><a href="#">Voyage </a></h1>-->
<h2 style="font-size: x-large">View Encrypted Files</h2><br>
</div><br>

<div id="banner"></div>

<!-- start page -->
<div id="page">
	<!-- start content -->
	<div id="page">
	<!-- start content -->
	<div style="font-size: 15px;">
		<div class="post" id="ulogin">
                    <center>
						<h2 class="title"style="color: coral">MY FILES </h2>
                        <table style="border-style: solid ">
                            <tr style="background-color: #897B7B">
                                <td >FILENAME</td><td >username</td><td>KEY</td><td>ALGORITHM</td>
                            </tr>
						   <%
						      
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from ibeuploads";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
        
   
		 String filename=resultSet.getString("fname");
                 String uname=resultSet.getString("users");
		String size=resultSet.getString("ikey");
		 String id=resultSet.getString("algorithm");
						   %>
                            <tr>
                                <td><%=filename%></td><td><%=uname%></td><td><%=size%></td><td><%=id%></td>
                            </tr>
                            <%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
                        </table>
                    </center>
		
	</div>

<!-- end page -->
<!-- start footer -->
<div id="footer">
	<p id="legal">CopyRight</p>
</div></div></div>
<!-- end footer -->

</body>
</html>
