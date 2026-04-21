/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author extre
 */
public class Triangulo extends FiguraGeometrica{
    double ladoBase;
    double lado1;
    double lado2;
    double altura;
    

    public Triangulo(double ladoBase, double lado1, double lado2, double altura) {
        super("Triangulo");
        this.ladoBase = ladoBase;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
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
