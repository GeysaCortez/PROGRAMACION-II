/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;
import java.util.Random;
import java.util.Scanner;

class JuegoAdivinaNumero extends Juego {
    protected int numeroAAdivinar;

    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    public boolean validaNumero(int n) {
        return n >= 0 && n <= 10;
    }

    public void juega() {
        reiniciaPartida();
        Random rand = new Random();
        numeroAAdivinar = rand.nextInt(10);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Adivina un número entre 0 y 10: ");
            int intento = scanner.nextInt();

            if (!validaNumero(intento)) {
                System.out.println("Número inválido. Debe estar entre 0 y 10.");
                continue;
            }

            if (intento == numeroAAdivinar) {
                System.out.println("¡Acertaste!");
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
                    System.out.println("Perdiste. El número era: " + numeroAAdivinar);
                    break;
                }
            }
        }
    }
}
