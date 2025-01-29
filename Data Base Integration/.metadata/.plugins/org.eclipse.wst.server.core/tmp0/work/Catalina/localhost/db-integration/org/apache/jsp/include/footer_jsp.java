/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/11.0.0-M22
 * Generated at: 2025-01-28 16:52:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.include;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Sticky Footer Example</title>\n");
      out.write("    <!-- Font Awesome for social icons -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <style>\n");
      out.write("        /* Ensure the body and html take the full height */\n");
      out.write("        html, body {\n");
      out.write("            height: 100%;\n");
      out.write("            margin: 0;\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Wrapper for content to push the footer down */\n");
      out.write("        .content-wrap {\n");
      out.write("            flex: 1; /* This pushes the footer to the bottom */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Footer styling */\n");
      out.write("        #footerwrap {\n");
      out.write("            background: #333; /* Set footer background color */\n");
      out.write("            color: white; /* Set footer text color */\n");
      out.write("            padding: 20px 0;\n");
      out.write("            text-align: center; /* Center align text for simplicity */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #footerwrap h4 {\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("            font-size: 18px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #footerwrap p {\n");
      out.write("            margin: 0; /* Ensure no extra spacing inside the footer */\n");
      out.write("            line-height: 1.5;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .hline-w {\n");
      out.write("            border-top: 2px solid white; /* Example for divider styling */\n");
      out.write("            width: 50px;\n");
      out.write("            margin: 10px auto; /* Center the divider */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #footerwrap .fa {\n");
      out.write("            margin: 0 10px; /* Space between social icons */\n");
      out.write("            color: white; /* Icon color */\n");
      out.write("            text-decoration: none; /* No underline for links */\n");
      out.write("            font-size: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #footerwrap .fa:hover {\n");
      out.write("            color: #db222a; /* Change icon color on hover */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Responsive grid structure */\n");
      out.write("        .container {\n");
      out.write("            max-width: 1200px;\n");
      out.write("            margin: 0 auto;\n");
      out.write("            padding: 0 15px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .row {\n");
      out.write("            display: flex;\n");
      out.write("            flex-wrap: wrap;\n");
      out.write("            gap: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .col-lg-4 {\n");
      out.write("            flex: 1 1 calc(33.333% - 20px); /* 3 equal columns with a gap */\n");
      out.write("            min-width: 200px; /* Ensure proper responsiveness */\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <!-- Content -->\n");
      out.write("    <div class=\"content-wrap\">\n");
      out.write("        <!-- Add your main content here -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Footer -->\n");
      out.write("    <div id=\"footerwrap\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-4\">\n");
      out.write("                    <h4>About</h4>\n");
      out.write("                    <div class=\"hline-w\"></div>\n");
      out.write("                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4\">\n");
      out.write("                    <h4>Social Links</h4>\n");
      out.write("                    <div class=\"hline-w\"></div>\n");
      out.write("                    <p>\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-dribbble\"></i></a>\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-tumblr\"></i></a>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4\">\n");
      out.write("                    <h4>Our Bunker</h4>\n");
      out.write("                    <div class=\"hline-w\"></div>\n");
      out.write("                    <p>\n");
      out.write("                        Some Ave, 987,<br/>\n");
      out.write("                        23890, New York,<br/>\n");
      out.write("                        United States.<br/>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
