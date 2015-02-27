package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EncodePurchaseOrder_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/security.jsp");
  }

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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navigationBar.jsp", out, false);
      out.write('\n');

    String login = (String) session.getAttribute("login");
    if (login == null || !login.equals("success")){
        response.sendRedirect("index.jsp");
        return;
    }

      out.write('\n');
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Encoding Purchase Order</title>\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/TABLE.css\" rel=\"stylesheet\">\n");
      out.write("        <style>\n");
      out.write("            td.edits {\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th.edits {\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function addRow(tableID) {\n");
      out.write("\n");
      out.write("                var table = document.getElementById(tableID);\n");
      out.write("\n");
      out.write("                var rowCount = table.rows.length;\n");
      out.write("                var row = table.insertRow(rowCount);\n");
      out.write("\n");
      out.write("                var colCount = table.rows[0].cells.length;\n");
      out.write("\n");
      out.write("                for (var i = 0; i < colCount; i++) {\n");
      out.write("\n");
      out.write("                    var newcell = row.insertCell(i);\n");
      out.write("\n");
      out.write("                    newcell.innerHTML = table.rows[0].cells[i].innerHTML;\n");
      out.write("                    //alert(newcell.childNodes);\n");
      out.write("                    switch (newcell.childNodes[0].type) {\n");
      out.write("                        case \"text\":\n");
      out.write("                            newcell.childNodes[0].value = \"\";\n");
      out.write("                            break;\n");
      out.write("                        case \"checkbox\":\n");
      out.write("                            newcell.childNodes[0].checked = false;\n");
      out.write("                            break;\n");
      out.write("                        case \"select-one\":\n");
      out.write("                            newcell.childNodes[0].selectedIndex = 0;\n");
      out.write("                            break;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function deleteRow(tableID) {\n");
      out.write("                try {\n");
      out.write("                    var table = document.getElementById(tableID);\n");
      out.write("                    var rowCount = table.rows.length;\n");
      out.write("\n");
      out.write("                    for (var i = 0; i < rowCount; i++) {\n");
      out.write("                        var row = table.rows[i];\n");
      out.write("                        var chkbox = row.cells[0].childNodes[0];\n");
      out.write("                        if (null != chkbox && true == chkbox.checked) {\n");
      out.write("                            if (rowCount <= 1) {\n");
      out.write("                                alert(\"Cannot delete all the rows.\");\n");
      out.write("                                break;\n");
      out.write("                            }\n");
      out.write("                            table.deleteRow(i);\n");
      out.write("                            rowCount--;\n");
      out.write("                            i--;\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("                } catch (e) {\n");
      out.write("                    alert(e);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>  \n");
      out.write("    <br/><br/><br/>\n");
      out.write("    <center><h2>Encoding Purchase Order</h2></center>\n");
      out.write("        <form method=\"POST\" action=\"PurchaseOrderServlet\">\n");
      out.write("            <div align=\"center\">\n");
      out.write("                <table class=\"tableContainer\">\n");
      out.write("                    <thead class=\"fixedHeader\" width=\"100%\"><tr>\n");
      out.write("                            <th></th>\n");
      out.write("                        <th>Purchase Order #</th>\n");
      out.write("                        <th>item Description</th>\n");
      out.write("                        <th>Quantity</th>\n");
      out.write("                        <th>Unit Measurement</th> \n");
      out.write("                        <th>Unit Price</th> \n");
      out.write("                        <th>Vat</th> \n");
      out.write("                        <th>Prepared By</th> \n");
      out.write("                        <th>Approved By</th> \n");
      out.write("                        </tr></thead>\n");
      out.write("                    <tbody id=\"dataTable\" class=\"scrollContent\"><tr>\n");
      out.write("                        <td><input type=\"checkbox\" name=\"chk\"/></td>\n");
      out.write("                        <td><input type=\"text\" name=\"poNumber\" size=\"10\"/></td>\n");
      out.write("                        <td><input type=\"text\" name=\"itemDescription\" size=\"10\"/></td>\n");
      out.write("                        <td><input type=\"text\" name=\"qty\" size=\"10\"/></td>\n");
      out.write("                        <td> <select name =\"unitMeasurement\">\n");
      out.write("                                    <option value=\"Kg\">Kilogram</option>\n");
      out.write("                                    <option value=\"Yd\">Yard</option>\n");
      out.write("                                    <option value=\"centimeter\">Centimeter</option>\n");
      out.write("                                    <option value=\"box\">box</option>\n");
      out.write("                                    <option value=\"pcs\">Pcs</option>\n");
      out.write("                             </select></td>\n");
      out.write("                        <td><input type=\"text\" name=\"UnitPrice\" size=\"10\"/></td>\n");
      out.write("                        <td><input type=\"text\" name=\"vat\" size=\"10\"/></td>\n");
      out.write("                        <td><input type=\"text\" name=\"preparedBy\" size=\"10\"/></td>\n");
      out.write("                        <td><input type=\"text\" name=\"preparedBy\" size=\"10\"/></td>\n");
      out.write("                        </tr></tbody>\n");
      out.write("                </table>\n");
      out.write("                \n");
      out.write("                <br/><br/>\n");
      out.write("                <input type=\"button\" class=\"btn btn-danger\" value=\"Add Row\" onclick=\"addRow('dataTable')\" />\n");
      out.write("                <input type=\"button\" class=\"btn btn-danger\" value=\"Delete Row\" onclick=\"deleteRow('dataTable')\" />\n");
      out.write("                <br/><br/>\n");
      out.write("             <input type=\"submit\" class=\"btn btn-danger\" value=\"OK\"/> \n");
      out.write("                <a href=\"dashboard.jsp\"><button type=\"button\" class=\"btn btn-danger\">Cancel</button></a>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("         <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"../../assets/js/ie10-viewport-bug-workaround.js\"></script>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
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
