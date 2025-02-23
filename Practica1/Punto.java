import java.text.DecimalFormat;

class Punto {
    private double x, y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Método para obtener coordenadas cartesianas
    public double[] coordCartesianas() {
        return new double[]{x, y};
    }

    // Método para obtener coordenadas polares
    public double[] coordPolares() {
        double radio = Math.sqrt(x * x + y * y);
        double angulo = Math.toDegrees(Math.atan2(y, x)); 
        return new double[]{radio, angulo};
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##"); 
        return "(" + df.format(x) + ", " + df.format(y) + ")";
    }

    public static void main(String[] args) {
        Punto p1 = new Punto(0, 3);
        System.out.println(p1);

        double[] cartesianas = p1.coordCartesianas();
        System.out.println(cartesianas[0] + " " + cartesianas[1]);

        double[] polares = p1.coordPolares();
        System.out.println(polares[0] + " " + polares[1]);
    }
}

