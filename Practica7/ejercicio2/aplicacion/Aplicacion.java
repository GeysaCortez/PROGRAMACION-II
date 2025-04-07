/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

/**
 *
 * @author Administrador
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JuegoAdivinaNumero juegoNormal = new JuegoAdivinaNumero(3);
        JuegoAdivinaPar juegoPar = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar juegoImpar = new JuegoAdivinaImpar(3);

        System.out.println("\t--- JUEGO ADIVINA NUMERO ---");
        juegoNormal.juega();

        System.out.println("\t--- JUEGO ADIVINA NUMERO PAR ---");
        juegoPar.juega();

        System.out.println("\t--- JUEGO ADIVINA NUMERO IMPAR ---");
        juegoImpar.juega();
    }
    
}
