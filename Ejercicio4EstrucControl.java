/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4estruccontrol;

import java.util.Scanner;

/**
 *
 * @author Fernando Yadiel Delgado Herrera
 */
public class Ejercicio4EstrucControl {

    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
 
        System.out.print("Ingrese la nota del estudiante: ");
        double nota = Double.parseDouble(teclado.nextLine());
 
        if (nota >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }
}    

