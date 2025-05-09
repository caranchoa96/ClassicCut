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
public class Cita {
    private static final String ARCHIVO = "citas.txt";
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
    
    public static List<Cita> cargarCita() {
        List<Cita> cursos = new ArrayList<>();
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) return cursos;
            try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO)))
        {
        String linea;
        while ((linea = reader.readLine()) != null) {
            String[] partes = linea.split(";", 6);
            if (partes.length == 6) {
                cursos.add(new Cita(partes[0], partes[1], partes[2], partes[3], partes[4],partes[5]));
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return cursos;
    }
    public static void guardarCita() {       
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO))) {
            for (int r = 0; r<= Cita.listaCitas.size()-1;r++) {
                writer.write(Cita.listaCitas.get(r).hora + ";" +  Cita.listaCitas.get(r).precio + ";" + Cita.listaCitas.get(r).servicio + ";" + Cita.listaCitas.get(r).encargado + ";" + Cita.listaCitas.get(r).cliente + ";" + Cita.listaCitas.get(r).fecha);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
