package org.apache.jsp.JSP.azucar;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class paginaAzucar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>BIENVENIDO</title>\n");
      out.write("        <link href=\"../CSS/adicciongeneral.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"../img/efeicon.ico\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <header>\n");
      out.write("\t<div class=\"overlay\">\n");
      out.write("            <h1>BIENVENIDO</h1>\n");
      out.write("            <h3>Reasons for Choosing US</h3>\n");
      out.write("            <p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Vero nostrum quis, odio veniam itaque ullam debitis qui magnam consequatur ab. Vero nostrum quis, odio veniam itaque ullam debitis qui magnam consequatur ab.</p>\n");
      out.write("                    <br>\n");
      out.write("                    <button>READ MORE</button>\n");
      out.write("        </div>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        \n");
      out.write("            <div id=\"buttons\">\n");
      out.write("              <a href=\"#\" class=\"btn blue\">Blue Button</a>\n");
      out.write("              <a href=\"#\" class=\"btn green\">Green Button</a>\n");
      out.write("              <a href=\"#\" class=\"btn red\">Red Button</a>\n");
      out.write("              <a href=\"#\" class=\"btn purple\">Purple Button</a>\n");
      out.write("              <a href=\"#\" class=\"btn orange\">Orange Button</a>\n");
      out.write("              <a href=\"#\" class=\"btn yellow\">Yellow Button</a>\n");
      out.write("            </div>\n");
      out.write("    \n");
      out.write("        \n");
      out.write("        <script src=\"../JS/adicciongeneral.js\"></script>\n");
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
