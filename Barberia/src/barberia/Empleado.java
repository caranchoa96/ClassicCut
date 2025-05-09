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
public class Empleado{
    static ArrayList<Empleado> empleados = new ArrayList<>();
    String nombre;
    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    Empleado(){}
}
