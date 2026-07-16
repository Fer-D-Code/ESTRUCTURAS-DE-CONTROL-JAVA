/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3estruccontrol;

import java.util.Scanner;

/**
 *
 * @author Fernando Yadiel Delgado Herrera
 */
public class Ejercicio3EstrucControl {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
 
        System.out.print("Ingrese la edad de la persona: ");
        int edad = Integer.parseInt(teclado.nextLine());
 
        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        }
    }
}    

