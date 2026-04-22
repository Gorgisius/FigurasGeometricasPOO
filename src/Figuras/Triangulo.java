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
public class Triangulo extends FiguraGeometrica{
    double ladoBase;
    double lado1;
    double lado2;
    double altura;
    

    public Triangulo(Scanner leer) {
        this.nombre = pedirNombre(leer);
        double[] arr = pedirLadosYAltura(leer);
        this.ladoBase = arr[0];
        this.lado1 = arr[1];
        this.lado2 = arr[2];
        this.altura = arr[3];
    }

    final String pedirNombre(Scanner leer){
        System.out.println("Nombre");
        System.out.print(">");
        return leer.nextLine();
    }
    
    final double[] pedirLadosYAltura(Scanner leer){
        double[] arr = new double[4];
        System.out.println("Base");
        System.out.print(">");
        arr[0] = leer.nextDouble();
        System.out.println("Altura");
        System.out.print(">");
        arr[1] = leer.nextDouble();
        System.out.println("Lado");
        System.out.print(">");
        arr[2] = leer.nextDouble();
        System.out.println("Lado");
        System.out.print(">");
        arr[3] = leer.nextDouble();
        
        return arr;
    }
    
    @Override
    void calcularArea() {
        this.area = (ladoBase*altura)/2;
    }

    @Override
    void calcularPerimetro() {
        this.perimetro = lado1+lado2+ladoBase;
    }
    
    @Override
    void mostrarInformacion(){
        System.out.println(this.nombre);
        System.out.println("lado a = " + this.lado1);
        System.out.println("lado b = " + this.ladoBase);
        System.out.println("lado c = " + this.lado2);
        System.out.println("altura = " + this.altura);
    }
}
