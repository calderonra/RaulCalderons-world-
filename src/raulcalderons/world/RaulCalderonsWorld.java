/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raulcalderons.world;

import Jugador.jugadores;
import Unidades.unidad;
import fabricas.FabricaAbs;
import fabricas.FabricadeFabricas;
import razas.razas;

/**
 *
 * @author Raul Calderon <https://github.com/calderonra>
 */
public class RaulCalderonsWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FabricaAbs fabrica = FabricadeFabricas.getfabrica("razas");
        razas persa = fabrica.getraza("Persas");
        persa.crearRaza();

    }

}
