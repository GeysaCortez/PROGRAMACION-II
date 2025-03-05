/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

/**
 *
 * @author Administrador
 */
public class Pila {

   public int arreglo[];
   public int top;
   public int n;
   public Pila(int n){
       arreglo =new int[n];
       top=-1;
       this.n=n;
   }
   public void push(int e){
       if(isFull()){
           System.out.println("Pila llena");
       }else{
           top++;
           arreglo[top]=e;
       }
   }
   public int pop(){
       if(isEmpty()){
          System.out.println("Pila vacia");
          return -1;
       }else{
           int e=arreglo[top];
           top--;
           return e;
       }
   }
   public int peek(){
      return arreglo[top];
   }
   
    private boolean isEmpty() {
        return (top ==-1);
    }
    private boolean isFull(){
        return (top==n-1);
    }
    public static void main(String[] args) {
        Pila pila =new Pila(3);
        pila.push(10);
        pila.push(20);
        pila.push(30);
        
        System.out.println(pila.peek());
        System.out.println("pop() = "+pila.pop());
        System.out.println("pop() = "+pila.pop());
        System.out.println("pop() = "+pila.pop());
       
           
    }

  
    
}
