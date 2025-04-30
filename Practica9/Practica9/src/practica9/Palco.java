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
public class Palco extends Boleto {

    public Palco(int numero) {
        super(numero);
        calcularPrecio();
    }

    @Override
    public void calcularPrecio() {
        this.precio = 100.0;
    }
}

