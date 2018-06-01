/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidades;

import java.util.*;

/**
 *
 * @author Raul Calderon
 */
public class unidades {

    public static ArrayList<unidad> tropas = new ArrayList<>();

    public static void iniciarUnidades() {
        tropas.add(new unidad(0, 0, 0, 0));
        tropas.add(new unidad(0, 0, 0, 0));
    }
    
    public static void mostrarUnidades(){
        int i =1;
        for(unidad u : tropas){
            System.out.println(i+" "+u);
            i++;
        }
    }
    
    public static void crearUnidad(){
        System.out.println("¿Que tipo de unidad desea crear? ");
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        if (s=="soldado"){
            tropas.add(new unidad(0,0,0,0));
        }
        else if(s=="super soldado"){
            tropas.add(new unidad(10,10,10,10));
        }
      
    }

}
