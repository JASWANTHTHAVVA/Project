package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class Fchart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  
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

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("  \n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');

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
    
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Data Confidentiality</title>\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdn.zingchart.com/zingchart.min.js\"></script>  \n");
      out.write("<meta name=\"keywords\" content=\"\" />\n");
      out.write("<meta name=\"description\" content=\"\" />\n");
      out.write("<link href=\"default.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <!-- start header -->\n");
      out.write("<div id=\"header\">\n");
      out.write("\t<div id=\"menu\">\n");
      out.write("        <div>\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("                                <li><a href=\"fupload.jsp\">Upload</a></li>\n");
      out.write("                                <li><a href=\"Fchart.jsp\">CHARTS</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("        </div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- end header -->\n");
      out.write("<div id=\"logo\">\n");
      out.write("\t<h2 style=\"font-size: x-large\">CHART FOR AES - FCS</h2><br>\n");
      out.write("</div><br>\n");
      out.write("\n");
      out.write("<!--<div id=\"banner\"></div>-->\n");
      out.write("    <script>  \n");
      out.write("        \n");
      out.write("             ");

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
        
      out.write("  \n");
      out.write("\n");
      out.write("       // --- add a comma after each value in the array and convert to javascript string representing an array  \n");
      out.write("        var monthData = [");
      out.print( join(months, ",") );
      out.write("];  \n");
      out.write("        var userData = [");
      out.print( join(users, ",") );
      out.write("];  \n");
      out.write("  ");

}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("    </script>\n");
      out.write("    <script>\n");
      out.write("window.onload = function() {\n");
      out.write("  zingchart.render({\n");
      out.write("    id: \"myChart\",\n");
      out.write("    width: \"70%\",\n");
      out.write("    height: 300,\n");
      out.write("    data: {\n");
      out.write("      \"type\": \"bar\",\n");
      out.write("      \"bar-width\":\"25%\",\n");
      out.write("      \"title\": {\n");
      out.write("        \"text\": \"AES-FCS Comparison Graph For Retrivel Time\"\n");
      out.write("      },\n");
      out.write("      \"scale-x\": {\n");
      out.write("        \"labels\": monthData,\n");
      out.write("      },\n");
      out.write("      \"scale-y\": {\n");
      out.write("        \"min-value\":0.001,\n");
      out.write("        \"max-value\":0.0018,\n");
      out.write("      },\n");
      out.write("      \"plot\": {\n");
      out.write("        \"line-width\": 0.8,\n");
      out.write("        \"bar-width\":\"25%\",\n");
      out.write("      },\n");
      out.write("      \"series\": [{\n");
      out.write("        \"values\": userData\n");
      out.write("      }]\n");
      out.write("    }\n");
      out.write("  });\n");
      out.write("};\n");
      out.write("</script>\n");
      out.write("<div id=\"page\">\n");
      out.write("\t<!-- start content -->\n");
      out.write("\t<div style=\"font-size: 15px;\">\n");
      out.write("\t\t<div class=\"post\" id=\"ulogin\">\n");
      out.write("            <center>\n");
      out.write("\t\t\t<h2 class=\"title\"style=\"color: coral\">GRAPH</h2> \n");
      out.write("                        <h1>AES-FCS Comparison Graph For Retrivel Time</h1>  \n");
      out.write("                        <div id=\"myChart\"></div>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("            </center>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- end content -->\n");
      out.write("\t<!-- start sidebar -->\n");
      out.write("\t\n");
      out.write("\t<!-- end sidebar -->\n");
      out.write("\t<div style=\"clear: both;\">&nbsp;</div>\n");
      out.write("</div> \n");
      out.write("<div id=\"footer\">\n");
      out.write("\t<p id=\"legal\">Copyright</p>\n");
      out.write("</div>\n");
      out.write("<!-- end footer -->\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
