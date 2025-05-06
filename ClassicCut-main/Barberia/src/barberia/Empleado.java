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
public class Empleado extends Usuario{
    static ArrayList<Empleado> empleados = new ArrayList<>();
    public Empleado(String nombre, String contraseña) {
        super(nombre, contraseña);
    }
    Empleado(){}
}
