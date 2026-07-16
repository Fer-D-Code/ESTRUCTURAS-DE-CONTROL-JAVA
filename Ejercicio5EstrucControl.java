/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5estruccontrol;

import java.util.Scanner;

/**
 *
 * @author Fernando Yadiel Delgado Herrera
 */
public class Ejercicio5EstrucControl {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
 
        System.out.print("Ingrese una calificacion entre 0 y 10: ");
        double calificacion = Double.parseDouble(teclado.nextLine());
 
        if (calificacion >= 9 && calificacion <= 10) {
            System.out.println("Excelente");
        } else if (calificacion >= 8 && calificacion < 9) {
            System.out.println("Muy Bueno");
        } else if (calificacion >= 7 && calificacion < 8) {
            System.out.println("Bueno");
        } else if (calificacion >= 5 && calificacion < 7) {
            System.out.println("Regular");
        } else if (calificacion >= 0 && calificacion < 5) {
            System.out.println("Deficiente");
        } else {
            System.out.println("Calificacion invalida");
        }
    }
}    

