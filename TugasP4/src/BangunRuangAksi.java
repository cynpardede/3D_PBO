/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Cynthia
 */
public class BangunRuangAksi {

    public static void main(String[] args) {
        Balok b = new Balok(10, 5, 3);
        b.Volume();
        b.LuasPermukaan();

        Kubus k = new Kubus(10);
        k.Volume();
        k.LuasPermukaan();
    }
}