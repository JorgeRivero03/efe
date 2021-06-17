package org.apache.jsp.JSP;

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
      out.write("        <link href=\"../CSS/azucar.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"../img/efeicon.ico\">\n");
      out.write("    </head>\n");
      out.write("    <header>\n");
      out.write("        <!--Hey! This is the original version\n");
      out.write("of Simple CSS Waves-->\n");
      out.write("\n");
      out.write("        <div class=\"header\">\n");
      out.write("\n");
      out.write("            <!--Content before waves-->\n");
      out.write("            <div class=\"inner-header flex\">\n");
      out.write("                <!--Just the logo.. Don't mind this-->\n");
      out.write("                <svg version=\"1.1\" class=\"logo\" baseProfile=\"tiny\" id=\"Layer_1\" xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                     xmlns:xlink=\"http://www.w3.org/1999/xlink\" x=\"0px\" y=\"0px\" viewBox=\"0 0 500 500\" xml:space=\"preserve\">\n");
      out.write("                <path fill=\"#FFFFFF\" stroke=\"#000000\" stroke-width=\"10\" stroke-miterlimit=\"10\" d=\"M57,283\" />\n");
      out.write("                <g><path fill=\"#fff\"\n");
      out.write("                         d=\"M250.4,0.8C112.7,0.8,1,112.4,1,250.2c0,137.7,111.7,249.4,249.4,249.4c137.7,0,249.4-111.7,249.4-249.4\n");
      out.write("                         C499.8,112.4,388.1,0.8,250.4,0.8z M383.8,326.3c-62,0-101.4-14.1-117.6-46.3c-17.1-34.1-2.3-75.4,13.2-104.1\n");
      out.write("                         c-22.4,3-38.4,9.2-47.8,18.3c-11.2,10.9-13.6,26.7-16.3,45c-3.1,20.8-6.6,44.4-25.3,62.4c-19.8,19.1-51.6,26.9-100.2,24.6l1.8-39.7    c35.9,1.6,59.7-2.9,70.8-13.6c8.9-8.6,11.1-22.9,13.5-39.6c6.3-42,14.8-99.4,141.4-99.4h41L333,166c-12.6,16-45.4,68.2-31.2,96.2  c9.2,18.3,41.5,25.6,91.2,24.2l1.1,39.8C390.5,326.2,387.1,326.3,383.8,326.3z\" />\n");
      out.write("                </g>\n");
      out.write("                </svg>\n");
      out.write("                <h1>HOLA AZUCARUSUARIO!</h1>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!--Waves Container-->\n");
      out.write("            <div>\n");
      out.write("                <svg class=\"waves\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"\n");
      out.write("                     viewBox=\"0 24 150 28\" preserveAspectRatio=\"none\" shape-rendering=\"auto\">\n");
      out.write("                <defs>\n");
      out.write("                <path id=\"gentle-wave\" d=\"M-160 44c30 0 58-18 88-18s 58 18 88 18 58-18 88-18 58 18 88 18 v44h-352z\" />\n");
      out.write("                </defs>\n");
      out.write("                <g class=\"parallax\">\n");
      out.write("                <use xlink:href=\"#gentle-wave\" x=\"48\" y=\"0\" fill=\"rgba(255,255,255,0.7\" />\n");
      out.write("                <use xlink:href=\"#gentle-wave\" x=\"48\" y=\"3\" fill=\"rgba(255,255,255,0.5)\" />\n");
      out.write("                <use xlink:href=\"#gentle-wave\" x=\"48\" y=\"5\" fill=\"rgba(255,255,255,0.3)\" />\n");
      out.write("                <use xlink:href=\"#gentle-wave\" x=\"48\" y=\"7\" fill=\"#fff\" />\n");
      out.write("                </g>\n");
      out.write("                </svg>\n");
      out.write("            </div>\n");
      out.write("            <!--Waves end-->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!--Header ends-->\n");
      out.write("\n");
      out.write("        <!--Content starts-->\n");
      out.write("        <div class=\"content flex\">\n");
      out.write("            <p>LUDEX todos los derechos reservados</p>\n");
      out.write("        </div>\n");
      out.write("        <!--Content ends-->\n");
      out.write("    </header>\n");
      out.write("    <body>       \n");
      out.write("      \n");
      out.write("        <section class=\"container\"> \n");
      out.write("        <div class=\"wowpanel\">\n");
      out.write("            <div class=\"content\"><h1>move</h1></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"wowpanel\">\n");
      out.write("            <div class=\"content\"><h1>your</h1></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"wowpanel\">\n");
      out.write("            <div class=\"content\"><h1>cursor</h1></div>\n");
      out.write("        </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("<footer class=\"footer\">\n");
      out.write("        <div class=\"container footer_caption\">\n");
      out.write("            <section class=\"download\">\n");
      out.write("                <div class=\"footer_copy\">\n");
      out.write("                    <p class=\"copyright\">\n");
      out.write("                        LUDEX &copy; 2021 todos los derechos reservados\n");
      out.write("                    </p>\n");
      out.write("                    <a href=\"#\" class=\"politica_privacidad politica_privacidad--margin\">Politica de Privacidad</a>\n");
      out.write("                    <a href=\"#\" class=\"politica_privacidad\">Terminos y condiciones</a>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            \n");
      out.write("            </section>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"contact\">\n");
      out.write("            <div class=\"item_contact\">\n");
      out.write("                <i class='bx bx-copyright contact_icon'></i>\n");
      out.write("                <h3 class=\"contact_title\">LUDEX</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item_contact\">\n");
      out.write("                <i class='bx bx-mail-send contact_icon'></i>\n");
      out.write("                <h3 class=\"contact_title\">ludex@gmail.com</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item_contact\">\n");
      out.write("                <i class='bx bxs-edit-location contact_icon'></i>\n");
      out.write("                <h3 class=\"contact_title\">Paseos de la Reforma</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item_contact item_contact--purple\">\n");
      out.write("                <i class='bx bxs-chat contact_icon contact_icon--modifier'></i>\n");
      out.write("                <h3 class=\"contact_title\">Contacta ahora</h3>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
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
