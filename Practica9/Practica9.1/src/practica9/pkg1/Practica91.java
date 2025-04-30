/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica9.pkg1;

/**
 *
 * @author Administrador
 */
import java.util.Random;
public class Practica91 {

     public static void main(String[] args) {
        Figura[] figuras = new Figura[5];

        for (int i = 0; i < figuras.length; i++) {
            if (i % 2 == 0) {
                figuras[i] = new Cuadrado("azul",5.0);
            } else {
                figuras[i] = new Circulo("Rojo",3.1);
            }
        }

        // Mostrar los datos
        for (Figura figura : figuras) {
            System.out.println(figura);
            System.out.printf("Área: %.2f\n", figura.area());
            System.out.printf("Perímetro: %.2f\n", figura.perimetro());

            if (figura instanceof Coloreado) {
                System.out.println("Cómo colorear: " + ((Coloreado) figura).comoColorear());
            }

            System.out.println("---------------------------");
        }
    }
    
}
