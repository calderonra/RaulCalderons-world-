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

    private String nombre;
    public int vida;
    public int atk;
    public int fase;
    public int costo;

    public unidad(String nombre, int vida, int atk, int fase, int costo) {
        this.nombre = nombre;
        this.vida = vida;
        this.atk = atk;
        this.fase = fase;
        this.costo = costo;
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

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
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

    @Override
    public String toString() {
        return "nombre:  " + nombre + "vida: " + vida + "\nataque: " + atk + "\n";
    }

}
