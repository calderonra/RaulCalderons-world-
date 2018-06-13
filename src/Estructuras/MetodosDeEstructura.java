/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;
import Jugador.Jugador;
import java.util.*;
/**
 *
 * @author Raul Calderon
 */
public class MetodosDeEstructura {
    public static ArrayList <estructura> edificios = new ArrayList();
    
    public static void inicarEstructura(){
        edificios.add(new estructura("Centro de mando",0,0,0,0));
    }
    
    public static void mostrarEstrcutura(){
        int i =1;
        for(estructura e : edificios){
            System.out.println(i+" "+e.toString());
            i++;
        }
    }
    
    public static void agregarEstructura(){
        System.out.println("¿Que tipo de unidad desea crear? ");
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();
        
        if (in.equalsIgnoreCase("Mina de piedra")){
            System.out.println("Creando estructura");
            edificios.add(new estructura("Mina de piedra",200,2,100,50));
        }
        else if (in.equalsIgnoreCase("Mina de oro")){
            System.out.println("Creando estructura");
            edificios.add(new estructura("Mina de oro",200,2,100,50));
        }
        else if (in.equalsIgnoreCase("Mina de madera")){
            System.out.println("Creando estructura");
            edificios.add(new estructura("Mina de madera",200,2,100,50));
        }
    }
    public static void  seteos(Jugador jugador){
        int i=0;
        String aux;
        int aux2;
        int saltin;
        for(i=1;i<edificios.size();i++){
           aux=edificios.get(i).getNombre();
           if(aux.equals("Mina de oro")){
               aux2=edificios.get(i).getRecursosAdar();
               System.out.println(aux2);
               System.out.println(jugador.getOro());
               saltin=jugador.getOro()+aux2;
               jugador.setOro(saltin);
               System.out.println("Recursos aumentados en "+saltin);
               System.out.println(jugador.oro);
               
               
           }
           else if(aux.equals("Mina de piedra")){
               aux2=edificios.get(i).getRecursosAdar();
               saltin=jugador.getPiedra();
               jugador.setPiedra(saltin);
               System.out.println("Recursos aumentados");
           }
           else if (aux.equals("Mina de madera")){
               aux2=edificios.get(i).getRecursosAdar();
               saltin=jugador.getMadera();
               jugador.setMadera(saltin);
               System.out.println("Recursos aumentados");
           }
        }
    }
    
}
