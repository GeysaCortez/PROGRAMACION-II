/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica9;

/**
 *
 * @author Administrador
 */
public class Platea extends Boleto {
    private int diasAnticipacion;

    public Platea(int numero, int diasAnticipacion) {
        super(numero);
        this.diasAnticipacion = diasAnticipacion;
        calcularPrecio();
    }

    @Override
    public void calcularPrecio() {
        if (diasAnticipacion >= 10) {
            precio = 50.0;
        } else {
            precio = 60.0;
        }
    }
}
