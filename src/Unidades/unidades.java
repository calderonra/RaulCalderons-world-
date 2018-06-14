/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidades;

import Jugador.Jugador;
import java.util.*;
import razas.razas;

/**
 *
 * @author Raul Calderon
 */
public class unidades {

    public static ArrayList<unidad> tropas1 = new ArrayList<>();
    public static ArrayList<unidad> tropas2 = new ArrayList<>();
    

/**
 * Con este metodo mostramos las unidades que posee el jugador, recorriendo el arraylist 
 */
    public static void mostrarUnidades() {
        int i = 1;
        for (unidad u : tropas1) {
            System.out.println(i + " " + u.toString());
            i++;
        }
    }

    public static void mostrar() {
        int i;
        for (i = 1; i < tropas1.size(); i++) {

            System.out.println(tropas1.get(i).atk);
            System.out.println(tropas1.get(i).vida);

        }
    }


    
    public static void crearUnidadPersa(Jugador player) {
        CostoUnidades cs= new CostoUnidades();
        cs.setCostosolados(10);
        int costo=cs.getCostosolados();
        int aux=0;
        int juga=0;
         
                
        aux=player.getMadera();
         
        System.out.println("¿Que tipo de unidad desea crear? ");
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();
        if (in.equalsIgnoreCase("soldado")&&aux>=costo ) {
            aux=player.getMadera()-costo;
            tropas1.add(new unidad("soldado", 50, 50, 2, 10));
            player.setMadera(aux);
        } else if (in.equalsIgnoreCase("super soldado")&& costo==100) {
            tropas1.add(new unidad("ss", 100, 100,2, 100));
        }
        else if(in.equalsIgnoreCase("soldado")&&aux<=costo){
            System.out.println("Recursos insuficientes :0!");
                 
        }
    }
    
    
    public static void CrearUnidadesMaya(Jugador player) {
        
        CostoUnidades cs= new CostoUnidades();
        cs.setCostosolados(10);
        int costo=cs.getCostosolados();
        int aux=0;
        int juga=0;
        aux=player.getMadera();
       System.out.println("¿Que tipo de unidad desea crear? ");
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();

        if (in.equalsIgnoreCase("soldado")&&aux>=costo) {
            tropas1.add(new unidad("soldado", 60, 30, 2, 10));
        } else if (in.equalsIgnoreCase("super soldado")&&aux>=costo) {
            tropas1.add(new unidad("HAHA SALU2", 10, 10, 10, 10));
        }else if(in.equalsIgnoreCase("soldado")&&aux<=costo){
            System.out.println("Recursos insuficientes :0!");
                 
        }
    }

    
    public static void CrearUnidadesTeutones(Jugador player) {
        CostoUnidades cs= new CostoUnidades();
        cs.setCostosolados(10);
        int costo=cs.getCostosolados();
        int aux=0;
        int juga=0;
        aux=player.getMadera();
       System.out.println("¿Que tipo de unidad desea crear? ");
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();

        if (in.equalsIgnoreCase("soldado")&&aux>=costo) {
            
            tropas1.add(new unidad("soldado", 40, 30, 2, 10));
        } else if (in.equalsIgnoreCase("super soldado")&&aux>=costo) {
            tropas1.add(new unidad("HAHA SALU2", 10, 10, 10, 10));
        }else if(in.equalsIgnoreCase("soldado")&&aux<=costo){
            System.out.println("Recursos insuficientes :0!");
                 
        }
    }

  
    public static void mostrarUnidades2() {
        int i = 1;
        for (unidad u : tropas2) {
            System.out.println(i + " " + u.toString());
            i++;
        }
    }

    public static void mostrar2() {
        int i;
        for (i = 1; i < tropas2.size(); i++) {

            System.out.println(tropas2.get(i).atk);
            System.out.println(tropas2.get(i).vida);

        }
    }

    
    public static void crearUnidadMaya2(Jugador player) {
        CostoUnidades cs= new CostoUnidades();
        cs.setCostosolados(10);
        int costo=cs.getCostosolados();
        int aux=0;
        int juga=0;
        aux=player.getMadera();
        System.out.println("¿Que tipo de unidad desea crear? ");
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();
        if (in.equalsIgnoreCase("soldado")&&aux>=costo) {
            //System.out.println("hola");
            tropas2.add(new unidad("soldado", 60, 30, 2, 10));
        } else if (in.equalsIgnoreCase("super soldado")&&aux>=costo) {
            tropas2.add(new unidad("HAHA SALU2", 10, 10, 10, 10));
        }else if(in.equalsIgnoreCase("soldado")&&aux<=costo){
            System.out.println("Recursos insuficientes :0!");
                 
        }

    }

    public static void crearUnidadTeuton2(Jugador player) {
        CostoUnidades cs= new CostoUnidades();
        cs.setCostosolados(10);
        int costo=cs.getCostosolados();
        int aux=0;
        int juga=0;
        aux=player.getMadera();
        System.out.println("¿Que tipo de unidad desea crear? ");
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();
        if (in.equalsIgnoreCase("soldado")&&aux>=costo) {            
            tropas2.add(new unidad("soldado", 40, 30, 2, 10));
        } else if (in.equalsIgnoreCase("super soldado")&&aux>=costo) {
            tropas2.add(new unidad("HAHA SALU2", 10, 10, 10, 10));
        }else if(in.equalsIgnoreCase("soldado")&&aux<=costo){
            System.out.println("Recursos insuficientes :0!");
                 
        }

    }

    public static void crearUnidadPersa2(Jugador player) {
        CostoUnidades cs= new CostoUnidades();
        cs.setCostosolados(10);
        int costo=cs.getCostosolados();
        int aux=0;
        int juga=0;
        aux=player.getMadera();
        System.out.println("¿Que tipo de unidad desea crear? ");
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();
        if (in.equalsIgnoreCase("soldado")&&aux>=costo) {
            tropas2.add(new unidad("soldado", 40, 30, 2, 10));
        } else if (in.equalsIgnoreCase("super soldado")&&aux>=costo) {
            tropas2.add(new unidad("HAHA SALU2", 10, 10, 10, 10));
        }else if(in.equalsIgnoreCase("soldado")&&aux<=costo){
            System.out.println("Recursos insuficientes :0!");
                 
        }

    }
    
    public static void ataque1(){
       int vidafinal=0;
        
       int aux=tropas1.get(0).getVida();
       int atk1=tropas1.get(0).getAtk();
       int aux2=tropas2.get(0).getVida();
        System.out.println("Tus puntos de ataque: "+atk1);
       System.out.println("vida del enemigo: "+aux2);
       
       vidafinal=aux2-atk1;
        System.out.println("La vida que va a quedar el enemigo es de:"+vidafinal);
       if (vidafinal<=0){
           tropas2.remove(0);
       }
       else if (vidafinal>0){
           tropas2.get(0).setVida(vidafinal);
           System.out.println("atacando al soldado");
       }
        
    }
     public static void ataque2(){
       int vidafinal=0;
        
       int aux=tropas2.get(0).getVida();
       int atk1=tropas2.get(0).getAtk();
       int aux2=tropas1.get(0).getVida();
        System.out.println("Tus puntos de ataque: "+atk1);
       System.out.println("vida del enemigo: "+aux2);
       
       vidafinal=aux2-atk1;
        System.out.println("La vida que va a quedar el enemigo es de:"+vidafinal);
       if (vidafinal<=0){
           tropas1.remove(0);
       }
       else if (vidafinal>0){
           tropas2.get(0).setVida(vidafinal);
           System.out.println("atacando al soldado");
       }
     }
}
