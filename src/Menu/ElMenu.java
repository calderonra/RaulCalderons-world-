/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.util.Scanner;

/**
 *
 * @author Raul Calderon <https://github.com/calderonra>
 */
public class ElMenu {

    public void opciones() {
        System.out.println("---- Menu de jugador ----");
        System.out.println("1. Crear minas");
        System.out.println("2. Crear soldados");
        System.out.println("3. Atacar unidades enemigas");
        System.out.println("4. Aplicar mejoras");
        System.out.println("5. Crear vehiculos ");
        System.out.println("6. Crear vehiculos ");
        System.out.println("7. Finalizar turno");
        System.out.print(": ");
    }

    public void menu() {

        Scanner leer = new Scanner(System.in);
        int opcion = 8;
        int opcion2 = 8;
        while (opcion != 7) {
            opciones();
            try {
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        //
                        break;
                    case 2:
                        //
                        break;
                    case 3:
                        //
                        break;
                    case 4:
                        //
                        break;
                    case 5:
                        //
                        break;
                    case 6:
                        //
                        break;
                    case 7:
                        //
                        break;
                    default:
                        System.err.println("    Por favor ingrese una opción valida");
                }

            } catch (Exception e) {
                System.err.println("ingrese numero por favor!");
                leer.nextLine();
            }
        }

    }

}
