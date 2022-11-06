/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.AtributosBaraja;
import Entidades.AtributosCarta;
import Entidades.AtributosPalo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Metodos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    Collections c;
    AtributosBaraja baraja = new AtributosBaraja();

    AtributosBaraja cartaEntregada = new AtributosBaraja();

    // ArrayList<Atributos> Baraja = new ArrayList();
    public AtributosBaraja crearBaraja() {
        System.out.println("Procedemos a crear una Baraja");
        ArrayList<AtributosCarta> Bar = new ArrayList();
        ArrayList<AtributosCarta> Fuera = new ArrayList();

        cartaEntregada.setCarta(Fuera);

        for (AtributosPalo auxiliar : AtributosPalo.values()) {
            for (int i = 0; i < 12; i++) {
                ///// con este eliminamos el 8 y 9 como dice el enunciado del ejercicio
                if (i + 1 == 8 || i + 1 == 9) {
                    // NO HACER NADA PORQUE ESOS DOS NUMEROS NO SE INCLUYEN EN LA BARAJA
                } else {
                    AtributosCarta c = new AtributosCarta(i + 1, auxiliar);
                    Bar.add(c);
                }

            }

        }
        baraja.setCarta(Bar);
        System.out.println("Baraja Creada");

        /// creamos los vbectores para ingresar el nuemro de carta y el palo 
//        String[] numeroCarta = {"1", "2", "3", "4", "5,", "6", "7", "10", "11", "12"};
//        String[] palo = {"Espadas", "Bastos", "Oros", "Copas"};
//        int contador = 0;
//        do {
//            Random aleatorio = new Random();
//
//            AtributosCarta carta = new AtributosCarta();
//            /// mezclamos los numero de carta y palos aleatoriamente (Aleatoriamente)
//            /// 40 numeros
//            carta.setNumeroCarta(numeroCarta[aleatorio.nextInt(10)]);
//            
//            /// 4 palos
//            carta.setPalo(palo[aleatorio.nextInt(4)]);
//            
//
//            Baraja.add(carta);
//
//            contador++;
//
//        } while (contador < 40);
        return baraja;
    }
//
//    public void mostrarCartas() {
//
////        /// ACA UTILIZAMOS EL HASHSET PARA QUE NO INGRESE DUPLICADOS
////        System.out.println("La Baraja de Cartas Es: ");
////        for (AtributosCarta carta : Baraja) {
////            System.out.println(" " + carta);
////
////        }
////        System.out.println("************************");
//    }

    public void barajarCartas() {
        /// este comando pone aleatoriamente los elementos del array
        c.shuffle(baraja.getCarta());

    }

    public AtributosCarta siguienteCarta() {
        AtributosCarta c = baraja.getCarta().get(0);
        return c;
    }

    public void cartasDisponibles() {
        System.out.println("Las Cartas disponibles son :");
        System.out.println(" " + baraja.getCarta().size());

    }

    public void darCartas() {
        System.out.println("Diga cuantas cartas desea recibir");
        int cantidad = leer.nextInt();

        if (cantidad <= baraja.getCarta().size()) {
            for (int i = 0; i < cantidad; i++) {
                System.out.println("Se entrega el " + baraja.getCarta().get(i).toString());
            }

            /// con este for se remueve la carta entregada al jugador de la baraja           
            for (int i = 0; i < cantidad; i++) {
                cartaEntregada.getCarta().add(baraja.getCarta().get(0));
                baraja.getCarta().remove(0);

            }

        } else {
            System.out.println("No hay cartas dispomiobleds para entregar al jugador");
            System.out.println("No se entrego carga");
            cartasDisponibles();
        }

    }

    public void cartasMonton() {

        if (cartaEntregada.getCarta().size() == 0) {
            System.out.println("No se han dada cartas de mazo aun");

        } else {
            System.out.println("Cartas Retiradas");
            String p = "";
            int cont = 0;
            for (Object object : cartaEntregada.getCarta()) {
                p = p.concat(object.toString());
                p = p.concat(".");
                cont++;
                if (cont == 10) {
                    System.out.println(p);
                    p = "";
                    cont = 0;

                }
            }
        }
    }

    public void mostrarBaraja() {

        if (baraja.getCarta().size() == 0) {
            System.out.println("No hay carta en la Baraja");

        } else {
            System.out.println("Cartas de la BAraja");
            String p = "";
            int cont = 0;
            for (Object object : baraja.getCarta()) {
                p = p.concat(object.toString());
                p = p.concat(".");
                cont++;
                if (cont == 10) {
                    System.out.println(p);
                    p = "";
                    cont = 0;

                }
            }
        }
    }

    public void Menu() {
        System.out.println(" BIENVENIDO AL JUEGO DE BARAJA ESPAÑOLA");
        int numeros = 0;

        do {
            System.out.println("""
                              
                               
                               Menu
                               
                               1. BARAJAR MAZO
                               2. VER SIGUIENTE CARTA
                               3. CARTAS DISPONIBLES
                               4. PEDIR CARTAS
                               5. VER CARTAS YA USADAS
                               6. VER CARTAS AUN EN EL MAZO
                               7. SALIR
                               """);
            numeros = leer.nextInt();

            switch (numeros) {

                case 1:
                    barajarCartas();
                    System.out.println("el se ha barajado el mazo");
                    break;

                case 2:
                    siguienteCarta();
                    break;

                case 3:
                    cartasDisponibles();
                    break;

                case 4:
                    darCartas();
                    break;

                case 5:
                    cartasMonton();

                    break;

                case 6:
                    mostrarBaraja();

                    break;

                case 7:

                    System.out.println("fin del programa");

                    break;
            }

        } while (numeros != 7);

    }

}
