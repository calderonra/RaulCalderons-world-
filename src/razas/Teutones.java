/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razas;

/**
 *
 * @author Raul Calderon
 */
public class Teutones implements razas {

    @Override
    public void crearRaza() {
        
        
        Unidades.unidades.iniciarUnidades();
       Unidades.unidades.mostrarUnidades();
       Unidades.unidades.modificarUnidadesTeutones();
    }
    
}
