/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola;

/**
 *
 * @author Administrador
 */
public class Cola {
    public int arreglo[];
    public int inicio, fin;
    public int n;

    public Cola(int n) {
        arreglo = new int[n];
        inicio = 0;
        fin = -1;
        this.n = n;
    }

    public void insert(int e) {
        if (isFull()) {
            System.out.println("Cola llena");
        } else {
            fin++;
            arreglo[fin] = e;
        }
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Cola vacía");
            return -1;
        } else {
            int e = arreglo[inicio];
            inicio++;
            return e;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Cola vacía");
            return -1;
        }
        return arreglo[inicio];
    }

    private boolean isEmpty() {
        return (inicio > fin);  
    }

    private boolean isFull() {
        return (fin == n - 1);  
    }
     public int size() {
        return fin - inicio + 1;
    }
    public static void main(String[] args) {
        Cola cola = new Cola(3);
        cola.insert(10);
        cola.insert(20);
        cola.insert(30);

        System.out.println(cola.peek()); 
        System.out.println("remove() = " + cola.remove());  
        System.out.println("remove() = " + cola.remove()); 
        System.out.println("remove() = " + cola.remove()); 

    }
}


