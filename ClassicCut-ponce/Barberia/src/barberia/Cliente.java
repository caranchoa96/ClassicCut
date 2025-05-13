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
public class Cliente{
    private static final String ARCHIVO2 = "clientes.txt";
    static ArrayList<Cliente> clientes = new ArrayList<>();
    String nombre;
    String contraseña;
    public Cliente(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }
    Cliente(){}
    
    public static List<Cliente> cargarCliente() {
        List<Cliente> clientesa = new ArrayList<>();
        File archivo = new File(ARCHIVO2);
        if (!archivo.exists()) return clientesa;
            try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO2)))
        {
        String linea;
        while ((linea = reader.readLine()) != null) {
            String[] partes = linea.split(";", 2);
            if (partes.length == 2) {
                clientesa.add(new Cliente(partes[0], partes[1]));
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return clientesa;
    }
    public static void guardarCliente() {       
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO2))) {
            for (int r = 0; r<= Cliente.clientes.size()-1;r++) {
                writer.write(Cliente.clientes.get(r).nombre + ";" +  Cliente.clientes.get(r).contraseña);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
}
