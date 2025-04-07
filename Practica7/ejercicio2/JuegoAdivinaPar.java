package aplicacion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
class JuegoAdivinaPar extends JuegoAdivinaNumero {

    public JuegoAdivinaPar(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    @Override
    public boolean validaNumero(int n) {
        if (n >= 0 && n <= 10) {
            if (n % 2 == 0) {
                return true;
            } else {
                System.out.println("Error: Solo se aceptan números pares entre 0 y 10.");
                return false;
            }
        }
        return false;
    }
}
