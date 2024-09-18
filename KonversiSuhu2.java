/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class KonversiSuhu2 extends KonversiSuhu{
    
    private double fahrenheitToCelcius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
    
    public double fahrenheitToReamur(double fahrenheit) {
        double celsius = fahrenheitToCelcius(fahrenheit);
        return celciusToReamur(celsius);//method yang berasal dari class matematika
    }
}
