/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

import javax.swing.JOptionPane;

/**
 *
 * @author extre
 */
public class Cuadrado extends FiguraGeometrica{
    double lado;

    public Cuadrado(double lado) {
        super("Cuadrado");
        this.lado = pedirLado();
    }
    
    public final double pedirLado(){
        return Double.parseDouble(JOptionPane.showInputDialog("Medida de lado: "));
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
        System.out.println("lado = " + this.lado);
    }
}
