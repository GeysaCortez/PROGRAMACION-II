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
public abstract class Boleto {
    protected int numero;
    protected double precio;

    public Boleto(int numero) {
        this.numero = numero;
    }

    public abstract void calcularPrecio();

    @Override
    public String toString() {
        return "Número: " + numero + ", Precio: " + precio;
    }
}

