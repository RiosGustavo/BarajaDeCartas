/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.recejer3;

import Servicio.Metodos;

/**
 *
 * @author User
 */
public class RECEJER3 {

    public static void main(String[] args) {
        Metodos juego = new Metodos();
        juego.crearBaraja();
        juego.Menu();
    }
}
