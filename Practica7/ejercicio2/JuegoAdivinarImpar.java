package aplicacion;

/**
 *
 * @author Administrador
 */
class JuegoAdivinaImpar extends JuegoAdivinaNumero {

    public JuegoAdivinaImpar(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    @Override
    public boolean validaNumero(int n) {
        if (n >= 0 && n <= 10) {
            if (n % 2 != 0) {
                return true;
            } else {
                System.out.println("Error: Solo se aceptan números impares entre 0 y 10.");
                return false;
            }
        }
        System.out.println("Error: Número fuera del rango permitido (0 a 10).");
        return false;
    }
}