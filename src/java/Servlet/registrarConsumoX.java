/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Control.AccionesConsumo;
import Modelo.DConsumo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author bailarina77
 */
public class registrarConsumoX extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            int id_usuario, id_adiccion, gasto_consumo, cantidad_consumo;
            String fecha_consumo;
            
            id_usuario=Integer.parseInt(request.getParameter("id_usuario"));
            id_adiccion=Integer.parseInt(request.getParameter("id_adiccion"));
            
            

            
            Calendar fecha = Calendar.getInstance();
            int año = fecha.get(Calendar.YEAR);
            int mes = fecha.get(Calendar.MONTH) + 1;
            int dia = fecha.get(Calendar.DAY_OF_MONTH);
            

            fecha_consumo=año+"/"+mes+"/"+dia ;     
            System.out.println(fecha_consumo);
            
          
            
            gasto_consumo=Integer.parseInt(request.getParameter("gasto"));
            cantidad_consumo=Integer.parseInt(request.getParameter("consumo"));
            
            

            DConsumo e=new DConsumo();
            e.setId_usuario(id_usuario);
            e.setId_adiccion(id_adiccion);
            e.setFecha_consumo(fecha_consumo);
            e.setConsumo_gasto(gasto_consumo);
            e.setCantidad_consumo(cantidad_consumo);


            
            
            int estatus=AccionesConsumo.registrarConsumo(e);
            
             if(estatus>0){
                 if (id_adiccion==1){
                     response.sendRedirect("JSP/tabaco/consumoC.jsp");
                 }
                
            }
            else{
                response.sendRedirect("JSP/error.jsp");
            }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
