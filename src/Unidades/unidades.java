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
        tropas.add(new unidad("soldado",0, 0, 0, 0));
        tropas.add(new unidad("soldado",0, 0, 0, 0));
    }
    
    public static void mostrarUnidades(){
        int i =1;
        for(unidad u : tropas){
            System.out.println(i+" "+u.toString());
            i++;
        }
    }   
    
    public static void mostrar (){
        int i;
        for (i=1;i<tropas.size();i++ ){
     
           System.out.println(tropas.get(i).atk);
           System.out.println(tropas.get(i).vida);
            
        }
    }
    
    public static void crearUnidad(){
        System.out.println("¿Que tipo de unidad desea crear? ");
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();
        
        if (in.equalsIgnoreCase("soldado")){
            //System.out.println("hola");
            tropas.add(new unidad("",0,0,0,0));
        }
        else if(in.equalsIgnoreCase("super soldado")){
            tropas.add(new unidad("HAHA SALU2",10,10,10,10));
        }
      
    }
    
    public static void modificarUnidadesPersa(){
        int i;
        for ( i=0;i<tropas.size();i++){
            //System.out.println("modificando valores");
            tropas.set(i,new unidad("soldado",50,50,2,10));
        }
    }
    
   
    public static void modificarUnidadesMaya(){
        int i;
        for ( i=0;i<tropas.size();i++){
            System.out.println("modificando valores");
            tropas.set(i,new unidad("soldado",20,30,2,10));
        }
    }
    
    
    public static void modificarUnidadesTeutones(){
        int i;
        for ( i=0;i<tropas.size();i++){
            System.out.println("modificando valores");
            tropas.set(i,new unidad("soldado",40,30,2,10));
        }
    }
    
    
    
    
    
    

}
