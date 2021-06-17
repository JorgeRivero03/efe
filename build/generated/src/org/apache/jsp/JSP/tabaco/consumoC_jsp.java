package org.apache.jsp.JSP.tabaco;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.MAdiccion_Usuario;
import Modelo.Usuario;
import java.sql.ResultSet;
import Control.Conexion;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class consumoC_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Consumo</title>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"../../img/efeicon.ico\">\n");
      out.write("    </head>\n");
      out.write("        <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("            <form method=\"POST\" action=\"../../registrarConsumo\" class=\"formulario__cigarro\">\n");
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                ");
 
     
             String usuario=(String)session.getAttribute("Usuario");
             Usuario u=new Usuario(); 
             MAdiccion_Usuario a= new MAdiccion_Usuario();
             Connection con=Conexion.getConnection();
             try{
                    /*DATOS DEL USUARIO*/
                    String q="select * from musuario where usuario =?";
                     PreparedStatement ps=con.prepareStatement(q);
                    ps.setString(1,usuario);
                    ResultSet rs = ps.executeQuery();
                     while(rs.next()){
                           u.setUsuario(rs.getString("usuario"));         
                           u.setId(rs.getInt("id_Usuario"));
                           u.setRol(rs.getInt("rol"));
                     }
            System.out.println("CONSULTA EXITOSA");       
        }catch(Exception ed){
            System.out.println("Error al CONSULTAR");
            System.out.println(ed.getMessage());
        
          }

                          
      out.write("\n");
      out.write("                        <h2>¿Que hay de nuevo? ");
      out.print(u.getUsuario());
      out.write("</h2>   \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <input class=\"id_adiccion\" id=\"id_adiccion\" type=\"hidden\" value=");
      out.print(u.getRol());
      out.write(">\n");
      out.write("                        <input class=\"id_usuario\" id=\"id_usuario\"  type=\"hidden\" value=");
      out.print(u.getId());
      out.write(">\n");
      out.write("\n");
      out.write("                        <!-- Grupo: CONSUMO -->\n");
      out.write("                        <div class=\"formulario__grupo\" id=\"grupo__consumo\">\n");
      out.write("                            <label for=\"consumo\" class=\"formulario__label\">Consumo(Cigarros)</label>\n");
      out.write("                            <div class=\"formulario__grupo-input\">\n");
      out.write("                                <input type=\"number\" min=\"1\" max=\"100\" class=\"formulario__input\" name=\"consumo\" id=\"consumo\" placeholder=\"Ingresa el consumo\">\n");
      out.write("                                <i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <p class=\"formulario__input-error\">Ingresa una cantidad valida.</p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Grupo: GASTO -->\n");
      out.write("                        <div class=\"formulario__grupo\" id=\"grupo__gasto\">\n");
      out.write("                            <label for=\"gasto\" class=\"formulario__label\">Gasto($)</label>\n");
      out.write("                            <div class=\"formulario__grupo-input\">\n");
      out.write("                                <input type=\"number\" class=\"formulario__input\" name=\"gasto\" id=\"gasto\" placeholder=\"Ingresa Gasto\">\n");
      out.write("                                <i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <p class=\"formulario__input-error\">Ingresa una cantidad valida.</p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!--BUTON XD-->\n");
      out.write("                        <button type=\"submit\" class=\"btn_login\" id=\"logear\">Ingresar</button>\n");
      out.write("            </form>\n");
      out.write("        \n");
      out.write("        </body>\n");
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
