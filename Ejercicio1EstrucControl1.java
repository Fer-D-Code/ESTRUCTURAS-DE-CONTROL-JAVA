/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1estruccontrol1;

import java.util.Scanner;

/**
 *
 * @author Fernando Yadiel Delgado Herrera
 */
public class Ejercicio1EstrucControl1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
 
        System.out.print("Ingrese su nombre: ");
        String nombre = teclado.nextLine();
 
        System.out.print("Ingrese su edad: ");
        int edad = Integer.parseInt(teclado.nextLine());
 
        System.out.print("Ingrese su carrera: ");
        String carrera = teclado.nextLine();
 
        System.out.print("Ingrese su estatura (m): ");
        double estatura = Double.parseDouble(teclado.nextLine());
 
        System.out.println("\n--- Datos ingresados ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Estatura: " + estatura + " m");
    }
}
     

