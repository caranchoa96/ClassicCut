/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barberia;

import java.util.ArrayList;

/**
 *
 * @author E304
 */
public class Cita {
    String hora;
    String precio;
    String servicio;
    String encargado;
    String cliente;
    String fecha;

    public String getHora() {
        return hora;
    }

    public String getPrecio() {
        return precio;
    }

    public String getServicio() {
        return servicio;
    }

    public String getEncargado() {
        return encargado;
    }

    public String getCliente() {
        return cliente;
    }

    public String getFecha() {
        return fecha;
    }
    
    static ArrayList<Cita> listaCitas = new ArrayList<>(); 
    Cita(String hora, String precio, String servicio, String encargado, String cliente, String fecha){
        this.hora = hora;
        this.precio = precio;
        this.servicio = servicio;
        this.encargado = encargado;
        this.cliente = cliente;
        this.fecha = fecha;
    }
}
