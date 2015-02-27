package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">   \n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <link rel=\"icon\" href=\"../../favicon.ico\">\n");
      out.write("\n");
      out.write("        <title>Evergrowth Garments Manufacturing Incorporated</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"navbar.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\n");
      out.write("        <!--[if lt IE 9]><script src=\"../../assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\n");
      out.write("        <script src=\"../../assets/js/ie-emulation-modes-warning.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <!-- Fixed navbar -->\n");
      out.write("            <div class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <a href=\"Home.html\"><img src=\"Images/logo.png\" alt=\"logo\"\n");
      out.write("                                                 height=\"50\" width=\"150\"> </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"navbar-collapse collapse\">\n");
      out.write("                        <ul class=\"nav navbar-nav\">\n");
      out.write("                            <li class=\"active\" ><a href=\"#\">Home</a></li>\n");
      out.write("                            <li><a href=\"about.jsp\">About</a></li>\n");
      out.write("                            <li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <form class=\"navbar-form navbar-right\" role=\"form\" action=\"Login\" method =\"POST\">\n");
      out.write("                                <input type=\"text\" name=\"username\" placeholder=\"Username\" class=\"form-control\"/>\n");
      out.write("                                <input type=\"password\" name=\"password\" placeholder=\"Password\" class=\"form-control\">\n");
      out.write("                                <input type=\"submit\" class=\"btn btn-danger\" value=\"Login\"/>   \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                <a href=\"Register.jsp\">\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-danger\" value=\"Register\" />Register</button></a>\n");
      out.write("                                \n");
      out.write("                            </form>                    \n");
      out.write("                                \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </div><!--/.nav-collapse -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <br> <br> <br>\n");
      out.write("            <div class=\"col-md-14\">\n");
      out.write("                <img class=\"featurette-image img-responsive\" src=\"Images/logo.png\" alt=\"Hammerhead Logo\">\n");
      out.write("                <center><img src=\"Images/motto.png\"></center>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"../../assets/js/ie10-viewport-bug-workaround.js\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
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
