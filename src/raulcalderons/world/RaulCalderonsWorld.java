/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raulcalderons.world;

import Jugador.jugadores;
import Unidades.unidad;

/**
 *
 * @author Raul Calderon <https://github.com/calderonra>
 */
public class RaulCalderonsWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Unidades.unidades.iniciarUnidades();
      Unidades.unidades.mostrarUnidades();
      Unidades.unidades.crearUnidad();
      Unidades.unidades.mostrarUnidades();
    }
    
}