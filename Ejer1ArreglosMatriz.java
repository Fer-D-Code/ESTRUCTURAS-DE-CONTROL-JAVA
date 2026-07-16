/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejer1arreglosmatriz;

import java.util.Scanner;

/**
 *
 * @author Fernando Yadiel Delgado Herrera
 */
public class Ejer1ArreglosMatriz {

    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];
 
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero en la posicion " + i + ": ");
            numeros[i] = Integer.parseInt(teclado.nextLine());
        }
 
        System.out.println("\n--- Valores almacenados ---");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posicion " + i + ": " + numeros[i]);
        }
    }
}
 
