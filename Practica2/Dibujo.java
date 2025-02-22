import javax.swing.*; 
import java.awt.*;  

// Clase Punto
class Punto {  
    int x, y;  

    public Punto(int x, int y) {  
        this.x = x;  
        this.y = y;  
    }  

    @Override  
    public String toString() {  
        return "(" + x + ", " + y + ")";  
    }  
}  

// Clase Linea
class Linea {  
    Punto p1, p2;  

    public Linea(Punto p1, Punto p2) {  
        this.p1 = p1;  
        this.p2 = p2;  
    }  

    @Override  
    public String toString() {  
        return "Linea de " + p1 + " a " + p2;  
    }  

    public void dibujaLinea(Graphics g) {  
        g.drawLine(p1.x, p1.y, p2.x, p2.y);  
    }  
}  

// Clase Circulo
class Circulo {  
    Punto centro;  
    float radio;  

    public Circulo(Punto centro, float radio) {  
        this.centro = centro;  
        this.radio = radio;  
    }  

    @Override  
    public String toString() {  
        return "Circulo en " + centro + " con radio " + radio;  
    }  

    public void dibujaCirculo(Graphics g) {  
        g.drawOval(centro.x - (int)radio, centro.y - (int)radio, (int)(2 * radio), (int)(2 * radio));  
    }  
}  

// Clase para la interfaz gráfica  
public class Dibujo extends JPanel {  
    Linea linea;  
    Circulo circulo;  

    public Dibujo() {  
        // Inicializamos una línea y un círculo  
        linea = new Linea(new Punto(50, 50), new Punto(200, 200));  
        circulo = new Circulo(new Punto(300, 150), 50);  
    }  

    @Override  
    protected void paintComponent(Graphics g) {  
        super.paintComponent(g);  
        linea.dibujaLinea(g);  
        circulo.dibujaCirculo(g);  
    }  

    public static void main(String[] args) {  
        SwingUtilities.invokeLater(() -> {  
            JFrame frame = new JFrame("Dibujo de Línea y Círculo");  
            Dibujo dibujo = new Dibujo();  
            frame.add(dibujo);  
            frame.setSize(500, 400);  
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
            frame.setVisible(true);  
        });  
    }  
}