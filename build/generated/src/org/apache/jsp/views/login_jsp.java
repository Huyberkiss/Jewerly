package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/css/login.css");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Login</title>\r\n");
      out.write("        <link rel=\"stylesheet\"\r\n");
      out.write("              href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\r\n");
      out.write("        <script\r\n");
      out.write("        src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("        <script\r\n");
      out.write("        src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("        <script\r\n");
      out.write("        src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\"\r\n");
      out.write("              href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("        <style>\r\n");
      out.write("            ");
      out.write(".form-container{\r\n");
      out.write("    border: 1px solid black;\r\n");
      out.write("    padding: 20px 30px;\r\n");
      out.write("    margin-top: 20vh;\r\n");
      out.write("    box-shadow: -1px 4px 25px 10px rgba(0,0,0,0.7);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body{\r\n");
      out.write("    background: url('../img/bglogin.jpg') no-repeat;\r\n");
      out.write("    background-size: cover;\r\n");
      out.write("    background-position: center;\r\n");
      out.write("    height: 100vh;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".control-text {\r\n");
      out.write("    font-size: 18px;\r\n");
      out.write("    margin-left: 23vh;\r\n");
      out.write("    margin-top: 2vh;\r\n");
      out.write("    margin-bottom: 2vh;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-control{\r\n");
      out.write("    margin-top: 10px;\r\n");
      out.write("    margin-left: 25vh;\r\n");
      out.write("}");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container-fluid bg-form\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-4 mx-auto form-container\">\r\n");
      out.write("                    <h1 class=\"font-weight-bold  text-light\" style=\"text-transform: uppercase\">Login</h1>\r\n");
      out.write("                    <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/LoginController\" method=\"POST\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"formGroupExampleInput\" class=\"text-light\" style=\"font-size: 18px\">User</label>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"formGroupExampleInput\" name=\"user\" placeholder=\"User name\" required >\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"formGroupExampleInput2\" class=\"text-light\" style=\"font-size: 18px\">Password</label>\r\n");
      out.write("                            <input type=\"password\" class=\"form-control\" id=\"formGroupExampleInput2\" name=\"pass\" placeholder=\"Password\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        ");
 if (request.getParameter("isLogin") != null) {
                                if (request.getParameter("isLogin").equals("false")) {
                                    out.println(" <div class=" + "\"alert alert-danger\"" + "role=\"alert\">");
                                    out.println("Login failed, Wrong user or password!");
                                    out.print("</div>");
                                }
                            }
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"control-text \">\r\n");
      out.write("                            <a href=\"#\" class=\"text-dark\"> Don't have account ? create one ! </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-success  btn-lg btn-control\" name=\"btnSubmit\"> Enter </button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
