/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.DConsumo;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bailarina77
 */
public class AccionesConsumo {
    
        public static int registrarConsumo(DConsumo e){
        int estatus=0;
        try{
            Connection con= Conexion.getConnection();
            String q="insert into DConsumo(id_usuario, id_adiccion,Fecha_consumo,cantidad_consumida,gasto_consumo) "
                    +"values(?,?,?,?,?)";     
            PreparedStatement ps=con.prepareStatement(q);
            ps.setInt(1,e.getId_usuario());
            ps.setInt(2,e.getId_adiccion()); 
            ps.setString(3,e.getFecha_consumo());
            ps.setInt(4,e.getCantidad_consumo());
            ps.setInt(5,e.getConsumo_gasto());

            estatus=ps.executeUpdate();
            System.out.println("Registro exitoso");
            con.close();
           
        }catch(Exception ed){
            System.out.println("Error al registrar");
            System.out.println(ed.getMessage());
        }
        
        return estatus;
    }
        
        
        
       public static int borrarConsumo(int id){
        int estatus=0;
        try{
            Connection con=Conexion.getConnection();
            String q="Delete from DConsumo where id_consumo=?";
            PreparedStatement ps=con.prepareStatement(q);
            
            ps.setInt(1,id);

            
            estatus=ps.executeUpdate();
            System.out.println("Eliminacion exitosa");
            con.close();
            
        }catch(Exception ed){
            System.out.println("Error al eliminar");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }  
        
        
        

        
        
        
    public static List<DConsumo>  getAllConsumos(int id){
        List<DConsumo> lista= new ArrayList<DConsumo>();
        try{
            Connection con=Conexion.getConnection();
            String q="select * from DConsumo where id_usuario=?";
            PreparedStatement ps=con.prepareStatement(q);
            ps.setInt(1,id);
            
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                DConsumo e=new DConsumo();
                e.setId_consumo(rs.getInt(1));
                e.setId_usuario(rs.getInt(2));
                e.setId_adiccion(rs.getInt(3));
                e.setFecha_consumo(rs.getString(4));
                e.setCantidad_consumo(rs.getInt(5));
                e.setConsumo_gasto(rs.getInt(6));
                lista.add(e);
            }
            System.out.println("Se encontro a los usuarios");
            con.close();
            
        }catch(Exception ed){
            System.out.println("Error al buscar");
            System.out.println(ed.getMessage());
        }
        return lista;
    }
    /*TERMINA LA LISTA*/     
        
        
        
        
        
        
        
        
        
    
    
    
    
    
    
    
}
