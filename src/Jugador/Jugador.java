/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;

import Unidades.unidad;

/**
 *
 * @author Raul Calderon <https://github.com/calderonra>
 */
public class Jugador {
    public int vida=0;
    public int oro=0;
    public int piedra=0;
    public int madera=0;
    public boolean estado;
    public String raza;
    public int clasedejugador=0;

    public Jugador() {
    }

    public Jugador(boolean estado, String raza) {
        this.estado = estado;
        this.raza = raza;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public int getPiedra() {
        return piedra;
    }

    public void setPiedra(int piedra) {
        this.piedra = piedra;
    }

    public int getMadera() {
        return madera;
    }

    public void setMadera(int madera) {
        this.madera = madera;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getClasedejugador() {
        return clasedejugador;
    }

    public void setClasedejugador(int clasedejugador) {
        this.clasedejugador = clasedejugador;
    }

    @Override
    public String toString(){
      return "Vida:"+vida+"\n Oro: "+oro+"\n Madera:"+madera+"\n Piedra"+piedra;  
    }

    
}
