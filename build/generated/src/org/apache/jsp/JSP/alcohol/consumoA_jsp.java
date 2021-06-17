package org.apache.jsp.JSP.alcohol;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Modelo.DConsumo;
import Control.AccionesConsumo;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import Control.Conexion;
import java.sql.Connection;
import Modelo.MAdiccion_Usuario;
import Modelo.Usuario;
import Modelo.Usuario;

public final class consumoA_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write(" ");
 
     
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
   
        }catch(Exception ed){
            System.out.println(ed.getMessage());
        
          }

                          
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Consumo</title>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"../../img/efeicon.ico\">\n");
      out.write("    </head>\n");
      out.write("        <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("            <form action=\"../../registrarConsumoY\" class=\"formulario__cigarro\">\n");
      out.write("\n");
      out.write("                        <h2>¿Que hay de nuevo? ");
      out.print(u.getUsuario());
      out.write("</h2>   \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <input class=\"id_adiccion\" name=\"id_adiccion\" id=\"id_adiccion\" type=\"hidden\" value=");
      out.print(u.getRol());
      out.write(">\n");
      out.write("                        <input class=\"id_usuario\" name=\"id_usuario\" id=\"id_usuario\"  type=\"hidden\" value=");
      out.print(u.getId());
      out.write(">\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                        <!-- Grupo: UNIDAD -->\n");
      out.write("                        <div class=\"formulario__grupo\" id=\"grupo__sexo\">     \n");
      out.write("                            <label for=\"sexo\" class=\"formulario__label\">Sexo</label>\n");
      out.write("                                <div class=\"select\">\n");
      out.write("                                  <select name=\"slct2\" id=\"slct2\" >\n");
      out.write("                                    <option value=\"1\">Shot 45 ml</option>\n");
      out.write("                                    <option value=\"2\">Botella 210ml</option>\n");
      out.write("                                    <option value=\"3\">Botella 375 ml</option>\n");
      out.write("                                    <option value=\"4\">Botella 750 ml </option>\n");
      out.write("                                    <option value=\"5\">Botella 940 ml </option>\n");
      out.write("                                    <option value=\"6\">ml</option>\n");
      out.write("                                    \n");
      out.write("                                  </select>\n");
      out.write("                                </div>\n");
      out.write("                        </div>\n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <!-- Grupo: CONSUMO -->\n");
      out.write("                        <div class=\"formulario__grupo\" id=\"grupo__consumo\">\n");
      out.write("                            <label for=\"consumo\" class=\"formulario__label\">Consumo</label>\n");
      out.write("                            <div class=\"formulario__grupo-input\">\n");
      out.write("                                <input type=\"number\" min=\"1\" max=\"20\" class=\"formulario__input\" name=\"consumo\" id=\"consumo\" placeholder=\"Ingresa el consumo\">\n");
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
      out.write("                        <button type=\"submit\" class=\"btn_login\" id=\"registrar\">Ingresar</button>\n");
      out.write("            </form>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("        <!TABLA PARA VER LOS REGISTRO-->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("            <div class=\"container\">\n");
      out.write("            <h1>Consumos</h1>\n");
      out.write("            <br>\n");
      out.write("            <table cellpadding=\"10\" cellspacing=\"10\" border=\"0\" border=\"2\">\n");
      out.write("\n");
      out.write("                <!--CABECERA DE LA TABLA-->\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Fecha</th>\n");
      out.write("                        <th>Cantidad Consumida(ml)</th>\n");
      out.write("                        <th>Gasto Consumo($)</th>\n");
      out.write("                        <th></th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <!--FINAL CABECERA DE LA TABLA-->\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!--CUERPO DE LA TABLA-->\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                                    List<DConsumo> lista=AccionesConsumo.getAllConsumos(u.getId());
                                    for(DConsumo e: lista){
                              
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("\n");
      out.write("                            <td>");
      out.print(e.getFecha_consumo());
      out.write("</td>                \n");
      out.write("                            <td>");
      out.print(e.getCantidad_consumo());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(e.getConsumo_gasto());
      out.write("</td>\n");
      out.write("                            <td> <a href=\"../../borrarC?id=");
      out.print(e.getId_consumo());
      out.write("\" >Borrar</a> </td>\n");
      out.write("                        </tr>         \n");
      out.write("                    ");


                                    }
                              
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("                <!--CUERPO DE LA TABLA-->\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("        \n");
      out.write("        </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
