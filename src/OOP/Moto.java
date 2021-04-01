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
public class Moto extends Vehiculo{
    private int cilindrada;
    private String tipoMotor;
    
    public void cambiarCilindrada(int cilindrada){
        this.cilindrada = cilindrada;
        System.out.println("cilindrada: " + this.cilindrada);
    }
    
    public void cambiarTipoMotor(String tipoMotor){
        this.tipoMotor = tipoMotor;
        System.out.println("tipoMotor: " + this.tipoMotor);
    }
    
}
