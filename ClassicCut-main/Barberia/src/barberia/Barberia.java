/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package barberia;
//JOPTION PARA CUANDO TERMINAS EL REGISTRO Y INICIO DE SESION
//JOPTION PANE PARA DESPUES DE LO ULTIMO DE USUARIO Y PARA ESPECIALIDAD DE EMPLEADO DESPUES DE INICIAR SESION
/**
 *
 * @author Usuario
 */
public class Barberia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        MenuPrincipal a = new MenuPrincipal();
        RegistroInicio e = new RegistroInicio();
        a.cambioPanel(e);
        a.setVisible(true);
    }
    
}
