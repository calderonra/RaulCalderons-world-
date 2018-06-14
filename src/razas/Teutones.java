/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razas;

import Jugador.Jugador;

/**
 *
 * @author Raul Calderon
 */
public class Teutones implements razas {

    @Override
    public void crearRaza(Jugador jugador) {
        System.out.println("SETEOS INICIALES ");
        jugador.setOro(100);
        jugador.setMadera(100);
        jugador.setVida(1000);
        jugador.setPiedra(100);
        
    }
    
}
