/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author extre
 */
public abstract class FiguraGeometrica {
    String nombre;
    double area;
    double perimetro;
    
    abstract void calcularArea();
    void mostrarArea(){
        if (area != 0.0){
            System.out.println(this.area);
        } else {
            calcularArea();
            mostrarArea();
        }
    }
    abstract void calcularPerimetro();
    void mostrarPerimetro(){
        if (perimetro != 0.0){
            System.out.println(this.area);
        } else {
            calcularPerimetro();
            mostrarPerimetro();
        }
    }
    
    abstract void mostrarInformacion();
}
