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
public class Cliente extends Usuario{
    
    static ArrayList<Cliente> clientes = new ArrayList<>();

    public Cliente(String nombre, String contraseña) {
        super(nombre, contraseña);
    }
    Cliente(){}
    
    
    
}
