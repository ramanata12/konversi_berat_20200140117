/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversi.berat.konversiberat;

/**
 *
 * @author MSi-GAMING
 */
public class konversi {
    
   
    public static double KgKeGram(double berat){
        return berat * 1000;
    }
    public static double KgKeOns(double berat){
        return berat * 10;
    }
    public static double KgKePon(double berat){
        return berat * 2;
    }
    
  
    public static double GramKeKg(double berat){
        return berat / 1000;
    }
    public static double OnsKeKg(double berat){
        return berat / 10;
    }
    
    public static double PonKeKg(double berat){
        return berat / 2;
    }
}
