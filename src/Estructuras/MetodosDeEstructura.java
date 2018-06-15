/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Jugador.Jugador;
import Unidades.CostoUnidades;
import java.util.*;

/**
 *
 * @author Raul Calderon
 */
public class MetodosDeEstructura {

    public static ArrayList<estructura> edificios = new ArrayList();
    public static ArrayList<estructura> edificios2 = new ArrayList();

    public static void inicarEstructura() {
        edificios.add(new estructura("Centro de mando", 0, 0, 0, 0));
    }
/**
 * re recorre el array de los vehiculos para mopstrar todos sus elementos 
 */
    public static void mostrarEstrcutura() {
        int i = 1;
        for (estructura e : edificios) {
            System.out.println(i + " " + e.toString());
            i++;
        }
    }
/**
 * Creamos las estructuras que a la vez vamos a restar los atributos del jugador dependiendo de los materiales necesarios para hacerla 
 * @param player 
 */
    public static void agregarEstructura(Jugador player) {
        CostoUnidades cs = new CostoUnidades();
        cs.setCostoestructura(200);
        int costo = cs.getCostoestructura();
        int aux = 0;
        int juga = 0;
        aux = player.getPiedra();

        System.out.println("¿Que tipo de unidad desea crear? ");
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();

        if (in.equalsIgnoreCase("Mina de piedra") && aux >= costo) {
            System.out.println("Creando estructura");
            edificios.add(new estructura("Mina de piedra", 200, 2, 100, 50));
        } else if (in.equalsIgnoreCase("Mina de oro") && aux >= costo) {
            System.out.println("Creando estructura");
            edificios.add(new estructura("Mina de oro", 200, 2, 100, 50));
        } else if (in.equalsIgnoreCase("Mina de madera") && aux >= costo) {
            System.out.println("Creando estructura");
            edificios.add(new estructura("Mina de madera", 200, 2, 100, 50));
        } else if (aux <= costo) {
            System.out.println("Recursos insuficientes :0!");
        }
    }
/**
 * con esto asiganmaosel valordela vida a otro kugador
 * @param jugador 
 */
    public static void seteos(Jugador jugador) {
        CostoUnidades cs = new CostoUnidades();
        cs.setCostoestructura(100);
        int costo = cs.getCostoestructura();
        int i = 0;
        String aux;
        int aux2;
        int saltin;
        for (i = 1; i < edificios.size(); i++) {
            aux = edificios.get(i).getNombre();
            if (aux.equalsIgnoreCase("Mina de oro")) {
                aux2 = edificios.get(i).getRecursosAdar();
                System.out.println(aux2);
                System.out.println(jugador.getOro());
                saltin = jugador.getOro() + aux2;
                jugador.setOro(saltin);
                System.out.println("Recursos aumentados en " + saltin);
                System.out.println(jugador.oro);

            } else if (aux.equalsIgnoreCase("Mina de piedra")) {
                aux2 = edificios.get(i).getRecursosAdar();
                saltin = jugador.getPiedra();
                jugador.setPiedra(saltin);
                System.out.println("Recursos aumentados" + saltin);
            } else if (aux.equalsIgnoreCase("Mina de madera")) {
                aux2 = edificios.get(i).getRecursosAdar();
                saltin = jugador.getMadera();
                jugador.setMadera(saltin);
                System.out.println("Recursos aumentados" + saltin);
            }
        }
    }

    
    public static void agregarEstructura2(Jugador player) {
        CostoUnidades cs = new CostoUnidades();
        cs.setCostoestructura(200);
        int costo = cs.getCostoestructura();
        int aux = 0;
        int juga = 0;
        aux = player.getPiedra();
        System.out.println("¿Que tipo de unidad desea crear? ");
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();

        if (in.equalsIgnoreCase("Mina de piedra") && aux >= costo) {
            System.out.println("Creando estructura");
            edificios2.add(new estructura("Mina de piedra", 200, 2, 100, 50));
        } else if (in.equalsIgnoreCase("Mina de oro") && aux >= costo) {
            System.out.println("Creando estructura");
            edificios2.add(new estructura("Mina de oro", 200, 2, 100, 50));
        } else if (in.equalsIgnoreCase("Mina de madera") && aux >= costo) {
            System.out.println("Creando estructura");
            edificios2.add(new estructura("Mina de madera", 200, 2, 100, 50));
        } else if (aux <= costo) {
            System.out.println("Recursos insuficientes :0!");
        }
    }
    public static void seteos2(Jugador jugador) {
        CostoUnidades cs = new CostoUnidades();
        cs.setCostoestructura(100);
        int costo = cs.getCostoestructura();
        int i = 0;
        String aux;
        int aux2;
        int saltin;
        for (i = 1; i < edificios2.size(); i++) {
            aux = edificios2.get(i).getNombre();
            if (aux.equalsIgnoreCase("Mina de oro")) {
                aux2 = edificios2.get(i).getRecursosAdar();
                System.out.println(aux2);
                System.out.println(jugador.getOro());
                saltin = jugador.getOro() + aux2;
                jugador.setOro(saltin);
                System.out.println("Recursos aumentados en " + saltin);
                System.out.println(jugador.oro);

            } else if (aux.equalsIgnoreCase("Mina de piedra")) {
                aux2 = edificios2.get(i).getRecursosAdar();
                saltin = jugador.getPiedra();
                jugador.setPiedra(saltin);
                System.out.println("Recursos aumentados" + saltin);
            } else if (aux.equalsIgnoreCase("Mina de madera")) {
                aux2 = edificios2.get(i).getRecursosAdar();
                saltin = jugador.getMadera();
                jugador.setMadera(saltin);
                System.out.println("Recursos aumentados" + saltin);
            }
        }
    }
}
