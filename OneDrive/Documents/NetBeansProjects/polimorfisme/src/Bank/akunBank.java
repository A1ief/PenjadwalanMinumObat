/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author WINDOWS 11
 */
abstract public class akunBank {
    String pemilik;
    double saldo;
    
    akunBank(String pemilik, double saldo){
        this.pemilik = pemilik;
        this.saldo = saldo;
    }
    
    // Polimorfisme dinamis
    abstract void cekSaldo();
    
    // Polimorfisme dinamis (overloading)
    void cekSaldo(String info){
        System.out.println(info + ": Pemilik " + pemilik + " saldo sebesar " + saldo);
    }
}
