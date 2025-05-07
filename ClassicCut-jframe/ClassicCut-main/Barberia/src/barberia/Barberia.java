/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package barberia;
//JOPTION PARA CUANDO TERMINAS EL REGISTRO Y INICIO DE SESION
//JOPTION PANE PARA DESPUES DE LO ULTIMO DE USUARIO Y PARA ESPECIALIDAD DE EMPLEADO DESPUES DE INICIAR SESION

import javax.swing.JFrame;


/**
 *
 * @author Usuario
 */
public class Barberia {
    static String SesionActual;
    static String ClienteActual;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        Bienvenidoa1 i = new Bienvenidoa1();
        i.setVisible(true);
    }
    
    static void cerrarSesion(JFrame a){
        RegistroInicio1 i = new RegistroInicio1();
        a.dispose();
        i.setVisible(true);
    }
}
