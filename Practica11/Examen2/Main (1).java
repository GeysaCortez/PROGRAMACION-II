import java.util.*;

public class Main {
    public static void main(String[] args) {
      // a. Crear dos objetos pintura con anuncio
        Artista a1 = new Artista("Juan", "123", 10);
        Artista a2 = new Artista("Ana", "456", 12);
        Artista a3 = new Artista("Carlos", "789", 8);
        Artista a4 = new Artista("Lucia", "321", 14);

        Anuncio anuncio1 = new Anuncio(1, 1000);
        Anuncio anuncio2 = new Anuncio(2, 1200);

        Pintura pintura1 = new Pintura("Puesta de Sol", "Óleo", a1, a2, anuncio1, "Paisaje");
        Pintura pintura2 = new Pintura("Montaña", "Acrílico", a3, a4, anuncio2, "Naturaleza");

        // b. Calcular el promedio de experiencia de artistas
        int totalExperiencia = a1.getAñosExperiencia() + a2.getAñosExperiencia() + a3.getAñosExperiencia() + a4.getAñosExperiencia();
        double promedio = totalExperiencia / 4.0;
        System.out.println("Promedio de años de experiencia: " + promedio);

        // c. Incrementar el precio de la pintura cuyo artista tenga nombre X
        String nombreX = "Lucia";
        double incrementoX = 200;

        if (pintura1.ConNombre(nombreX)) {
            pintura1.getAnuncio().incrementarPrecio(incrementoX);
        }
        if (pintura2.ConNombre(nombreX)) {
            pintura2.getAnuncio().incrementarPrecio(incrementoX);
        }

        // Mostrar resultados
        System.out.println("\nPinturas actualizadas:");
        pintura1.mostrarDatos();
        pintura2.mostrarDatos();
    
  }
}