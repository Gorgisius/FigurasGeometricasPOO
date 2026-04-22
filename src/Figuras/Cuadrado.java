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
public class Cuadrado extends FiguraGeometrica{
    double lado;

    public Cuadrado(Scanner leer) {
        this.nombre = pedirNombre(leer);
        this.lado = pedirLado(leer);
    }
    
    public final String pedirNombre(Scanner leer){
        System.out.println("Nombre");
        System.out.print(">");
        return leer.nextLine();
    }
    
    public final double pedirLado(Scanner leer){
        System.out.println("Lado");
        System.out.print(">");
        return leer.nextDouble();
    }

    @Override
    void calcularArea() {
        this.area = Math.pow(lado, 2);
    }

    @Override
    void calcularPerimetro() {
        this.perimetro = lado*4;
    }
    
    @Override
    void mostrarInformacion(){
        System.out.println(this.nombre);
        System.out.println("Lado: " + this.lado);
    }
}
