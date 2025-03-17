/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class prueba {
    String nombre;
    String fecha;
    String hora;
    String servicio;
    static int id;
    prueba(String e, String u, String i, String h, int id){
        this.nombre=e;
        this.fecha=u;
        this.hora=i;
        this.servicio=h;
        this.id=id;
    }
    public static void main(String[] args) {
        id=-1;
        ArrayList<prueba> listaCitas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean o=true;
        String e;
        String u;
        String i;
        String h;
        while(o){
            System.out.println("Inserte en la lista\n");
                System.out.println("Nombre:");
                e = scanner.next();
                System.out.println("Fecha:");
                u = scanner.next();
                System.out.println("Hora:");
                i = scanner.next();
                System.out.println("Servicio:");
                h = scanner.next();
                id=id+1;
                prueba a = new prueba(e,u,i,h,id);
                listaCitas.add(a);
            System.out.println("Ya?");
            if(scanner.next().equals("si")){o=false;}
        }
        System.out.println("Busqueda de cita\n");
        
                System.out.println("Nombre:");
                e = scanner.next();
                System.out.println("Fecha:");
                u = scanner.next();
                System.out.println("Hora:");
                i = scanner.next();
                System.out.println("Servicio:");
                h = scanner.next();
                
        for (Iterator<prueba> it = listaCitas.iterator(); it.hasNext();) {
            for(int c = 0; c <= listaCitas.size(); c++){
            prueba a = new prueba("","","","",0);
            a = it.next();
            if(a.nombre.equals(e)){
                System.out.println("Lo encontraste");
                break;
            }
            }
        }
    }
}
