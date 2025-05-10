/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barberia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author E304
 */
public class Empleado{
    
    private static final String ARCHIVO3 = "empleado.txt";
    static ArrayList<Empleado> empleados = new ArrayList<>();
    String nombre;
    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    Empleado(){}
    
    public static List<Empleado> cargarEmpleado() {
        List<Empleado> empleadose = new ArrayList<>();
        File archivo = new File(ARCHIVO3);
        if (!archivo.exists()) return empleadose;
            try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO3)))
        {
        String linea;
        while ((linea = reader.readLine()) != null) {
                empleadose.add(new Empleado(linea));
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return empleadose;
    }
    public static void guardarEmpleado() {       
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO3))) {
            for (int r = 0; r<= Empleado.empleados.size()-1;r++) {
                writer.write(Empleado.empleados.get(r).nombre);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
