/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perta45a;

/**
 *
 * @author WINDOWS 11
 */
public class Main {
    public static void Main (String [] args) {
        Kendaraan gerobak = new Kendaraan (1);
        gerobak.roda = 3;
        gerobak.cetakRoda();
        System.out.println("===============");
        
        Kendaraan boeing = new Kendaraan(2) ;
        gerobak.roda = 3;
        gerobak.cetakRoda();
        System.out.println("===============");
        
        Mobil avansa = new Mobil();{
        System.out.println ("Roda avansa = " + avansa.roda);
        avansa.cetakRoda();
        
    }
        
    }
    
}

