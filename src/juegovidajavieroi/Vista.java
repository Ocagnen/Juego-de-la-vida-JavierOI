/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegovidajavieroi;

import java.util.Scanner;

/**
 *
 * @author javier
 */
public class Vista {

    // Atributo Scanner para recibir información por teclado
    public static Scanner tec = new Scanner(System.in);

    // Método para pedir a usuario las dimensiones del tablero
    public static int elegirTablero() {

        System.out.println("¿Qué dimensiones desea darle al tablero? (N x N)");
        int respuesta = tec.nextInt();
        while (respuesta > 25 || respuesta < 5) {
            System.out.println("Tamaño no admitido");
            System.out.println("Introducir un número entre 25 y 5");
            respuesta = tec.nextInt();
        }

        return respuesta;
    }

    // Método para pedir a usuario el procentaje de células del tablero
    public static int elegirPorcentajeCel() {
        System.out.println("Introduce el porcentaje de células para la "
                + "generación 1");
        System.out.println("El porcentaje se debe introducir en forma de "
                + "número entero entre 100 y 0 (ej: 20, 14, 67,...)");
        int respuesta = tec.nextInt();
        while (respuesta > 100 || respuesta < 0) {
            System.out.println("Tamaño no admitido");
            System.out.println("Introducir un número entero entre 100 y 0");
            respuesta = tec.nextInt();
        }

        return respuesta;
    }

    // Método para que el usuario elija si generar otra generación de 
    // células o finalizar la partida
    public static int elegirContinuar() {

        int respuesta;
        do {
            System.out.println("¿Quieres continuar la partida?");
            System.out.println("1. Siguiente generación");
            System.out.println("2. Finalizar partida");
            respuesta = tec.nextInt();

        } while (respuesta > 2 || respuesta < 1);

        return respuesta;
    }
    
    // Método para que usuario determine si las células se colocarán 
    // aleatoriamente o de forma manual
    public static int elegirManualAlt(){
        
        int respuesta;
        
        do{
        System.out.println("1. Asignar células de forma manual");
        System.out.println("2. Asignar células de forma aleatoria");
        respuesta = tec.nextInt();
        } while (respuesta>2 || respuesta<1);
        
        return respuesta;
        
    }

}
