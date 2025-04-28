/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barberia;

/**
 *
 * @author E304
 */

public abstract class Usuario {
    protected String nombre;
    protected String contraseña;
    public Usuario(String nombre, String contraseña){
        this.nombre = nombre;
        this.contraseña = contraseña;
    }
    public Usuario(String nombre){
        this.nombre = nombre;
    }
    Usuario(){}
}
    
