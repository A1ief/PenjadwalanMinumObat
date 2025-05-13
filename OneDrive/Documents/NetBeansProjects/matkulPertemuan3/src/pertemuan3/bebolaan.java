/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author WINDOWS 11
 */
public class bebolaan{
    double radius;
    String warna;
    
    public void SetRadius(double angka){
        radius = angka;
    }
    
    public void HitungVolume(double volume){
        
    }
    
    public static void main(String[] args){
        bebolaan basket = new bebolaan();
        
        basket.radius = 100;
        basket.SetRadius(50);
        basket.warna = "merah";
        
        System.out.println("jari-jari bola basket = " + basket.radius);
        System.out.println("warna bola basket = " + basket.warna);
    }
}
