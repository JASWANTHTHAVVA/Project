package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Data Confidentiality</title>\n");
      out.write("<meta name=\"keywords\" content=\"\" />\n");
      out.write("<meta name=\"description\" content=\"\" />\n");
      out.write("<link href=\"default.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<script>\n");
      out.write("    function validation(){\n");
      out.write("        var uname=document.ureg.username.value;\n");
      out.write("        var pass=document.ureg.password.value;\n");
      out.write("        var cpass=document.ureg.cpassword.value;\n");
      out.write("        var mail=document.ureg.mail.value;\n");
      out.write("        var name=document.ureg.name.value;\n");
      out.write("        var ph=document.ureg.mobile.value;\n");
      out.write("        \n");
      out.write("        if(name==0){\n");
      out.write("            alert(\"Enter name\");\n");
      out.write("            document.ureg.name.focus();\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        if(uname==0){\n");
      out.write("            alert(\"Enter username\");\n");
      out.write("            document.ureg.username.focus();\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        if(pass==0){\n");
      out.write("            alert(\"Enter password\");\n");
      out.write("            document.ureg.password.focus();\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        if(cpass!=pass){\n");
      out.write("            alert(\"Incorrect password\");\n");
      out.write("            document.ureg.cpassword.focus();\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        if(mail==0){\n");
      out.write("            alert(\"Enter mailid\");\n");
      out.write("            document.ureg.mail.focus();\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        if(ph==0){\n");
      out.write("            alert(\"Enter your mobile no\");\n");
      out.write("            document.ureg.mobile.focus();\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("         if(isNaN(ph)){\n");
      out.write("                 alert(\"Invalid phoneno\");\n");
      out.write("                 document.ureg.mobile.focus();\n");
      out.write("                 return  false;\n");
      out.write("            }\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- start header -->\n");
      out.write("<div id=\"header\">\n");
      out.write("\t<div id=\"menu\">\n");
      out.write("        <div>\n");
      out.write("\t\t\t<ul>\n");
      out.write("                <li ><a href=\"home.jsp\">Home</a></li>\n");
      out.write("\t\t<li><a href=\"admin.jsp\">Admin</a></li>\n");
      out.write("                <li><a href=\"TAES.jsp\">User</a></li>\n");
      out.write("                <li><a class=\"current_page_item\" href=\"Register.jsp\">User Registration</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("        </div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- end header -->\n");
      out.write("<div id=\"logo\">\n");
      out.write("\t<h2 style=\"font-size: x-large\">Registering Of New User</h2><br>\n");
      out.write("</div><br>\n");
      out.write("\n");
      out.write("<div id=\"banner\"></div>\n");
      out.write("\n");
      out.write("<!-- start page -->\n");
      out.write("<div id=\"page\">\n");
      out.write("\t<!-- start content -->\n");
      out.write("\t<div style=\"font-size: 15px;\">\n");
      out.write("\t\t<div class=\"post\" id=\"ulogin\">\n");
      out.write("            <center>\n");
      out.write("\t\t\t\t<h2 class=\"title\"style=\"color: coral\">USER REGISTRATION </h2>\n");
      out.write("                   \n");
      out.write("                    <form action=\"Register\" name=\"ureg\" method=\"post\" onsubmit=\"return validation()\"> \n");
      out.write("\t\t\t<input type=\"text\" name=\"name\" placeholder=\"Enter your name\" ><br></br>\n");
      out.write("\t\t\t<input type=\"text\" name=\"username\" placeholder=\"Enter username\"><br></br>\n");
      out.write("\t\t\t<input type=\"password\" name=\"password\" placeholder=\"Enter password\"><br></br>\n");
      out.write("\t\t\t<input type=\"email\" name=\"mail\" placeholder=\"Enter your email\"><br></br>\n");
      out.write("\t\t\t<input type=\"text\" name=\"mobile\" placeholder=\"Enter your mobile no\" maxlength=\"10\"><br></br>\n");
      out.write("                       \n");
      out.write("                          <select name=\"algorithm\" >\n");
      out.write("                         <option  value=\"taes\">TAES-DES</option>\n");
      out.write("                       <option value=\"ibe\">IBE-HASH</option>\n");
      out.write("                       <option  value=\"blow\">TAES-BLOW</option>\n");
      out.write("                      <option  value=\"fcs\">AES-FCS</option>\n");
      out.write("</select><br></br>\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"Register\"style=\"background-color: #AA330F;width: 150px\"><br></br>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("                       \n");
      out.write("            </center>\n");
      out.write("\t\t</div>\n");
      out.write("\t<!-- end content -->\n");
      out.write("\t<!-- start sidebar -->\n");
      out.write("\t\n");
      out.write("\t<!-- end sidebar -->\n");
      out.write("\t<div style=\"clear: both;\">&nbsp;</div>\n");
      out.write("</div>\n");
      out.write("<!-- end page -->\n");
      out.write("<!-- start footer -->\n");
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
