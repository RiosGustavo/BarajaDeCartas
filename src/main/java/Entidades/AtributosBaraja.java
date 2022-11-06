/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class AtributosBaraja {
     private ArrayList<AtributosCarta> carta;

    public AtributosBaraja() {
    }

    public AtributosBaraja(ArrayList<AtributosCarta> carta) {
        this.carta = carta;
    }

    public ArrayList<AtributosCarta> getCarta() {
        return carta;
    }

    public void setCarta(ArrayList<AtributosCarta> carta) {
        this.carta = carta;
    }

    @Override
    public String toString() {
        return "Baraja{" + "carta=" + carta + '}';
    }
     
}
