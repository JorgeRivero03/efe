<%-- 
    Document   : consumoC
    Created on : 15-jun-2021, 13:08:02
    Author     : bailarina77
--%>

<%@page import="Modelo.DConsumo"%>
<%@page import="Control.AccionesConsumo"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.MAdiccion_Usuario"%>
<%@page import="Modelo.Usuario"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="Control.Conexion"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>



 <% 
     
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

                          %>



<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consumo</title>
        <link rel="shortcut icon" href="../../img/efeicon.ico">
    </head>
        <body>
        
        
            <form action="../../registrarConsumoX" class="formulario__cigarro">

                        <h2>¿Que hay de nuevo? <%=u.getUsuario()%></h2>   
                        
                        
                        <input class="id_adiccion" name="id_adiccion" id="id_adiccion" type="hidden" value=<%=u.getRol()%>>
                        <input class="id_usuario" name="id_usuario" id="id_usuario"  type="hidden" value=<%=u.getId()%>>

                        <!-- Grupo: CONSUMO -->
                        <div class="formulario__grupo" id="grupo__consumo">
                            <label for="consumo" class="formulario__label">Consumo(Cigarros)</label>
                            <div class="formulario__grupo-input">
                                <input type="number" min="1" max="100" class="formulario__input" name="consumo" id="consumo" placeholder="Ingresa el consumo">
                                <i class="formulario__validacion-estado fas fa-times-circle"></i>
                            </div>
                            <p class="formulario__input-error">Ingresa una cantidad valida.</p>
                        </div>

                        <!-- Grupo: GASTO -->
                        <div class="formulario__grupo" id="grupo__gasto">
                            <label for="gasto" class="formulario__label">Gasto($)</label>
                            <div class="formulario__grupo-input">
                                <input type="number" class="formulario__input" name="gasto" id="gasto" placeholder="Ingresa Gasto">
                                <i class="formulario__validacion-estado fas fa-times-circle"></i>
                            </div>
                            <p class="formulario__input-error">Ingresa una cantidad valida.</p>
                        </div>

                        <!--BUTON XD-->
                        <button type="submit" class="btn_login" id="registrar">Ingresar</button>
            </form>
                        
                        
                        
        <!TABLA PARA VER LOS REGISTRO-->
        
        
            <div class="container">
            <h1>Consumos</h1>
            <br>
            <table cellpadding="10" cellspacing="10" border="0" border="2">

                <!--CABECERA DE LA TABLA-->
                <thead>
                    <tr>
                        <th>Fecha</th>
                        <th>Cantidad Consumida</th>
                        <th>Gasto Consumo</th>
                        <th></th>
                    </tr>
                </thead>
                <!--FINAL CABECERA DE LA TABLA-->


                <!--CUERPO DE LA TABLA-->
                <tbody>
                    <%
                                    List<DConsumo> lista=AccionesConsumo.getAllConsumos(u.getId());
                                    for(DConsumo e: lista){
                              %>
                        <tr>

                            <td><%=e.getFecha_consumo()%></td>                
                            <td><%=e.getCantidad_consumo()%></td>
                            <td><%=e.getConsumo_gasto()%></td>
                            <td> <a href="../../borrarC?id=<%=e.getId_consumo()%>" >Borrar</a> </td>
                        </tr>         
                    <%

                                    }
                              %>
                </tbody>
                <!--CUERPO DE LA TABLA-->

            </table>
        </div>
                        
                        
        
        </body>
</html>
