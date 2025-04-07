/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego1;

/**
 *
 * @author Administrador
 */
public class Juego {
   private  int numeroDeVidas ;
   private int record;
   
   public Juego(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
        this.record = 0;
    }
   
   public void reiniciaPartida(){
       System.out.println ("Reiniciando partida!");
   }
   public void actualizaRecord(){
        record++;
        System.out.println("¡Nuevo récord! Número de partidas ganadas: " + record);
   }
   public boolean quitaVida(){
       numeroDeVidas--;
       if (numeroDeVidas > 0) {
            System.out.println("Te quedan " + numeroDeVidas);
            return true;
        } else {
            System.out.println("¡No te quedan más vidas!");
            return false;
       }
   }
}
