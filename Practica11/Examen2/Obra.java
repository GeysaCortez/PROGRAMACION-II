class Obra {
    protected String titulo;
    protected String material;
    protected Artista artista1;
    protected Artista artista2;
    protected Anuncio anuncio;

    public Obra(String titulo, String material, Artista a1, Artista a2, Anuncio anuncio) {
        this.titulo = titulo;
        this.material = material;
        this.artista1 = a1;
        this.artista2 = a2;
        this.anuncio = anuncio;
    }

    public Anuncio getAnuncio() {
        return anuncio;
    }

    public Artista getArtista1() {
        return artista1;
    }

    public Artista getArtista2() {
        return artista2;
    }

    public void setAnuncio(Anuncio anuncio) {
        this.anuncio = anuncio;
    }
}