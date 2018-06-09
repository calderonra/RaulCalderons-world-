/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidades;

import java.util.*;
import razas.razas;

/**
 *
 * @author Raul Calderon
 */
public class unidades {

    public static ArrayList<unidad> tropas1 = new ArrayList<>();
    public static ArrayList<unidad> tropas2 = new ArrayList<>();

    public static void iniciarUnidades(razas raza) {
        tropas1.add(new unidad("soldado", 0, 0, 0, 0));
        tropas1.add(new unidad("soldado", 0, 0, 0, 0));
    }

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

    public static void crearUnidad() {
        System.out.println("¿Que tipo de unidad desea crear? ");
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();

        if (in.equalsIgnoreCase("soldado")) {
            //System.out.println("hola");
            tropas1.add(new unidad("", 0, 0, 0, 0));
        } else if (in.equalsIgnoreCase("super soldado")) {
            tropas1.add(new unidad("HAHA SALU2", 10, 10, 10, 10));
        }

    }

    public static void modificarUnidadesPersa() {
        int i;
        for (i = 0; i < tropas1.size(); i++) {
            //System.out.println("modificando valores");
            tropas1.set(i, new unidad("soldado", 50, 50, 2, 10));
        }
    }

    public static void modificarUnidadesMaya() {
        int i;
        for (i = 0; i < tropas1.size(); i++) {
            System.out.println("modificando valores");
            tropas1.set(i, new unidad("soldado", 20, 30, 2, 10));
        }
    }

    public static void modificarUnidadesTeutones() {
        int i;
        for (i = 0; i < tropas1.size(); i++) {
            System.out.println("modificando valores");
            tropas1.set(i, new unidad("soldado", 40, 30, 2, 10));
        }
    }

    public static void iniciarUnidades2() {
        tropas2.add(new unidad("soldado", 0, 0, 0, 0));
        tropas2.add(new unidad("soldado", 0, 0, 0, 0));
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

    public static void crearUnidad2() {
        System.out.println("¿Que tipo de unidad desea crear? ");
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();

        if (in.equalsIgnoreCase("soldado")) {
            //System.out.println("hola");
            tropas2.add(new unidad("", 0, 0, 0, 0));
        } else if (in.equalsIgnoreCase("super soldado")) {
            tropas2.add(new unidad("HAHA SALU2", 10, 10, 10, 10));
        }

    }

    public static void modificarUnidadesPersa2() {
        int i;
        for (i = 0; i < tropas2.size(); i++) {
            //System.out.println("modificando valores");
            tropas2.set(i, new unidad("soldado", 50, 50, 2, 10));
        }
    }

    public static void modificarUnidadesMaya2() {
        int i;
        for (i = 0; i < tropas2.size(); i++) {
            System.out.println("modificando valores");
            tropas2.set(i, new unidad("soldado", 20, 30, 2, 10));
        }
    }

    public static void modificarUnidadesTeutones2() {
        int i;
        for (i = 0; i < tropas2.size(); i++) {
            System.out.println("modificando valores");
            tropas2.set(i, new unidad("soldado", 40, 30, 2, 10));
        }
    }

}
