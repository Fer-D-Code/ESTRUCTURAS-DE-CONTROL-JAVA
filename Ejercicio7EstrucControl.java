/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7estruccontrol;

import java.util.Scanner;

/**
 *
 * @author Fernando Yadiel Delgado Herrera
 */
public class Ejercicio7EstrucControl {

    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
 
        int numero;
        int cantidad = 0;
        int sumaTotal = 0;
 
        System.out.println("Ingrese numeros positivos. Ingrese un numero negativo para terminar.");
 
        do {
            System.out.print("Numero: ");
            numero = Integer.parseInt(teclado.nextLine());
 
            if (numero >= 0) {
                sumaTotal += numero;
                cantidad++;
            }
        } while (numero >= 0);
 
        System.out.println("\n--- Resultados ---");
        System.out.println("Cantidad de numeros ingresados: " + cantidad);
        System.out.println("Suma total: " + sumaTotal);
    }
}