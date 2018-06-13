/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Jugador.Jugador;
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

    public void menu(Jugador player) {

        Scanner leer = new Scanner(System.in);
        int opcion = 8;
        int opcion2 = 8;
        String aux = player.getRaza();
        int saltin =player.getClasedejugador();
        
        if (aux == "Teutones" && saltin==1) {

            while (opcion != 7) {
                opciones();
                try {
                    opcion = leer.nextInt();
                    switch (opcion) {
                        case 1:
                            //
                            break;
                        case 2:
                            Unidades.unidades.crearUnidad();
                            Unidades.unidades.modificarUnidadesTeutones();
                            Unidades.unidades.mostrarUnidades();
                            
                            break;
                        case 3:
                            //
                            Unidades.unidades.ataque();
                            
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
        else if(aux == "Mayas" && saltin==1){
             while (opcion != 7) {
                opciones();
                try {
                    opcion = leer.nextInt();
                    switch (opcion) {
                        case 1:
                            //
                            break;
                        case 2:
                            Unidades.unidades.crearUnidad();
                            Unidades.unidades.modificarUnidadesMaya();
                            Unidades.unidades.mostrarUnidades();
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
        else if(aux == "Persas" && saltin==1){
             while (opcion != 7) {
                opciones();
                try {
                    opcion = leer.nextInt();
                    switch (opcion) {
                        case 1:
                            //
                            break;
                        case 2:
                            Unidades.unidades.crearUnidad();
                            Unidades.unidades.modificarUnidadesPersa();
                            Unidades.unidades.mostrarUnidades();
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
        else if(aux == "Teutones" && saltin==2){
             while (opcion != 7) {
                opciones();
                try {
                    opcion = leer.nextInt();
                    switch (opcion) {
                        case 1:
                            //
                            break;
                        case 2:
                            Unidades.unidades.crearUnidad2();
                            Unidades.unidades.modificarUnidadesTeutones2();
                            Unidades.unidades.mostrarUnidades2();
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
        else if (aux == "Mayas" && saltin==2){
             while (opcion != 7) {
                opciones();
                try {
                    opcion = leer.nextInt();
                    switch (opcion) {
                        case 1:
                            //
                            break;
                        case 2:
                            Unidades.unidades.crearUnidad2();
                            Unidades.unidades.modificarUnidadesMaya2();
                            Unidades.unidades.mostrarUnidades2();
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
        else if (aux == "Persas" && saltin==2){
             while (opcion != 7) {
                opciones();
                try {
                    opcion = leer.nextInt();
                    switch (opcion) {
                        case 1:
                            //
                            break;
                        case 2:
                            Unidades.unidades.crearUnidad2();
                            Unidades.unidades.modificarUnidadesPersa2();
                            Unidades.unidades.mostrarUnidades2();
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

}
