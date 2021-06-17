<%-- 
    Document   : editar usuario
    Created on : 16-jun-2021, 18:03:50
    Author     : bailarina77
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="Control.Conexion"%>
<%@page import="java.sql.Connection"%>
<%@page import="Modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<% 
     
             String usuario=(String)session.getAttribute("Usuario");
             Usuario u=new Usuario(); 
             Connection con=Conexion.getConnection();
             try{
                    /*DATOS DEL USUARIO*/
                    String q="select * from musuario where usuario =?";
                    PreparedStatement ps=con.prepareStatement(q);
                    ps.setString(1,usuario);
                    ResultSet rs = ps.executeQuery();
                     while(rs.next()){

                         u.setNombre(rs.getString("nombre"));
                           u.setApellidos(rs.getString("apellidos"));
                           u.setUsuario(rs.getString("usuario"));
                           u.setCorreo(rs.getString("correo"));
                           u.setId(rs.getInt("id_Usuario"));
                           u.setContraseña(rs.getString("contraseña"));
                           u.setSexo(rs.getString("sexo"));
                           u.setEdad(rs.getInt("edad"));

                  

                     }
   
        }catch(Exception ed){
            System.out.println(ed.getMessage());
        
          }

                          %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Datos</title>
        <link rel="shortcut icon" href="../../img/efeicon.ico">
        
    </head>
    <body>
            <form method="POST" action="../../actualizarUsuario" name="actualizarusuario" id="formulario2" class="formulario__register">
                    
                    <input type="hidden" id="id2" name="id2" value="<%=u.getId()%>" >
                
                
                    <!-- Grupo: Usuario -->
                    <div class="formulario__grupo" id="grupo__usuario">
                        <label for="usuario" class="formulario__label">Usuario</label>
                        <div class="formulario__grupo-input">
                            <input type="text" class="formulario__input" name="usuario2" id="usuario2" value="<%=u.getUsuario()%>" placeholder="Ingresa tu Usuario">
                            <i class="formulario__validacion-estado fas fa-times-circle"></i>
                        </div>
                        <p class="formulario__input-error">El usuario tiene que ser de 4 a 16 dígitos y solo puede contener numeros, letras y guion bajo.</p>
                    </div>
                    
                    
                    <!-- Grupo: Nombre -->
                    <div class="formulario__grupo" id="grupo__nombre">
                        <label for="nombre" class="formulario__label">Nombre</label>
                        <div class="formulario__grupo-input">
                            <input type="text" class="formulario__input" name="nombre2"  value="<%=u.getNombre()%>"    id="nombre2" placeholder="Ingresa tu Nombre">
                            <i class="formulario__validacion-estado fas fa-times-circle"></i>
                        </div>
                        <p class="formulario__input-error">Ingresa un nombre valido.</p>
                    </div>
                    
                    
                    <!-- Grupo: Apellidos -->
                    <div class="formulario__grupo" id="grupo__appe">
                        <label for="appe" class="formulario__label">Apellidos</label>
                        <div class="formulario__grupo-input">
                            <input type="text" class="formulario__input" name="appe2" id="appe2" value="<%=u.getApellidos()%>" placeholder="Ingresa tus Apellidos">
                            <i class="formulario__validacion-estado fas fa-times-circle"></i>
                        </div>
                        <p class="formulario__input-error">Solo se aceptan letras.</p>
                    </div>
                    

                    <!-- Grupo: Contraseña -->
                    <div class="formulario__grupo" id="grupo__password">
                        <label for="password" class="formulario__label">Contraseña</label>
                        <div class="formulario__grupo-input">
                            <input type="password" class="formulario__input" name="password2" value="<%=u.getContraseña()%>" id="password2" placeholder="Ingresa Contraseña">
                            <i class="formulario__validacion-estado fas fa-times-circle"></i>
                        </div>
                        <p class="formulario__input-error">La contraseña tiene que ser de 4 a 12 dígitos.</p>
                    </div>

                    <!-- Grupo: Contraseña 2 -->
                    <div class="formulario__grupo" id="grupo__password2">
                        <label for="password2" class="formulario__label">Repetir Contraseña</label>
                        <div class="formulario__grupo-input">
                            <input type="password" class="formulario__input" name="password3" id="password3" placeholder="Ingresa Contraseña">
                            <i class="formulario__validacion-estado fas fa-times-circle"></i>
                        </div>
                        <p class="formulario__input-error">Ambas contraseñas deben ser iguales.</p>
                    </div>

                    <!-- Grupo: Correo Electronico -->
                    <div class="formulario__grupo" id="grupo__correo">
                        <label for="correo" class="formulario__label">Correo Electrónico</label>
                        <div class="formulario__grupo-input">
                            <input type="email" class="formulario__input" name="correo2" id="correo2" value="<%=u.getCorreo()%>" placeholder="correo@correo.com">
                            <i class="formulario__validacion-estado fas fa-times-circle"></i>
                        </div>
                        <p class="formulario__input-error">El correo solo puede contener letras, numeros, puntos, guiones y guion bajo.</p>
                    </div>

                    <!-- Grupo: Edad -->
                    <div class="formulario__grupo" id="grupo__edad">
                        <label for="edad" class="formulario__label">Edad</label>
                        <div class="formulario__grupo-input">
                            <input type="text" class="formulario__input" name="edad2" id="edad2" value="<%=u.getEdad()%>" placeholder="Edad">
                            <i class="formulario__validacion-estado fas fa-times-circle"></i>
                        </div>
                        <p class="formulario__input-error">Ingresa una edad valida.</p>
                    </div>
                    
                    <!-- Grupo: Sexo -->
                    <div class="formulario__grupo" id="grupo__sexo">     
                        <label for="sexo" class="formulario__label">Sexo</label>
                            <div class="select">
                              <select name="slct2" id="slct2" >     
                                <option value="1">Femenino</option>
                                <option value="2">Masculino</option>
                                <option value="3">No gracias!</option>
                              </select>
                            </div>
                    </div>
                    
                    
                    


                    <div class="formulario__mensaje" id="formulario__mensaje">
                        <p><i class="fas fa-exclamation-triangle"></i> Error:Rellena el formulario correctamente. </p>
                    </div>
                    

                    <button class="btn_sign_up" type="submit" id="registrar">Registrarse</button>
                    
        
        <!--ACABA EL CONTENEDOR DEL REGISTRO-->
                </form>
                            
                 
    </body>
</html>

