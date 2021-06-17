/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author bailarina77
 */
public class DConsumo {
    int id_consumo,id_usuario, id_adiccion,cantidad_consumo,Consumo_gasto;
    String fecha_consumo;

    public int getId_consumo() {
        return id_consumo;
    }

    public void setId_consumo(int id_consumo) {
        this.id_consumo = id_consumo;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_adiccion() {
        return id_adiccion;
    }

    public void setId_adiccion(int id_adiccion) {
        this.id_adiccion = id_adiccion;
    }

    public int getCantidad_consumo() {
        return cantidad_consumo;
    }

    public void setCantidad_consumo(int cantidad_consumo) {
        this.cantidad_consumo = cantidad_consumo;
    }

    public int getConsumo_gasto() {
        return Consumo_gasto;
    }

    public void setConsumo_gasto(int Consumo_gasto) {
        this.Consumo_gasto = Consumo_gasto;
    }

    public String getFecha_consumo() {
        return fecha_consumo;
    }

    public void setFecha_consumo(String fecha_consumo) {
        this.fecha_consumo = fecha_consumo;
    }
    
    
    
    
}
