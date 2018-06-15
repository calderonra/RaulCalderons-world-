/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import manual.manual;

/**
 *
 * @author Raul Calderon
 */
public class PrimerMenu {
    public void opciones(){
        manual a=new manual();
        a.leer("C:\\Users\\RAUL\\Documents\\NetBeansProjects\\RaulCalderons-world-2\\prueba.txt");
        System.out.println("---- Raul Calderons world ----");
        System.out.println("1. Nuevo juego ");
        System.out.println("2. Manual de instrucciones");
        System.out.println("3. Atacar unidades enemigas");
    }
}
