/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio10estruccontrol;

import java.util.Scanner;

/**
 *
 * @author Fernando Yadiel Delgado Herrera
 */
public class Ejercicio10EstrucControl {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
 
        int suma = 0;
        int cantidad = 10;
 
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            int numero = Integer.parseInt(teclado.nextLine());
            suma += numero;
        }
 
        double promedio = (double) suma / cantidad;
 
        System.out.println("\n--- Resultados ---");
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}
 