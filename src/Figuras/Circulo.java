/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author extre
 */
public class Circulo extends FiguraGeometrica{
    double radio;
    
    public Circulo(Scanner leer) {
        this.nombre = pedirNombre(leer);
        this.radio = pedirRadio(leer);
    }
    
    String pedirNombre(Scanner leer){
        System.out.println("Nombre:");
        System.out.print(">");
        return leer.nextLine();
    }
    
    double pedirRadio(Scanner leer){
        System.out.println("Radio:");
        System.out.print(">");
        return leer.nextDouble();
    }

    @Override
    void calcularArea() { 
        DecimalFormat df = new DecimalFormat("0.00");
        String areaPreParse = df.format(Math.PI*(radio*radio));
        this.area = Double.parseDouble(areaPreParse);
    }

    @Override
    void calcularPerimetro() {
        DecimalFormat df = new DecimalFormat("0.00");
        String preimetroPreParse = df.format(Math.PI*(radio+radio));
        this.perimetro = Double.parseDouble(preimetroPreParse);
    }
    
    @Override
    void mostrarInformacion(){
        System.out.println(this.nombre);
        System.out.println("Radio: " + this.radio);
    }
}
