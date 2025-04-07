/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego1;

import java.util.Random;
import java.util.Scanner;
public class JuegoAdivinaNumero extends Juego {
    private int  numeroAAdivinar;

    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }
    public void juega(){
        reiniciaPartida();
        Random rand = new Random();
        numeroAAdivinar = rand.nextInt(10);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Adivina un número entre 0 y 10: ");
            int intento = scanner.nextInt();

            if (intento == numeroAAdivinar) {
                System.out.println("Acertaste!!!");
                actualizaRecord();
                break;
            } else {
                boolean tieneVidas = quitaVida();
                if (tieneVidas) {
                    if (intento < numeroAAdivinar) {
                        System.out.println("El número es mayor. Intenta de nuevo.");
                    } else {
                        System.out.println("El número es menor. Intenta de nuevo.");
                    }
                } else {
                    System.out.println("Perdiste!!! El número era: " + numeroAAdivinar);
                    break;
                }
            }
        }
    }
    
}
