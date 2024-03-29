<%-- 
    Document   : EncodePurchaseOrder
    Created on : 02 20, 15, 11:39:41 AM
    Author     : Shermaine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="navigationBar.jsp" />
<%@include file="security.jsp" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Encoding Purchase Order</title>
        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/TABLE.css" rel="stylesheet">
        <style>
            td.edits {
                text-align: center;
            }

            th.edits {
                text-align: center;
            }
        </style>

        <script>
            function addRow(tableID) {

                var table = document.getElementById(tableID);

                var rowCount = table.rows.length;
                var row = table.insertRow(rowCount);

                var colCount = table.rows[0].cells.length;

                for (var i = 0; i < colCount; i++) {

                    var newcell = row.insertCell(i);

                    newcell.innerHTML = table.rows[0].cells[i].innerHTML;
                    //alert(newcell.childNodes);
                    switch (newcell.childNodes[0].type) {
                        case "text":
                            newcell.childNodes[0].value = "";
                            break;
                        case "checkbox":
                            newcell.childNodes[0].checked = false;
                            break;
                        case "select-one":
                            newcell.childNodes[0].selectedIndex = 0;
                            break;
                    }
                }
            }

            function deleteRow(tableID) {
                try {
                    var table = document.getElementById(tableID);
                    var rowCount = table.rows.length;

                    for (var i = 0; i < rowCount; i++) {
                        var row = table.rows[i];
                        var chkbox = row.cells[0].childNodes[0];
                        if (null != chkbox && true == chkbox.checked) {
                            if (rowCount <= 1) {
                                alert("Cannot delete all the rows.");
                                break;
                            }
                            table.deleteRow(i);
                            rowCount--;
                            i--;
                        }


                    }
                } catch (e) {
                    alert(e);
                }
            }

        </script>
    </head>
    <body>  
    <br/><br/><br/>
    <center><h2>Encoding Purchase Order</h2></center>
        <form method="POST" action="PurchaseOrderServlet">
            <div align="center">
                <table class="tableContainer" width="80%">
                    <thead class="fixedHeader"><tr>
                            <th></th>
                        <th>PO #</th>
                        <th>Item Description</th>
                        <th>Quantity</th>
                        <th>Unit Measurement</th> 
                        <th>Unit Price</th> 
                        <th>Vat</th> 
                        <th>Prepared By</th> 
                        <th>Approved By</th> 
                        </tr></thead>
                    <tbody id="dataTable" class="scrollContent"><tr>
                            <td><input type="checkbox" name="chk"/></td>
                        <td><input type="text" name="poNumber" size="3"/></td>
                        <td><input type="text" name="itemDescription" size="10"/></td>
                        <td><input type="text" name="qty" size="10"/></td>
                        <td> <select name ="unitMeasurement">
                                    <option value="Kg">Kilogram</option>
                                    <option value="Yd">Yard</option>
                                    <option value="centimeter">Centimeter</option>
                                    <option value="box">box</option>
                                    <option value="pcs">Pcs</option>
                             </select></td>
                        <td><input type="text" name="UnitPrice" size="10"/></td>
                        <td><input type="text" name="vat" size="10"/></td>
                        <td><input type="text" name="preparedBy" size="10"/></td>
                        <td><input type="text" name="approvedBy" size="10"/></td>
                        </tr></tbody>
                </table>
                
                <br/><br/>
                <input type="button" class="btn btn-danger" value="Add Row" onclick="addRow('dataTable')" />
                <input type="button" class="btn btn-danger" value="Delete Row" onclick="deleteRow('dataTable')" />
                <br/><br/>
             <input type="submit" class="btn btn-danger" value="OK"/> 
                <a href="dashboard.jsp"><button type="button" class="btn btn-danger">Cancel</button></a>
            </div>
        </form>
         <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
        
    </body>

</html>