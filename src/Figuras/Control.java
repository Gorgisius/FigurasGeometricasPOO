/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

import java.util.Scanner;

/**
 *
 * @author extre
 */
public class Control {
    static int mostrarMenuA(Scanner leer){
        System.out.println("1. Crear nueva figura");
        System.out.println("2. Ver figuras");
        System.out.println("3. Salir");
        System.out.print(">");
        int opcion = leer.nextInt();
        leer.nextLine();
        return opcion;
    }
    
    static int opcionesFiguras(Scanner leer){
        System.out.println("Figuras disponibles");
        System.out.println("1. Cuadrado");
        System.out.println("2. Triangulo");
        System.out.println("3. Circulo");
        System.out.println("4. Regresar");
        System.out.print(">");
        int opcion = leer.nextInt();
        leer.nextLine();
        return opcion;
    }
}
