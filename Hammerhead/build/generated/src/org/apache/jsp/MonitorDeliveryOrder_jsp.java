package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Model.DeliveryOrder;

public final class MonitorDeliveryOrder_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navigationBar.jsp", out, false);
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Monitor Delivery Order</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <br> <br> <br>\n");
      out.write("        <div class=\"myrawtable\" align= \"center\">\n");
      out.write("            <h2>Delivery Order</h2>\n");
      out.write("            <table id=\"dataTable\" class=\"table table-hover\" style= \"width:800px\">\n");
      out.write("                <tr>\n");
      out.write("                    <th class=\"edits\"></th>\n");
      out.write("                    <th class = \"edits\">Delivery Order Number</th>\n");
      out.write("                    <th class = \"edits\">Promo</th>\n");
      out.write("                    <th class = \"edits\">Outlet</th>\n");
      out.write("                    <th class = \"edits\">Production Number</th>\n");
      out.write("                    <th class = \"edits\">Sex</th>\n");
      out.write("                    <th class = \"edits\">Item Description</th>\n");
      out.write("                    <th class = \"edits\">Age Group</th>\n");
      out.write("                    <th class = \"edits\">Color</th>\n");
      out.write("                    <th class = \"edits\">Size</th>\n");
      out.write("                    <th class = \"edits\">Quantity</th>\n");
      out.write("                    <th class = \"edits\">Received</th>\n");
      out.write("                    <th class = \"edits\">Prepared By</th>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    ArrayList<DeliveryOrder> DeliveryOrder = (ArrayList<DeliveryOrder>) session.getAttribute("doList");
                    for (int i = 0; i < DeliveryOrder.size(); i++) {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"checkbox\" name=\"chk\"/></td>\n");
      out.write("                    <td>");
      out.print( DeliveryOrder.get(i).getDeliveryOrderNumber());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( DeliveryOrder.get(i).getPromo());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( DeliveryOrder.get(i).getOutlet());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( DeliveryOrder.get(i).getProductionNumber());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( DeliveryOrder.get(i).getSex());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( DeliveryOrder.get(i).getItemDescription());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( DeliveryOrder.get(i).getAgeGroup());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( DeliveryOrder.get(i).getColor());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( DeliveryOrder.get(i).getSize());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( DeliveryOrder.get(i).getQty());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( DeliveryOrder.get(i).getReceive());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( DeliveryOrder.get(i).getPreparedBy());
      out.write("</td>       \n");
      out.write("                </tr>        \n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("            <br/><br/>\n");
      out.write("            <a href=\"dashboard.jsp\"><button type=\"button\" class=\"btn btn-danger\">Back</button></a>\n");
      out.write("            <a href=\"EncodeDeliveryOrder.jsp\"><button type=\"button\" class=\"btn btn-danger\">Add Delivery Order</button></a>\n");
      out.write("        </div>\n");
      out.write("          <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
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
