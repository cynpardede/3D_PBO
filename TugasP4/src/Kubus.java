/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cynthia
 */
public class Kubus extends Balok {
    
    protected Kubus(double sisi){
        super(sisi, sisi, sisi);
    }

    @Override
    public void Volume(){
        double vol = panjang * panjang * panjang;
        System.out.println("Volume Kubus            : " + vol);
    }

    @Override
    public void LuasPermukaan(){
        double lp = 6 * (panjang * panjang);
        System.out.println("Luas Permukaan Kubus    : " + lp);
    }
    
}
    

