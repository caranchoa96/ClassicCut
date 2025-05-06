/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barberia;

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
    Cita(String hora, String precio, String servicio, String encargado, String cliente){
        this.hora = hora;
        this.precio = precio;
        this.servicio = servicio;
        this.encargado = encargado;
        this.cliente = cliente;
    }
}
