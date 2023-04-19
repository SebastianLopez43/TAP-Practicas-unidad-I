package Classes;

/**
 * @author José Sebastian López Ibarra
 * Wednesday April 19 2023
 */

public class Fecha {    
    private int day, year;
    private String month;

    public Fecha() {
    }

    public Fecha(int day, int year, String month) {
        this.day = day;
        this.year = year;
        this.month = month;
    }

    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }
    public void setMonth(String month) {
        this.month = month;
    }        
}