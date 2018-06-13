/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fases;

import Jugador.Jugador;
import Menu.ElMenu;
import Menu.ElMenuDeRazas;
import Menu.ElMenuDeRazas2;

/**
 *
 * @author Raul Calderon <https://github.com/calderonra>
 */
public class fases {

    int limitedefase = 10;
    ElMenuDeRazas n = new ElMenuDeRazas();
    ElMenu menu = new ElMenu();
    ElMenuDeRazas2 n2 = new ElMenuDeRazas2();
    public static Jugador player1 = new Jugador();
    public static Jugador player2 = new Jugador();

    public void inicio() {

        for (int i = 0; i < limitedefase; i++) {
            int flag = 0;
            player1.setClasedejugador(1);
            player2.setClasedejugador(2);
            
            while (flag != 1) {
                if (i == 0) {
                    System.out.println("Jugador 1 Seleccione su Raza :0");
                    String aux=n.menuR(player1);
                   player1.setRaza(aux);
                    System.out.println("la raza es"+player1.raza);
                    System.out.println("Jugador 2 Seleccione su Raza :0");
                    String aux1=n2.menuR();
                   player2.setRaza(aux1);
                    System.out.println(player2.raza);
                    flag = 1;
                } else {
                    System.out.println("Turno del jugador 1");
                    menu.menu(player1);
                    System.out.println("Turno del jugador 2");
                    menu.menu(player2);
                    flag = 1;
                }

            }
            flag = 0;
            System.out.println("-----------------FASE--------------> " + i);

        }

    }

    public Jugador getJugador() {
        if (player1.isEstado() == true) {
            return player1;
        } else {
            return player2;
        }
    }
}
