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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Abstraccion y encapsulacion
        Moto chopera = new Moto();
        Barco yate = new Barco();
        chopera.cambiarCilindrada(125);
        chopera.cambiarTipoMotor("Gasolina");
        //Herencia
        chopera.asignarPropietario("Yurguen");
        chopera.CambioMarcha(10);
        chopera.acelerar(2);
        
        yate.asignarModelo("Crucero");
        yate.CambioMarcha(100);
        
        //Polimorfismo
        chopera.aplicarFrenos();
        yate.aplicarFrenos();
    }
    
}
