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
        System.out.println("7. Mostrar tus soldados ");
        System.out.println("8. Finalizar turno");
        System.out.print(": ");
    }

    public void menu(Jugador player) {

        Scanner leer = new Scanner(System.in);
        int opcion = 9;
        int opcion2 = 9;
        String aux = player.getRaza();
        int saltin = player.getClasedejugador();
        System.out.println(player.toString());
        System.out.println(aux);
        if (aux.equalsIgnoreCase("Teutones") && saltin == 1) {

            while (opcion != 8) {
                opciones();
                try {
                    opcion = leer.nextInt();
                    switch (opcion) {
                        case 1:
                            Estructuras.MetodosDeEstructura.agregarEstructura(player);
                            Estructuras.MetodosDeEstructura.seteos(player);

                            break;
                        case 2:
                            Unidades.unidades.CrearUnidadesTeutones(player);

                            Unidades.unidades.mostrarUnidades();
                            break;
                        case 3:
                            //
                            Unidades.unidades.ataque1();

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
                            Unidades.unidades.mostrar();
                            break;
                        case 8:
                            System.out.println("Saliendo del menu");
                            break;
                        default:
                            System.err.println("    Por favor ingrese una opción valida");
                    }

                } catch (Exception e) {
                    System.err.println("ingrese numero por favor!");
                    leer.nextLine();
                }
            }
        } else if (aux.equalsIgnoreCase("Mayas") && saltin == 1) {
            while (opcion != 8) {
                opciones();
                try {
                    opcion = leer.nextInt();
                    switch (opcion) {
                        case 1:

                            Estructuras.MetodosDeEstructura.agregarEstructura(player);
                            Estructuras.MetodosDeEstructura.seteos(player);
                            break;
                        case 2:

                            Unidades.unidades.CrearUnidadesMaya(player);
                            break;
                        case 3:
                            Unidades.unidades.ataque1();
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
                            Unidades.unidades.mostrarUnidades();
                            break;
                        case 8:
                            System.out.println("Saliendo del menu");
                            break;
                        default:
                            System.err.println("    Por favor ingrese una opción valida");
                    }

                } catch (Exception e) {
                    System.err.println("ingrese numero por favor!");
                    leer.nextLine();
                }
            }

        } else if (aux.equalsIgnoreCase("Persas") && saltin == 1) {
            while (opcion != 8) {
                opciones();
                try {
                    opcion = leer.nextInt();
                    switch (opcion) {
                        case 1:

                            Estructuras.MetodosDeEstructura.agregarEstructura(player);
                            Estructuras.MetodosDeEstructura.seteos(player);
                            break;
                        case 2:
                            Unidades.unidades.crearUnidadPersa(player);
                            break;
                        case 3:
                            Unidades.unidades.ataque1();
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
                            Unidades.unidades.mostrarUnidades();
                            break;
                        case 8:
                            System.out.println("Saliendo del menu");
                            break;
                        default:
                            System.err.println("    Por favor ingrese una opción valida");
                    }

                } catch (Exception e) {
                    System.err.println("ingrese numero por favor!");
                    leer.nextLine();
                }
            }
        } else if (aux.equalsIgnoreCase("Teutones") && saltin == 2) {
            while (opcion != 8) {
                opciones();
                try {
                    opcion = leer.nextInt();
                    switch (opcion) {
                        case 1:

                            Estructuras.MetodosDeEstructura.agregarEstructura(player);
                            Estructuras.MetodosDeEstructura.seteos(player);
                            break;
                        case 2:
                            Unidades.unidades.crearUnidadTeuton2(player);
                            Unidades.unidades.mostrarUnidades2();
                            break;
                        case 3:
                            Unidades.unidades.ataque2();
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
                            Unidades.unidades.mostrarUnidades2();
                            break;
                        case 8:
                            System.out.println("saliendo del menu");
                            break;
                        default:
                            System.err.println("    Por favor ingrese una opción valida");
                    }

                } catch (Exception e) {
                    System.err.println("ingrese numero por favor!");
                    leer.nextLine();
                }
            }
        } else if (aux.equalsIgnoreCase("Mayas") && saltin == 2) {
            while (opcion != 8) {
                opciones();
                try {
                    opcion = leer.nextInt();
                    switch (opcion) {
                        case 1:

                            Estructuras.MetodosDeEstructura.agregarEstructura(player);
                            Estructuras.MetodosDeEstructura.seteos(player);
                            break;
                        case 2:
                            Unidades.unidades.crearUnidadMaya2(player);
                            break;
                        case 3:
                            Unidades.unidades.ataque2();
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
                            Unidades.unidades.mostrarUnidades2();
                            break;
                        case 8:
                            System.out.println("Saliendo del menu");
                            break;
                        default:

                            System.err.println("    Por favor ingrese una opción valida");
                    }

                } catch (Exception e) {
                    System.err.println("ingrese numero por favor!");
                    leer.nextLine();
                }
            }
        } else if (aux.equalsIgnoreCase("Persas") && saltin == 2) {
            while (opcion != 8) {
                opciones();
                try {
                    opcion = leer.nextInt();
                    switch (opcion) {
                        case 1:

                            Estructuras.MetodosDeEstructura.agregarEstructura(player);
                            Estructuras.MetodosDeEstructura.seteos(player);
                            break;
                        case 2:
                            Unidades.unidades.crearUnidadPersa2(player);
                            break;
                        case 3:
                            Unidades.unidades.ataque2();
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
                            Unidades.unidades.mostrarUnidades2();
                            break;

                        case 8:
                            System.out.println("Saliendo del menu");
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
