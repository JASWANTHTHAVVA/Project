package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class fupload_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("     \n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");

    if(request.getParameter("status")!=null){
        out.println("<script>alert('uploaded')</script>");
    }
    
      out.write("\n");
      out.write("<!-- start header -->\n");
      out.write("<div id=\"header\">\n");
      out.write("\t<div id=\"menu\">\n");
      out.write("        <div>\n");
      out.write("\t\t\t<ul>\n");
      out.write("                            <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"fupload.jsp\">UPLOAD</a></li>\n");
      out.write("                                <li class=\"last\"><a href=\"fchart.jsp\">CHARTS</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("        </div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- end header -->\n");
      out.write("<div id=\"logo\">\n");
      out.write("\t<h2 style=\"font-size: x-large\">Upload Data to cloud</h2><br>\n");
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
      out.write("\t\t\t<h2 class=\"title\"style=\"color: coral\">File Upload </h2> \n");
      out.write("                        \n");
      out.write("               <form method=\"post\" action=\"FUpload\" enctype=\"multipart/form-data\" name=\"dcr\">\n");
      out.write("                   <input type=\"text\" name=\"fname\" placeholder=\"Enter your File Name\" ><br></br>\n");
      out.write("                       <input type=\"file\" name=\"file\" /><br></br>\n");
      out.write("      <select name=\"algorithm\" >\n");
      out.write("                         <option  value=\"aes\">TAES</option>\n");
      out.write("                       <option value=\"fcs\">FCS</option>\n");
      out.write("</select><br></br>\n");
      out.write("    <input type=\"submit\" value=\"Upload\" />\n");
      out.write("  </form>        \n");
      out.write("            </center>\n");
      out.write("\t</div>\n");
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