import java.util.*;

public class Main {
    public static void main(String[] args) {
     // Crear artistas
        Artista a1 = new Artista("Juan", "123", 5);
        Artista a2 = new Artista("Maria", "456", 10);
        Artista a3 = new Artista("Luis", "789", 15);
        Artista a4 = new Artista("Ana", "101", 8);

        // (a) Crear objetos
        Anuncio anuncio1 = new Anuncio(1, 1500);
        System.out.println("=== Datos de la pintura con anuncio ===");
        Pintura ConAnuncio = new Pintura("Atardecer", "Oleo", a1, a2, anuncio1, "Paisaje");
        ConAnuncio.mostrarDatos();

        System.out.println("=== Datos de la pintura sin anuncio (actualizado) ===");
        Pintura SinAnuncio = new Pintura("Montaña", "Acrílico", a3, a4, null, "Naturaleza");
        SinAnuncio.mostrarDatos();

        // (b) Mostrar el artista con más experiencia entre ambas pinturas
        Artista artistaP1 = ConAnuncio.Experiencia();
        Artista artistaP2 = SinAnuncio.Experiencia();

        Artista Experiencia = (artistaP1.getAñosExperiencia() > artistaP2.getAñosExperiencia()) ? artistaP1 : artistaP2;
        System.out.println("Artista con más experiencia: " + Experiencia.getNombre());

        // (c) Agregar un anuncio a la pintura sin anuncio y calcular el total
        Anuncio nuevoAnuncio = new Anuncio(2, 1800);
        SinAnuncio.setAnuncio(nuevoAnuncio);

        double totalVenta = ConAnuncio.getAnuncio().getPrecio() + SinAnuncio.getAnuncio().getPrecio();
        System.out.println("Monto total de venta: " + totalVenta);
    
  }
}