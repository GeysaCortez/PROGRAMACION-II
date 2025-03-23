import java.util.Scanner;

public class Estadistica {
    public static double promedio(double[] numeros) {
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma / numeros.length;
    }

    public static double desviacion(double[] numeros, double promedio) {
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += Math.pow(numeros[i] - promedio, 2);
        }
        return Math.sqrt(suma / (numeros.length - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];
        
        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextDouble();
        }
        
        double promedio = promedio(numeros);
        double desviacion = desviacion(numeros, promedio);
        
        System.out.println("El promedio es "+ promedio);
        System.out.println("La desviación estándar es "+desviacion);
        
        scanner.close();
    }
   
}