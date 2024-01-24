<%@ page import="java.io.*" %>  
<%@ page import="java.util.*" %>  
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%!  
    // --- String Join Function converts from Java array to javascript string.  
    public String join(ArrayList<?> arr, String del)  
    {  

        StringBuilder output = new StringBuilder();  

        for (int i = 0; i < arr.size(); i++)  
        {  

            if (i > 0) output.append(del);  

              // --- Quote strings, only, for JS syntax  
              if (arr.get(i) instanceof String) output.append("\"");  
              output.append(arr.get(i));  
              if (arr.get(i) instanceof String) output.append("\"");  
        }  

        return output.toString();  
    }  
%>
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
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Data Confidentiality</title>
<script type="text/javascript" src="https://cdn.zingchart.com/zingchart.min.js"></script>  
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="default.css" rel="stylesheet" type="text/css" />

</head>
<body>
    <!-- start header -->
<div id="header">
	<div id="menu">
        <div>
			<ul>
				<li><a href="home.jsp">Home</a></li>
                                <li><a href="fupload.jsp">Upload</a></li>
                                <li><a href="Fchart.jsp">CHARTS</a></li>
			</ul>
        </div>
	</div>
</div>
<!-- end header -->
<div id="logo">
	<h2 style="font-size: x-large">CHART FOR AES - FCS</h2><br>
</div><br>

<!--<div id="banner"></div>-->
    <script>  
        
             <%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from graph where id=1";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){

           // --- Create two Java Arrays  
            ArrayList<String> months = new ArrayList<String>();  
            ArrayList<Float> users = new ArrayList<Float>();  
            HttpSession session92=request.getSession(false);
            String aes = "0.0012";
            HttpSession session91=request.getSession(false);
            String des="0.0013" ;
            float aes1=(Float.parseFloat(aes)/1);
            float des1=(Float.parseFloat(des)/1);
            months.add("AES ");
            users.add(aes1);
            months.add("FCS ");
            users.add(des1);
        %>  

       // --- add a comma after each value in the array and convert to javascript string representing an array  
        var monthData = [<%= join(months, ",") %>];  
        var userData = [<%= join(users, ",") %>];  
  <%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
    </script>
    <script>
window.onload = function() {
  zingchart.render({
    id: "myChart",
    width: "70%",
    height: 300,
    data: {
      "type": "bar",
      "bar-width":"25%",
      "title": {
        "text": "AES-FCS Comparison Graph For Retrivel Time"
      },
      "scale-x": {
        "labels": monthData,
      },
      "scale-y": {
        "min-value":0.001,
        "max-value":0.0018,
      },
      "plot": {
        "line-width": 0.8,
        "bar-width":"25%",
      },
      "series": [{
        "values": userData
      }]
    }
  });
};
</script>
<div id="page">
	<!-- start content -->
	<div style="font-size: 15px;">
		<div class="post" id="ulogin">
            <center>
			<h2 class="title"style="color: coral">GRAPH</h2> 
                        <h1>AES-FCS Comparison Graph For Retrivel Time</h1>  
                        <div id="myChart"></div>
                        
                        
            </center>
	</div>
	<!-- end content -->
	<!-- start sidebar -->
	
	<!-- end sidebar -->
	<div style="clear: both;">&nbsp;</div>
</div> 
<div id="footer">
	<p id="legal">Copyright</p>
</div>
<!-- end footer -->

</body>
</html>
