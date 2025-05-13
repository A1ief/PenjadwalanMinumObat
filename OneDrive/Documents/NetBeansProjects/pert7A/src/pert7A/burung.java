/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert7A;

/**
 *
 * @author WINDOWS 11
 */
public class burung extends makhlukHidup{
    protected int kaki;
    protected void bergerak(){
        System.out.println("Burung Terbang");
    }
    protected void bergerak(int jumlah){
        System.out.println("Ada " + jumlah + " Burung Terbang");
    }
}
