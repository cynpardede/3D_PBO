/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author USER
 */
public class DemoKonversiSuhu {

    public static void main(String[] args) {
        KonversiSuhu2 Suhu2 = new KonversiSuhu2();
        
        double suhuCelsius = 65.0;//mengisi nilai pada suhuCelcius
        
        System.out.println("================================");//Heading Program
        System.out.println("  KALKULATOR KONVERSI SUHU");
        System.out.println("================================");
        
        System.out.println(suhuCelsius + "°C dalam Fahrenheit: " + Suhu2.celciusToFahrenheit(suhuCelsius) + "°F");
        System.out.println(suhuCelsius + "°C dalam Reamur: " + Suhu2.celciusToReamur(suhuCelsius) + "°R");
       
        double suhuFahrenheit = Suhu2.celciusToFahrenheit(suhuCelsius);
        System.out.println(suhuFahrenheit + "°F dalam Reamur: " + Suhu2.fahrenheitToReamur(suhuFahrenheit) + "°R");
    }
}