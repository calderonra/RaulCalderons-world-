/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Jugador.Jugador;
import fabricas.FabricaAbs;
import fabricas.FabricadeFabricas;
import java.util.Scanner;
import razas.razas;

/**
 *
 * @author Raul Calderon <https://github.com/calderonra>
 */
public class ElMenuDeRazas {

    public void opciones() {
        System.out.println("----Ingresa tu raza :0----");
        System.out.println("1. Teutones");
        System.out.println("2. Mayas");
        System.out.println("3. Persas");
        System.out.println("ingresa el numero por favor: ");
    }
/**
 * el menun de la raza 1 con esta se hacen las factory del jugador1
 * @param jugador
 * @return 
 */
    public String menuR(Jugador jugador) {
        Scanner leer = new Scanner(System.in);
        FabricaAbs fabrica = FabricadeFabricas.getfabrica("razas");
        int opcion = 5;
        int opcion2 = 5;
        String aux1="";
        while (opcion != 4) {
            opciones();
            try {
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Seleccionaste a los teutones! 0:");
                        razas teutones = fabrica.getraza("Persas");
                        teutones.crearRaza(jugador);
                        opcion=4;
                        aux1="teutones";
                        break;
          
                    case 2:
                        System.out.println("Seleccionaste a los mayas! 0:");
                        razas mayas=fabrica.getraza("Mayas");
                        mayas.crearRaza(jugador);
                        aux1= "Maya";
                        opcion=4;
                        break;
                    case 3:
                        System.out.println("Seleccionaste a los persas :0");
                        
                        razas persa = fabrica.getraza("Persas");
                        persa.crearRaza(jugador);
                        opcion=4;
                        aux1="Persas";
                        break;
                    default:
                        System.err.println("ingrese una opcion valida!");
                }
            } catch (Exception e) {
                System.err.println("ingrese numero por favor!");
                leer.nextLine();
            }
        }
        return aux1;
    }
}
