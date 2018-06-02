/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import razas.Mayas;
import razas.Persas;
import razas.Teutones;
import razas.razas;

/**
 *
 * @author Raul Calderon <https://github.com/calderonra>
 */
public class fabricaRazas implements FabricaAbs {
    
   
    @Override
    public razas getraza(String type) {
        System.out.println("se entra a la fabrica de razas");
        switch(type){
            case "Mayas":
                return new Mayas();
            case "Persas":
                
                return new Persas();
            case "Teutones":
                return new Teutones(); 
    }
       
        return null;
    }
    
}
