/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio11estruccontrol;

import java.util.Scanner;

/**
 *
 * @author Fernando Yadiel Delgado Herrera
 */
public class Ejercicio11EstrucControl {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el numero 1: ");
        double primerNumero = Double.parseDouble(teclado.nextLine());

        double mayor = primerNumero;
        double menor = primerNumero;

        for (int i = 2; i <= 10; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            double numero = Double.parseDouble(teclado.nextLine());

            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);
    }
}