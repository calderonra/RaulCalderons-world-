/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fases;

import Jugador.Jugador;
import Menu.ElMenu;
import Menu.ElMenu2;
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
    ElMenu2 menu2 = new ElMenu2();
    public static Jugador player1 = new Jugador();
    public static Jugador player2 = new Jugador();

    public void inicio() {

        for (int i = 0; i < limitedefase; i++) {
            int flag = 0;
            player1.setEstado(true);
            player2.setEstado(false);
            while (flag != 1) {
                System.out.println("ola entre al while :v");
                if (i == 0) {
                    System.out.println("entre al primer if :0");
                    System.out.println("Jugador 1 Seleccione su Raza :0");
                    n.menuR();
                    System.out.println("Jugador 2 Seleccione su Raza :0");
                    n2.menuR();
                    flag=1;
                } else {
                    System.out.println("entre al otro momo :0");
                    System.out.println("Turno del jugador 1");
                    menu.menu();
                    System.out.println("Turno del jugador 2");
                    menu2.menu();
                }
            }
            flag = 0;
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
