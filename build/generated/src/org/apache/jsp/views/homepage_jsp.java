package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/css/homepage.css");
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Home</title>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
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
      out.write("        <style>\r\n");
      out.write("            ");
      out.write(".carousel-inner > .carousel-item > img {\n");
      out.write("    height: 600px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".service-icon{\n");
      out.write("    display:inline-block;\n");
      out.write("    font-size: 24px;\n");
      out.write("    margin-bottom: 16px; \n");
      out.write("}\n");
      out.write("h5{\n");
      out.write("    font-weight: bold;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#product{\n");
      out.write("    background: #000;\n");
      out.write("}\n");
      out.write("#title-product{\n");
      out.write("    color: #ffffff;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".welcome hr{\n");
      out.write("    border-top: 2px solid rgba(50,70,100,0.4);\n");
      out.write("    width: 95%;\n");
      out.write("    margin-bottom: 2rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".testimontials{\n");
      out.write("    padding: 40px 0 ;\n");
      out.write("    text-align: center;\n");
      out.write("    background: #eee;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".inner{\n");
      out.write("    max-width: 1200px;\n");
      out.write("    margin: auto;\n");
      out.write("    overflow: hidden;\n");
      out.write("    padding: 0 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".border{\n");
      out.write("    width: 160px;\n");
      out.write("    height: 5px;\n");
      out.write("    background: #6ab04c;\n");
      out.write("    margin: 26px auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".row{\n");
      out.write("    display: flex;\n");
      out.write("    flex-wrap: wrap;\n");
      out.write("    justify-content: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col{\n");
      out.write("    flex: 33.33% ; \n");
      out.write("    max-width: 33.33%;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    padding: 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".testimontial{\n");
      out.write("    background: #fff;\n");
      out.write("    padding: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".testimontial img{\n");
      out.write("    width: 100px;\n");
      out.write("    height: 100px;\n");
      out.write("    border-radius: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".name{\n");
      out.write("    font-size: 20px;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("}");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("        <section class=\"main\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div id=\"carouselExampleIndicators\" class=\"carousel slide\"\r\n");
      out.write("                     data-ride=\"carousel\">\r\n");
      out.write("\r\n");
      out.write("                    <ol class=\"carousel-indicators\">\r\n");
      out.write("                        <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\"\r\n");
      out.write("                            class=\"active\"></li>\r\n");
      out.write("                        <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\r\n");
      out.write("                        <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\r\n");
      out.write("                    </ol>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"carousel-inner\">\r\n");
      out.write("                        <div class=\"carousel-item active\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/carousel1.jpg\"\r\n");
      out.write("                                 class=\"d-block w-100\" alt=\"blabla\">\r\n");
      out.write("                            <div class=\"carousel-caption d-none d-md-block\">\r\n");
      out.write("                                <h5>First slide label</h5>\r\n");
      out.write("                                <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"carousel-item\">\r\n");
      out.write("                            <img\r\n");
      out.write("                                src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/carousel2.jpg\"\r\n");
      out.write("                                class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("                            <div class=\"carousel-caption d-none d-md-block\">\r\n");
      out.write("                                <h3>First slide label</h3>\r\n");
      out.write("                                <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"carousel-item\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/carousel3.jpg\" class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("                            <div class=\"carousel-caption d-none d-md-block\">\r\n");
      out.write("                                <h5>First slide label</h5>\r\n");
      out.write("                                <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\"\r\n");
      out.write("                       role=\"button\" data-slide=\"prev\"> <span\r\n");
      out.write("                            class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span> <span\r\n");
      out.write("                            class=\"sr-only\">Previous</span>\r\n");
      out.write("                    </a> <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\"\r\n");
      out.write("                            role=\"button\" data-slide=\"next\"> <span\r\n");
      out.write("                            class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span> <span\r\n");
      out.write("                            class=\"sr-only\">Next</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!--  End of carousel->>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Service -->\r\n");
      out.write("        <section class=\"services py-5 text-center\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"container-fluid welcome \">\r\n");
      out.write("                    <div class=\"col-12\">\r\n");
      out.write("                        <h1 class=\"display-4 font-weight-bold \" style=\"text-transform: uppercase\">Some Infomation about us</h1>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <hr>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <!-- Single Service -->\r\n");
      out.write("                    <div class=\"col-10 mx-auto col-md-6 col-lg-4 my-3\">\r\n");
      out.write("                        <span class=\"service-icon\">\r\n");
      out.write("                            <i class=\"fa fa-globe fa-2x\"></i>\r\n");
      out.write("                        </span>\r\n");
      out.write("                        <h5 clas=\"font-weight-bold text-uppercase\">\r\n");
      out.write("                            Worldwide Shipping\r\n");
      out.write("                        </h5>\r\n");
      out.write("                        <p class=\"text-capitalize\"> hehehe</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-10 mx-auto col-md-6 col-lg-4 my-3\">\r\n");
      out.write("                        <span class=\"service-icon\">\r\n");
      out.write("                            <i class=\"fa fa-user-o fa-2x\" aria-hidden=\"true\"></i>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </span>\r\n");
      out.write("                        <h5 clas=\"font-weight-bold text-uppercase\">\r\n");
      out.write("                            Certificated by Win.Corp\r\n");
      out.write("                        </h5>\r\n");
      out.write("                        <p class=\"text-capitalize\"> hehehe</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-10 mx-auto col-md-6 col-lg-4 my-3\">\r\n");
      out.write("                        <span class=\"service-icon\">\r\n");
      out.write("                            <i class=\"fa fa-money fa-2x\" aria-hidden=\"true\"></i>\r\n");
      out.write("\r\n");
      out.write("                        </span>\r\n");
      out.write("                        <h5 clas=\"font-weight-bold text-uppercase\">\r\n");
      out.write("                            30 days money back\r\n");
      out.write("                        </h5>\r\n");
      out.write("                        <p class=\"text-capitalize\"> Some</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        <section id=\"product\" class=\"products py-5\">\r\n");
      out.write("            <h2 id=\"title-product\" class=\"text-center font-weight-bold  \" style=\"text-transform: uppercase\"> Collection Summer</h2>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <<div class=\"row row-cols-1 row-cols-md-3\">\r\n");
      out.write("                    <div class=\"col-sm-4 mb-4\">\r\n");
      out.write("                        <div class=\"card h-100\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/collection1.JPG\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("                                <h5 class=\"card-title\">Card title</h5>\r\n");
      out.write("                                <p class=\"card-text\">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4 mb-4\">\r\n");
      out.write("                        <div class=\"card h-100\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/collection2.jpg\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("                                <h5 class=\"card-title\">Card title</h5>\r\n");
      out.write("                                <p class=\"card-text\">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4 mb-4\">\r\n");
      out.write("                        <div class=\"card h-100\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/collection3.jpg\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("                                <h5 class=\"card-title\">Card title</h5>\r\n");
      out.write("                                <p class=\"card-text\">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4 mb-4\">\r\n");
      out.write("                        <div class=\"card h-100\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/collection4.jpg\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("                                <h5 class=\"card-title\">Card title</h5>\r\n");
      out.write("                                <p class=\"card-text\">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4 mb-4\">\r\n");
      out.write("                        <div class=\"card h-100\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/collection5.jpg\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("                                <h5 class=\"card-title\">Card title</h5>\r\n");
      out.write("                                <p class=\"card-text\">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>                 \r\n");
      out.write("                    <div class=\"col-md-4 mb-4\">\r\n");
      out.write("                        <div class=\"card h-100\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/collection6.jpg\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("                                <h5 class=\"card-title\">Card title</h5>\r\n");
      out.write("                                <p class=\"card-text\">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("                            \r\n");
      out.write("                            \r\n");
      out.write("                            \r\n");
      out.write("        <section class=\"testimontials\">\r\n");
      out.write("            <div class=\"container inner \">\r\n");
      out.write("                <h1 class=\"text-center font-weight-bold \" style=\"text-transform: uppercase\"> Somes review about company</h1>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"border\"></div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row \">\r\n");
      out.write("                    <div class=\"col-sm-4\">\r\n");
      out.write("                        <div class=\"testimontial\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/p1.jpg\">\r\n");
      out.write("                            <div class=\"name \"> Hailey Bieber </div>\r\n");
      out.write("                            <div class=\"star\">\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <p>Viet cai gi cung dc </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-4\">\r\n");
      out.write("                        <div class=\"testimontial\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/p2.jpg\">\r\n");
      out.write("                            <div class=\"name \"> G.Dragon </div>\r\n");
      out.write("                            <div class=\"star\">\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star-half-o\" aria-hidden=\"true\"></i>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <p>cha la ce cha la ca</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-4\">\r\n");
      out.write("                        <div class=\"testimontial\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/p3.jpg\">\r\n");
      out.write("                            <div class=\"name \"> Lisa </div>\r\n");
      out.write("                            <div class=\"star\">\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <p>Look at me </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>  \r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
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
