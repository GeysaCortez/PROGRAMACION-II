class Pintura extends Obra {
    private String genero;

    public Pintura(String titulo, String material, Artista artista1, Artista artista2, Anuncio anuncio, String genero) {
        super(titulo, material, artista1, artista2, anuncio);
        this.genero = genero;
    }
    public void mostrarDatos() {
    System.out.println("Título: " + titulo);
    System.out.println("Material: " + material);
    System.out.println("Género: " + genero);
    System.out.println("Artista 1: " + artista1.getNombre() + " " + artista1.getAñosExperiencia() );
    System.out.println("Artista 2: " + artista2.getNombre() + " " + artista2.getAñosExperiencia() );
    if (anuncio != null) {
        System.out.println("Anuncio N°: " + anuncio.numero + " Precio: " + anuncio.precio);
    } else {
        System.out.println("No tiene anuncio.");
    }
    System.out.println("-----------------------------");
}
}