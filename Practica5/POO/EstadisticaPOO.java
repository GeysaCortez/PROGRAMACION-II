import java.util.Scanner;

class Estadistica {
    private double[] numeros;

    public Estadistica(double[] numeros) {
        this.numeros = numeros;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }
    public double calcularDesviacion() {
        double promedio = calcularPromedio();
        double suma = 0;

        for (double num : numeros) {
            suma += Math.pow(num - promedio, 2);
        }

        return Math.sqrt(suma / (numeros.length - 1));
    }
}

public class EstadisticaPOO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextDouble();
        }

        Estadistica estadistica = new Estadistica(numeros);

        double promedio = estadistica.calcularPromedio();
        double desviacion = estadistica.calcularDesviacion();

        System.out.println("\nEl promedio es "+ promedio);
        System.out.println("La desviación estándar es "+ desviacion);

        scanner.close();
    }
}

