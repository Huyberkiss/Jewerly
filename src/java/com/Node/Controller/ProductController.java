/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Node.Controller;

import com.Node.DAO.ProductDAO;
import com.Node.Entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class ProductController extends HttpServlet {

    ArrayList<Product> listProduct;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ProductController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ProductController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        listProduct = new ProductDAO().getAll();

        if (request.getParameter("search") != null) {
            includesProduct(request, response);
        } else if (request.getParameter("sort") != null) {
            sortAlphabet(request, response, request.getParameter("sort"));
        } else if (request.getParameter("price") != null) {
            sortPrice(request, response, request.getParameter("price"));
        }

        request.setAttribute("listProduct", listProduct);

        request.getRequestDispatcher("views/product.jsp").forward(request, response);

    }

    private void includesProduct(HttpServletRequest request, HttpServletResponse response) {
        ArrayList<Product> temp = new ArrayList<>();
        String search = request.getParameter("search");
        for (Product i : listProduct) {
            if (i.getName().toLowerCase().contains(search.toLowerCase())) {
                temp.add(i);
            }
        }
        listProduct = temp;
    }

    private void sortAlphabet(HttpServletRequest request, HttpServletResponse response, String msg) {
        listProduct = new ProductDAO().sortProductAlphaBet(msg);
    }

    private void sortPrice(HttpServletRequest request, HttpServletResponse response, String msg) {
        listProduct = new ProductDAO().sortProductPrice(msg);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
