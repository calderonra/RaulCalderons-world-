/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidades;

/**
 *
 * @author Raul Calderon <https://github.com/calderonra>
 */
public class unidad {
    public int vida;
    public int atk;
    public int fase;
    public int costo;

    public unidad() {
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    
    
    public void crearunidad(){
        unidad unidad = new unidad();
        unidad.atk=0;
        unidad.costo=0;
        unidad.vida=0;
        unidad.fase=0;
   
    };
    
    
    
}
