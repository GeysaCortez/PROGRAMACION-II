/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica8;

/**
 *
 * @author Administrador
 */
public class  D implements A, B {
    private int x;
    private int y;
    private int z;

    public D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public void incrementaXZ() {
        x++;
        z++;
    }

    public void incrementaYZ() {
        y++;
        z++;
    }
    public void incrementaZ() {
        z++;
    }

    public void incrementaXYZ() {
        x++;
        y++;
        z++;
    }

    public void mostrar() {
        System.out.println("x=" + x + ", y=" + y + ", z=" + z);
    }
}
