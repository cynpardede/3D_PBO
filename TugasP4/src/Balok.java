/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cynthia
 */
public class Balok {
    
 protected double panjang;
    private double lebar;
    private double tinggi;

    protected Balok(double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public void Volume(){
        double vol = panjang * lebar * tinggi;
        System.out.println("Volume Balok            : " + vol);
    }

    public void LuasPermukaan(){
        double lp = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        System.out.println("Luas Permukaan Balok    : " + lp);
    }
    
} 
