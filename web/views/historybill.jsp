<%-- 
    Document   : historybill
    Created on : Jul 21, 2020, 8:01:22 PM
    Author     : Admin
--%>

<%@page import="com.Node.DAO.ProductDAO"%>
<%@page import="com.Node.DAO.CustomerDAO"%>
<%@page import="com.Node.DAO.BillDAO"%>
<%@page import="com.Node.Entity.Bill"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Bill</title>
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <script
    src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script
    src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script
    src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
        body{
            background: -webkit-linear-gradient(left, #3231af, #11e6ff);
        }
    </style>
    <body>


        <div class="px-4 px-lg-0">
            <div class="container text-white py-5 text-center">
                <h1 class="display-4"> History</h1>
            </div>

            <%
                int id = Integer.parseInt(request.getSession().getAttribute("id").toString());
                ArrayList<Bill> listBill = new BillDAO().listBillByIdCustomer(id);

                pageContext.setAttribute("listBill", listBill);

                String name = new CustomerDAO().getCustomer(id).getcName();

                String[] firstName = name.split(" ");

                String onlyName = firstName[firstName.length - 1];
                
               // String productName = new ProductDAO().getProduct(id);
            %>

            <div class="pb-5">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-12 p-5 bg-white rounded shadow-sm mb-5">
                            <table class="table table-striped">
                                <thead>
                                    <tr>
                                        <th scope="col">Name</th>
                                        <th scope="col">Product</th>
                                        <th scope="col">Address</th>
                                        <th scope="col">Phone</th>
                                        <th scope="col">Product price</th>
                                        <th scope="col">Quantity</th>
                                        <th scope="col">voucher</th>
                                        <th scope="col">payment</th>
                                        <th scope="col">status bill</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="bill" items="${listBill}">
                                        <tr>
                                            <td><%= onlyName %></td>
                                            <td>${bill}</td>
                                            <td>@mdo</td>
                                        </tr>
                                    </c:forEach> 

                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
