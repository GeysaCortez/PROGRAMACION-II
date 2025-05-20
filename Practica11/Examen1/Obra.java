class Obra {
    public String titulo;
    public String material;
    public Artista artista1;
    public Artista artista2;
    public Anuncio anuncio;

    public Obra(String titulo, String material, Artista artista1, Artista artista2, Anuncio anuncio) {
        this.titulo = titulo;
        this.material = material;
        this.artista1 = artista1;
        this.artista2 = artista2;
        this.anuncio = anuncio;
    }

    public Artista Experiencia() {
        if (artista1.getAñosExperiencia() >= artista2.getAñosExperiencia()) {
            return artista1;
        } else {
            return artista2;
        }
    }

    public void setAnuncio(Anuncio anuncio) {
        this.anuncio = anuncio;
    }

    public Anuncio getAnuncio() {
        return anuncio;
    }
}