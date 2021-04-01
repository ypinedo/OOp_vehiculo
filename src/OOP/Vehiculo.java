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
public class Vehiculo implements Transporte{
    private String propietario;
    private int velocidad;
    private String modelo;
    private int ruedas;
    
    public void CambioMarcha(int nuevaVelocidad){
        this.velocidad = nuevaVelocidad;
        System.out.println("velocidad: " + this.velocidad + "km/hora");
    }
    
    public void asignarPropietario(String nuevoPropietario){
        this.propietario = nuevoPropietario;
        System.out.println("propietario: " + this.propietario);
    }
    
    public void asignarModelo(String modelo){
        this.modelo = modelo;
        System.out.println("modelo: " + this.modelo);
    }
    
    public void asignarRuedas(String ruedas){
        this.modelo = ruedas;
        System.out.println("ruedas: " + this.ruedas);
    }

    @Override
    public void acelerar(int incremento) {
        this.velocidad = this.velocidad + incremento;
        System.out.println("velocidad: " + this.velocidad + "km/hora");
    }

    @Override
    public void aplicarFrenos() {
        this.velocidad = this.velocidad - 1;
        System.out.println("velocidad: " + this.velocidad + "km/hora");
    }
}
