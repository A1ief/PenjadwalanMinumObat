/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author WINDOWS 11
 */
public class tabungan extends akunBank{
    tabungan(String pemilik, double saldo){
        super(pemilik, saldo);
    }
    
    @Override
    void cekSaldo(){
        System.out.println("Tabungan: Pemilik " + pemilik + " memiliki saldo sebesar " + saldo);
    }
}
