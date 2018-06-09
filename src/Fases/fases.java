/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fases;

import Jugador.Jugador;
import Menu.ElMenu;
import Menu.ElMenuDeRazas;

/**
 *
 * @author Raul Calderon <https://github.com/calderonra>
 */
public class fases {

    int limitedefase = 10;
    ElMenuDeRazas n = new ElMenuDeRazas();
    ElMenu menu = new ElMenu();
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
                    n.menuR();
                    flag=1;
                } else {
                    System.out.println("entre al otro momo :0");
                    menu.menu();
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
