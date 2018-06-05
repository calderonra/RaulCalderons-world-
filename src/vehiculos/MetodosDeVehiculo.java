/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

import java.util.ArrayList;

/**
 *
 * @author Raul Calderon
 */
public class MetodosDeVehiculo {
    public static ArrayList <vehiculo> vehiculos = new ArrayList();
    
    public static void inicarEstructura(){
        vehiculos.add(new vehiculo(" ",0,0,0));
    }
    
    public static void mostrarEstrcutura(){
        int i =1;
        for(vehiculo e : vehiculos){
            System.out.println(i+" "+e.toString());
            i++;
        }
    }
    
    
    
}
