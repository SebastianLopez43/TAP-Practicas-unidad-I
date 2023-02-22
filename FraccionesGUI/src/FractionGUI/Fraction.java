package FractionGUI;

/**
 * @author José Sebastian López Ibarra
 * Tuesday February 21 2023
 */

public class Fraction {
    private int numerador1, numerador2, denominador1, denominador2;

    public Fraction() {
        this.numerador1 = 0;
        this.denominador1 = 1;
        this.numerador2 = 0;
        this.denominador2 = 1;
    }

    public Fraction(int numerador1, int denominador1, int numerador2, int denominador2) {
        this.numerador1 = numerador1;
        this.denominador1 = denominador1;
        this.numerador1 = numerador2;
        this.denominador1 = denominador2;
    }
    
    public int getNumerador1() {
        return numerador1;
    }
    public void setNumerador1(int numerador) {
        this.numerador1 = numerador;
    }
    public int getDenominador1() {
        return denominador1;
    }
    public void setDenominador1(int denominador) {
        this.denominador1 = denominador;
    }       
    
    public int getNumerador2() {
        return numerador2;
    }
    public void setNumerador2(int numerador) {
        this.numerador2 = numerador;
    }
    public int getDenominador2() {
        return denominador2;
    }
    public void setDenominador2(int denominador) {
        this.denominador2 = denominador;
    }               
}