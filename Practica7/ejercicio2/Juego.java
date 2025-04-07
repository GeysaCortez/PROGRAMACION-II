package aplicacion;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;

class Juego {
    protected int numeroDeVidas;
    protected int record;

    public Juego(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
        this.record = 0;
    }

    public void reiniciaPartida() {
        System.out.println("Reiniciando partida...");
    }

    public void actualizaRecord() {
        record++;
        System.out.println("Nuevo récord!!! Partidas ganadas: " + record);
    }

    public boolean quitaVida() {
        numeroDeVidas--;
        if (numeroDeVidas > 0) {
            System.out.println("Quedan: " + numeroDeVidas );
            return true;
        } else {
            System.out.println("¡No te quedan más vidas!");
            return false;
        }
    }
}
