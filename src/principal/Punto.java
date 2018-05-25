    
package principal;


public class Punto {

    int X1, Y1;
    int X2, Y2;
 
    private Punto(int X1, int Y1, int X2, int Y2) {
 
        this.X1 = X1;
        this.Y1 = Y1;
        this.X2 = X2;
        this.Y2 = Y2;
    }
 
 
    public int getX1() {
 
        return X1;
    }
 
    public void setX1(int X1) {
        this.X1 = X1;
    }
 
    public int getY1() {
 
        return Y1;
    }
 
    public void setY1(int Y1) {
        this.X1 = Y1;
    }
 
    public double getX2() {
 
        return X2;
    }
 
    public void setX2(int X2) {
        this.X1 = X2;
    }
 
    public int getY2() {
 
        return Y2;
 
    }
 
    public void setY2(int Y2) {
        this.Y2 = Y2;
    }
 
    public double getCalcularDistancia() {
 
        return (double) Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));
    }
}