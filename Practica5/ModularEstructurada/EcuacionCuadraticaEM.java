import java.util.Scanner;

public class EcuacionCuadraticaEM {
    
    public static double getDiscriminante(double a, double b, double c){
        return (b * b) - (4 * a * c);
    }
    
    public static double getRaiz1(double a, double b, double discriminante){
        return (-b + Math.sqrt(discriminante)) / (2 * a);
    }
    
    public static double getRaiz2(double a, double b, double discriminante){
        return (-b - Math.sqrt(discriminante)) / (2 * a);
    }
    
    public static void resolverEcuacion(double a, double b, double c) {
        double discriminante = getDiscriminante(a, b, c);
        
         
        if (discriminante > 0) {
            System.out.println("La ecuación tiene dos raíces: " + getRaiz1(a, b, discriminante) + " " + getRaiz2(a, b, discriminante));
        } else if (discriminante == 0) {
            System.out.println("La ecuación tiene una raíz: " + getRaiz1(a, b, discriminante));
        } else {
            System.out.println("La ecuación no tiene raíces reales.");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese a, b, c: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            
            resolverEcuacion(a, b, c);
        }
        
        scanner.close();
    }
}
