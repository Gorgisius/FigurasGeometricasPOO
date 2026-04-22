/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Figuras;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author extre
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        Scanner leer = new Scanner(System.in);
        ArrayList<FiguraGeometrica> misFiguras = new ArrayList<>();
        
        while(true){       
            opcion = Control.mostrarMenuA(leer);
            
            switch (opcion){
                case 1 -> {
                    opcion = Control.opcionesFiguras(leer);
                    switch (opcion){
                        case 1 -> {
                            FiguraGeometrica cuadrado = new Cuadrado(leer);
                            misFiguras.add(cuadrado);
                        }
                        case 2 -> {
                            FiguraGeometrica triangulo = new Triangulo(leer);
                            misFiguras.add(triangulo);
                        }
                        case 3 -> {
                            FiguraGeometrica circulo = new Circulo(leer);
                            misFiguras.add(circulo);
                        }
                        case 4 -> {
                            return;
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Figuras disponibles");
                    String nombre;
                    for (FiguraGeometrica figura : misFiguras){
                        System.out.println(figura.nombre);
                    }
                    System.out.print(">");
                    nombre = leer.nextLine();
                    boolean quitar = false;
                    FiguraGeometrica seVa = null;
                    for (FiguraGeometrica figura : misFiguras){
                        if (figura.nombre.equals(nombre)){
                            System.out.print("Nombre: ");
                            figura.mostrarInformacion();
                            System.out.print("Area: ");
                            figura.mostrarArea();
                            System.out.print("Perimetro: ");
                            figura.mostrarPerimetro();
                            System.out.print("Borrar?: ");
                            nombre = leer.nextLine();
                            if (nombre.equals("y")){
                                quitar = true;
                                seVa = figura;
                            } else {
                                
                            }
                        } else {
                            System.out.println("Figura no enontrada");
                        }
                    }
                    
                    if (quitar && (seVa != null)){
                        misFiguras.remove(seVa);
                    }
                }
                case 3 ->{
                    return;
                }
            }
        }
    }
    
}
