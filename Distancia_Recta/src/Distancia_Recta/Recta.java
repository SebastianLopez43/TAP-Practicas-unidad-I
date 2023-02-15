package Distancia_Recta;

/**
 * @author José Sebastian López Ibarra
 * Monday February 13 2023
 */

public class Recta {
    private double d;

    public Recta() {
    }    

    public double getD() {
        return d;
    }
    public void setD(double d) {
        this.d = d;
    }
        
    public double distanBetweenPoints(int x, int y, int x1, int y1) {
        d = Math.sqrt(Math.pow((x1 - x), 2) + Math.pow((y1 - y), 2));
        return d;
    }
}
