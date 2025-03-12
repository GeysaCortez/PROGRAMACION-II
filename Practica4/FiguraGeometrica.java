class FiguraGeometrica {
    double area(double radio){
        return Math.PI *radio*radio;
    }
    double area(double base,double altura){
        return base*altura;
    }
    double area(int b, double a){
      return (b*a)/2;
    }
    double area(int lado) {
        return (5 * Math.pow(lado, 2)) / (4 * Math.tan(Math.PI / 5));
    }
    double area(double baseA, double baseB , double altura){
         return ((baseA + baseB) * altura) / 2 ;
    }
  
}

class Main {
    public static void main(String[] args) {
        FiguraGeometrica f1=new FiguraGeometrica ();
        FiguraGeometrica f2=new FiguraGeometrica ();
        FiguraGeometrica f3=new FiguraGeometrica ();
        FiguraGeometrica f4=new FiguraGeometrica ();
        FiguraGeometrica f5=new FiguraGeometrica ();
        
        System.out.println("Circulo:"+ f1.area(1));
        System.out.println("Rectangulo: "+f2.area(2,3));
        System.out.println("Triangulo Rectangulo: "+f3.area(12,5));
        System.out.println("Pentagono: "+ f4.area(6));
        System.out.println("Trapecio: "+f5.area(4,8,10));
    }
 
}