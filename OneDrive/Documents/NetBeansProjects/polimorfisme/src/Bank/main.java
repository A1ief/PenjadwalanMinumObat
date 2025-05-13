/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author WINDOWS 11
 */
public class main {
    public static void main(String[] args) {
        akunBank akun1 = new tabungan("Ahmad", 500000);
        
        // Polimorfisme dinamis
        akun1.cekSaldo();
        
        // Polimorfisme statis
        akun1.cekSaldo("Informasi Saldo");
    }
}
