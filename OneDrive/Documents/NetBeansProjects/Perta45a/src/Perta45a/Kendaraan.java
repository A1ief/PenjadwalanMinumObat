/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perta45a;

/**
 *
 * @author WINDOWS 11
 */
public class Kendaraan {
    int roda;
    String warna;
      protected  void cetakRoda(){
         System.out.println("Rodanya ada " +this. roda);
         
     }
     Kendaraan (){
         this.roda = 100;
     }
    Kendaraan(int roda){
        this.roda = roda;
    }
    Kendaraan (int roda, String warna){
            this.roda = roda;
            this.warna = warna;
            
            
    }
}

