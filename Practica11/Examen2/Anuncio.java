class Anuncio {
    int numero;
    double precio;

    public Anuncio(int numero, double precio) {
        this.numero = numero;
        this.precio = precio;
    }

    public void incrementarPrecio(double incremento) {
        this.precio += incremento;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumero() {
        return numero;
    }
}