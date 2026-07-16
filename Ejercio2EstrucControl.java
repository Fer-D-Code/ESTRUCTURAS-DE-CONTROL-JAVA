/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercio2estruccontrol;

import java.util.Scanner;

/**
 *
 * @author Fernando Yadiel Degado Herrera
 */
public class Ejercio2EstrucControl {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
 
        System.out.print("Ingrese el primer numero entero: ");
        int numero1 = Integer.parseInt(teclado.nextLine());
 
        System.out.print("Ingrese el segundo numero entero: ");
        int numero2 = Integer.parseInt(teclado.nextLine());
 
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        double division = (double) numero1 / numero2;
        int residuo = numero1 % numero2;
 
        System.out.println("\n--- Resultados ---");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
        System.out.println("Residuo: " + residuo);
    }
}

