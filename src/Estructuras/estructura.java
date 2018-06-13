/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author Raul Calderon
 */
public class estructura {
    private String nombre;
    public int vida;
    public int fase;
    public int costo;
    public int recursosAdar;

    public estructura() {
    }

    public estructura(String nombre, int vida, int fase, int costo, int recursosAdar) {
        this.nombre = nombre;
        this.vida = vida;
        this.fase = fase;
        this.costo = costo;
        this.recursosAdar = recursosAdar;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getRecursosAdar() {
        return recursosAdar;
    }

    public void setRecursosAdar(int recursosAdar) {
        this.recursosAdar = recursosAdar;
    }
    

    @Override 
            public String toString(){
                return "nombre:  "+nombre+ "vida: "+ vida+ "\nataque: ";
            }
   
}
