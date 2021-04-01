/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author Yurguen Pinedo
 */
public class Barco implements Transporte{
    private int velocidad;
    private String modelo;
    
    public void CambioMarcha(int nuevaVelocidad){
        this.velocidad = nuevaVelocidad;
        System.out.println("velocidad: " + this.velocidad);
    }
    
    public void asignarModelo(String modelo){
        this.modelo = modelo;
        System.out.println("modelo: " + this.modelo);
    }
    
    @Override
    public void acelerar(int incremento) {
        this.velocidad = this.velocidad + incremento;
        System.out.println("velocidad: " + this.velocidad + "km/hora");
    }

    @Override
    public void aplicarFrenos() {
        this.velocidad = 0;
        System.out.println("velocidad: " + this.velocidad + "km/hora");
    }
}
