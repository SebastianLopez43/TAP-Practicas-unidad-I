package FractionGUI;

/**
 * @author José Sebastian López Ibarra
 * Tuesday February 21 2023
 */

public class Operation {        
    String num, den;
    
    public Operation() {        
    }
    
    // Método que suma dos fracciones
    public String sum(Fraction a, Fraction b) {
        num = String.valueOf((a. getNumerador1()*b.getDenominador2() + b.getNumerador2()*a.getDenominador1()));
        den = String.valueOf((a.getDenominador1()*b.getDenominador2()));
        return num + "/" + den;
    }
    
    // Método que resta dos fracciones
    public String subtraction(Fraction a, Fraction b) { 
        num = String.valueOf(a. getNumerador1()*b.getDenominador2() - b.getNumerador2()*a.getDenominador1());
        den = String.valueOf(a.getDenominador1()*b.getDenominador2());   
        return num + "/" + den;
    }
    
    // Método que multiplica dos fracciones
    public String multiplication(Fraction a, Fraction b) { 
        num = String.valueOf(a. getNumerador1()*b.getNumerador2());
        den = String.valueOf(a.getDenominador1()*b.getDenominador2());
        return num + "/" + den;
    }
    
    // Método que divide dos fracciones
    public String division(Fraction a, Fraction b) {
        num = String.valueOf(a.getNumerador1()*b.getDenominador2());
        den = String.valueOf(a.getDenominador1()*b.getNumerador2());
        return num + "/" + den;
    }
}