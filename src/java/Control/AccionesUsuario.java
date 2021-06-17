/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Adiccion;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author bailarina77
 */
public class AccionesUsuario {
    
    /*REGISTRO DE USUARIOS*/
    public static int registrarUsuario(Usuario e){
        int estatus=0;
        try{
            Connection con= Conexion.getConnection();
            String q="insert into MUsuario(nombre,apellidos,usuario,contraseña,correo,edad,sexo,rol) "
                    +"values(?,?,?,?,?,?,?,?)";     
            PreparedStatement ps=con.prepareStatement(q);
            ps.setString(1,e.getNombre());
            ps.setString(2,e.getApellidos());
            ps.setString(3,e.getUsuario());
            ps.setString(4,e.getContraseña());
            ps.setString(5,e.getCorreo());
            ps.setInt(6,e.getEdad());
            ps.setString(7,e.getSexo());
            ps.setInt(8,e.getRol());
        

            estatus=ps.executeUpdate();
            System.out.println("Registro exitoso");
            con.close();
            
           
            
        }catch(Exception ed){
            System.out.println("Error al registrar");
            System.out.println(ed.getMessage());
        }
        
        return estatus;
    }
    
    public static int validarUsuario(Usuario e){
        int estatus=0;
        try{
            Connection con=Conexion.getConnection();
            String q="select * from musuario where usuario = ? and contraseña = ? ";
             
              
             PreparedStatement ps=con.prepareStatement(q);
            ps.setString(1,e.getUsuario());
            ps.setString(2,e.getContraseña());
            ResultSet rs = ps.executeQuery();
             while(rs.next()){
                   int privilegio=rs.getInt("rol"); 
                   estatus = estatus +1 ;
                   e.setUsuario(rs.getString("usuario"));
                   e.setContraseña(rs.getString("contraseña"));
                   if(estatus == 1){
                         return 1;
                   
             }else{
             
                   return 0;
             }
             }
            System.out.println("Login exitoso");
            con.close();
            
        }catch(Exception ed){
            System.out.println("Error al logear");
            System.out.println(ed.getMessage());
        
          }
        return 0;
    }
    
    
    
    
    
    
    /*INICIA LA ACTUALIZACION*/
    public static int actualizarUsuario(Usuario e){
        int estatus=0;
        try{
            Connection con=Conexion.getConnection();
             String q = "update MUsuario set usuario=?, nombre=?,"
                    + "apellidos=?,  contraseña=?, correo=?, edad=?, sexo=?"
                     +" where id_Usuario=?";


            PreparedStatement ps=con.prepareStatement(q);
            
            ps.setString(1,e.getUsuario());
            ps.setString(2,e.getNombre());
            ps.setString(3,e.getApellidos());
            ps.setString(4,e.getContraseña());
            ps.setString(5,e.getCorreo());
            ps.setInt(6,e.getEdad());
            ps.setString(7,e.getSexo());
            ps.setInt(8, e.getId());
            
            estatus=ps.executeUpdate();
            System.out.println("Actualizacion exitosa");
            con.close();
            
        }catch(Exception ed){
            System.out.println("Error al actualizar");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }
    /*TERMINA LA ACTUALIZACION*/
    
    
    
    
    
    
    
    
}