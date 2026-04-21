/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author extre
 */
public class Circulo extends FiguraGeometrica{
    double radio;
    
    public Circulo(double radio) {
        super("Circulo");
        this.radio = radio;
    }

    @Override
    void calcularArea() {
        this.area =  Math.round(Math.PI*(radio*radio));
    }

    @Override
    void calcularPerimetro() {
        this.perimetro = Math.round(Math.PI*(radio+radio));
    }
    
    @Override
    void mostrarInformacion(){
        System.out.println(this.nombre);
        System.out.println("radio = " + this.radio);
    }
}
