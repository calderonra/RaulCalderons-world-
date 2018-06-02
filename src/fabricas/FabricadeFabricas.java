/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

/**
 *
 * @author Raul Calderon
 */
public class FabricadeFabricas {
    public static FabricaAbs getfabrica(String type){
        if(type.equalsIgnoreCase("razas")){
            System.out.println("se hizo una fabrica de razas");
            return new fabricaRazas();
        }
        return null;
    }
}
