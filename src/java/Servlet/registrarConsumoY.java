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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author bailarina77
 */
public class registrarConsumoY extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet registrarConsumoY</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet registrarConsumoY at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
         int id_usuario, id_adiccion, gasto_consumo, cantidad_consumo, consumo_final, unidad;
            String fecha_consumo;
            
            id_usuario=Integer.parseInt(request.getParameter("id_usuario"));
            id_adiccion=Integer.parseInt(request.getParameter("id_adiccion"));
            
            

            
            Calendar fecha = Calendar.getInstance();
            int año = fecha.get(Calendar.YEAR);
            int mes = fecha.get(Calendar.MONTH) + 1;
            int dia = fecha.get(Calendar.DAY_OF_MONTH);
            fecha_consumo=año+"/"+mes+"/"+dia ;     
            System.out.println(fecha_consumo);
            
            consumo_final=0;
            
            gasto_consumo=Integer.parseInt(request.getParameter("gasto"));
            cantidad_consumo=Integer.parseInt(request.getParameter("consumo"));
            unidad=Integer.parseInt(request.getParameter("slct2"));
            
            System.out.println("hola unidad "+unidad);
            
            
            if(unidad==1){
                consumo_final= cantidad_consumo*45;
            }
            
            
            if(unidad==2){
                consumo_final= cantidad_consumo*210;
            }
            
            if(unidad==3){
                consumo_final= cantidad_consumo*375;
            }
            
            if(unidad==4){
                consumo_final= cantidad_consumo*750;
            }
            
            if(unidad==5){
                consumo_final= cantidad_consumo*940;
            }
            
            if(unidad==6){
                consumo_final=cantidad_consumo;
            }

            DConsumo e=new DConsumo();
            e.setId_usuario(id_usuario);
            e.setId_adiccion(id_adiccion);
            e.setFecha_consumo(fecha_consumo);
            e.setConsumo_gasto(gasto_consumo);
            e.setCantidad_consumo(consumo_final);


            
            
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

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
