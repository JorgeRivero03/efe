<%-- 
    Document   : informesT
    Created on : 16-jun-2021, 19:58:55
    Author     : bailarina77
--%>

<%@page import="java.util.List"%>
<%@page import="Control.AccionesConsumo"%>
<%@page import="Modelo.DConsumo"%>
<%@page import="Control.Conexion"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="Modelo.MAdiccion_Usuario"%>
<%@page import="Modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<% 
            

 int total_gasto, total_consumo;
 String usuario=(String)session.getAttribute("Usuario");
 Usuario u=new Usuario();
 Connection con=Conexion.getConnection();
total_consumo=0;
total_gasto=0;
try{
    
    String q="select * from MUsuario where usuario =?";
    PreparedStatement ps=con.prepareStatement(q);
    ps.setString(1,usuario);
    ResultSet rs = ps.executeQuery();
    while(rs.next()){
        u.setId(rs.getInt("id_Usuario"));
    }
 
    
}catch(Exception ed){
    System.out.println(ed.getMessage());
}
 
 List<DConsumo> lista=AccionesConsumo.getAllConsumos(u.getId());
 for(DConsumo e: lista){
     total_consumo=total_consumo+e.getCantidad_consumo();
     total_gasto=total_gasto+e.getConsumo_gasto();
     System.out.println(total_gasto);
     System.out.println(total_consumo);
    
 }
                          %>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" session="true">
        <title>Estado General</title>
    </head>
    <body onload="cambiarIMG()" >
        <div id="contenedor_consumo">
        <h2>Haz Consumido:</h2>
        <h1 id="consumo"><%=total_consumo%></h1>
        <p>cigarros en los ultimos 30 dias</p>
        </div>
        <img name="slider" width="500" height="500">
        <img name="slider2" width="500" height="500">
        <img name="slider3" width="500" height="500">
        
        <script>

            var imagenes=[];
            imagenes[0]="https://as1.ftcdn.net/v2/jpg/02/74/98/28/1000_F_274982894_idFlIBmFqKVQFs3hiSOQJkg0DmSYZHa8.jpg";
            imagenes[1]="https://as2.ftcdn.net/v2/jpg/02/71/67/61/1000_F_271676127_nDUs6p5EagMazi4rQvOecQsDPVJU9kbm.jpg";
            imagenes[2]="https://image.shutterstock.com/image-vector/illustration-cute-red-heart-mascot-600w-1756132490.jpg";
            imagenes[3]="https://t4.ftcdn.net/jpg/03/03/56/45/240_F_303564588_Lqoh2ajTQ83lZy42X6tEBh50EFed6nPH.jpg";
            imagenes[4]="https://as1.ftcdn.net/v2/jpg/02/71/85/62/1000_F_271856298_0kIxtvFOBs942qfCTYapXKValTu5W4ON.jpg";
            imagenes[5]="https://t3.ftcdn.net/jpg/02/73/91/02/240_F_273910262_7H6zOddNklSwb0ccwfHojnf6LMjWT7rQ.jpg";
            imagenes[6]="https://as1.ftcdn.net/v2/jpg/03/16/93/66/1000_F_316936634_jp0BjOJwB2YpMlnMFgJVvJj53UfuRoY0.jpg";
            imagenes[7]="https://i.ytimg.com/vi/PYfsP5NstvY/hqdefault.jpg";
            
            var imagenesH=[];
            imagenesH[0]="../../img/pulmon2.png";
            imagenesH[1]="../../img/pulmon3.png";
            imagenesH[2]="../../img/pulmon4.png";
            imagenesH[3]="../../img/pulmon5.png";
            imagenesH[4]="../../img/pulmon6.png";

            
            
            
            function cambiarIMG(){
                var consumo;
                consumo=document.getElementById("consumo").innerHTML;
               
                
                if(consumo<150){
                    document.slider.src=imagenes[0];
                    document.slider2.src=imagenesH[0];
                    document.slider3.src=imagenesH[0];
                }

                if(consumo>151 && consumo<300){
                    document.slider.src=imagenes[1];
                    document.slider2.src=imagenesH[1];
                    document.slider3.src=imagenesH[0];
                }
                
                
                if(consumo>300 && consumo<500){
                    document.slider.src=imagenes[2];
                    document.slider2.src=imagenesH[2];
                    document.slider3.src=imagenesH[0];
                }
                
                if(consumo>500 && consumo<700){
                    document.slider.src=imagenes[3];
                    document.slider2.src=imagenesH[3];
                    document.slider3.src=imagenesH[0];
                }
                
                if(consumo>700 && consumo<900){
                    document.slider.src=imagenes[4];
                    document.slider2.src=imagenesH[4];
                    document.slider3.src=imagenesH[0];
                }
                
                if(consumo>900 && consumo<1000){
                    document.slider.src=imagenes[5];
                    document.slider2.src=imagenesH[4];
                    document.slider3.src=imagenesH[0];
                }
                
                if(consumo>1000 && consumo<1500){
                    document.slider.src=imagenes[6];
                    document.slider2.src=imagenesH[4];
                    document.slider3.src=imagenesH[0];
                }
                
                if(consumo>1500 && consumo<2000){
                    document.slider.src=imagenes[1];
                    document.slider2.src=imagenesH[4];
                    document.slider3.src=imagenesH[0];
                }
              
            }
       
            
        </script>
        
        
        
         <h2>Tienes de gasto</h2> 
         <p id="gasto" name="gasto"><%=total_gasto%></p>
        
        
        
    </body>
</html>
