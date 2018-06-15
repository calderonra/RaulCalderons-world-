/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raulcalderons.world;

import Fases.fases;

import Menu.ElMenu;
import Menu.ElMenuDeRazas;
import Unidades.unidad;
import fabricas.FabricaAbs;
import fabricas.FabricadeFabricas;
import manual.manual;
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
        
         manual a=new manual();
        System.out.println(a.leer("C:\\Users\\RAUL\\Documents\\NetBeansProjects\\RaulCalderons-world-2\\prueba.txt"));
        
        //fases fases = new fases();
        //fases.inicio();
    }
}
