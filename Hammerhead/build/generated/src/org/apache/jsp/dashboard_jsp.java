package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Dao.AccessoriesInventoryDAO;
import Dao.InventoryReportDAO;
import Dao.ProductionInventoryDAO;
import Model.ProductionInventory;
import java.util.ArrayList;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navigationBar.jsp", out, false);
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Monitor Warehouse Inventory</title>\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--Load the AJAX API-->\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.google.com/jsapi\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("            google.load('visualization', '1.0', {'packages': ['corechart']});\n");
      out.write("            google.setOnLoadCallback(drawChart);\n");
      out.write("            ");

                InventoryReportDAO InventoryReportDAO = new InventoryReportDAO();
                AccessoriesInventoryDAO AccessoriesInventoryDAO = new AccessoriesInventoryDAO();
            
      out.write("\n");
      out.write("            function drawChart() {\n");
      out.write("\n");
      out.write("                var data = new google.visualization.DataTable();\n");
      out.write("                data.addColumn('string', 'Outlets');\n");
      out.write("                data.addColumn('number', 'Quantity');\n");
      out.write("\n");
      out.write("                data.addRows([\n");
      out.write("            ");

                for (int i = 0; i < InventoryReportDAO.GetAllInventoryReport().size(); i++) {
            
      out.write("\n");
      out.write("                    [ '");
      out.print( InventoryReportDAO.GetAllInventoryReport().get(i).getOutlet());
      out.write('\'');
      out.write(',');
      out.print( InventoryReportDAO.GetAllInventoryReport().get(i).getRemainingQuantity());
      out.write(" ],\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("                ]);\n");
      out.write("\n");
      out.write("\n");
      out.write("                var AccessoryChart = new google.visualization.DataTable();\n");
      out.write("                AccessoryChart.addColumn('string', 'Outlets');\n");
      out.write("                AccessoryChart.addColumn('number', 'Quantity');\n");
      out.write("\n");
      out.write("                AccessoryChart.addRows([\n");
      out.write("            ");

                for (int i = 0; i < AccessoriesInventoryDAO.MonitorAccessoriesInventory().size(); i++) {
            
      out.write("\n");
      out.write("                    [ '");
      out.print( AccessoriesInventoryDAO.MonitorAccessoriesInventory().get(i).getAccessoryDescription());
      out.write('\'');
      out.write(',');
      out.print( AccessoriesInventoryDAO.MonitorAccessoriesInventory().get(i).getQty());
      out.write(" ],\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("                ]);\n");
      out.write("                google.visualization.events.addListener(data, 'ready', function () {\n");
      out.write("                    ready.data = true;\n");
      out.write("                    if (ready.data) {\n");
      out.write("                        PieMain.getChart().setAction({\n");
      out.write("                            id: 'sample',\n");
      out.write("                            text: 'Quantity of Items Per Item',\n");
      out.write("                            action: function () {\n");
      out.write("                                button.onclick = function () {\n");
      out.write("                                    current = 0;\n");
      out.write("                                    drawChart();\n");
      out.write("                                }\n");
      out.write("                                selection = data.getChart().getSelection();\n");
      out.write("                                switch (selection[0].row) {\n");
      out.write("                                    case 0:\n");
      out.write("                                        data2.draw();\n");
      out.write("                                }\n");
      out.write("                            }\n");
      out.write("                        });\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("                var options = {'title': 'Stocks Available Per Outlets',\n");
      out.write("                    'width': 400,\n");
      out.write("                    'height': 300};\n");
      out.write("                // Instantiate and draw our chart, passing in some options.\n");
      out.write("                var chart = new google.visualization.ColumnChart(document.getElementById('chart_div'));\n");
      out.write("                chart.draw(data, options);\n");
      out.write("\n");
      out.write("                var chart = new google.visualization.ColumnChart(document.getElementById('chart_2'));\n");
      out.write("                chart.draw(AccessoryChart, options);\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <h2 align=\"center\">\n");
      out.write("\n");
      out.write("            <font face=\"Helvetica\">Dashboard</font>\n");
      out.write("        </h2>\n");
      out.write("        <table border=\"10\" cellpadding=\" 10\">\n");
      out.write("            <br>\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"3\" align=\"center\">\n");
      out.write("                    <div id=\"stackedBarChart\"></div>\n");
      out.write("                </td>\n");
      out.write("                <td colspan=\"3\" align=\"center\">\n");
      out.write("                    <div id=\"chart_div\" style=\"width:400; height:300\"></div>\n");
      out.write("\n");
      out.write("                <td colspan=\"3\" align=\"center\">\n");
      out.write("                    <div id=\"chart_2\" style=\"width:400; height:300\"></div></td>\n");
      out.write("            </tr>\n");
      out.write("            <input type=\"text\" id=\"comment\">\n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </center>\n");
      out.write("</body>\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
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
