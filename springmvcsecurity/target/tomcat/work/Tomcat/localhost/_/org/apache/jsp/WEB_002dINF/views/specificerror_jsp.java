/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-05-30 03:32:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class specificerror_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/views/fragments/footer.jspf", Long.valueOf(1495825520000L));
    _jspx_dependants.put("/WEB-INF/views/fragments/navbar.jspf", Long.valueOf(1495859219000L));
    _jspx_dependants.put("/WEB-INF/views/fragments/header.jspf", Long.valueOf(1495825520000L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t\t<title>Insert title here</title>\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"webjars/bootstrap/3.3.7-1/css/bootstrap.min.css\"/>\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/main.css\"/>\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t");
      out.write('\n');
      out.write("<nav role=\"navigation\" class=\"navbar navbar-default\">\n");
      out.write("\t<div class=\"\">\n");
      out.write("\t\t<a href=\"http://www.in28minutes.com\" class=\"navbar-brand\">in28Minutes</a>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"navbar-collapse\">\n");
      out.write("\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t<li><a href=\"/welcome\">Home</a></li>\n");
      out.write("\t\t\t<li><a href=\"/gettodo\">Todos</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t<li><a href=\"/logout\">Logout</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("</nav>");
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<p>This is a specific error page</p>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"webjars/bootstrap/3.3.7-1/js/bootstrap.min.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"webjars/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"webjars/bootstrap/3.3.7-1/js/bootstrap.min.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"webjars/jquery/3.2/jquery.min.js\"></script>\n");
      out.write("\t</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
