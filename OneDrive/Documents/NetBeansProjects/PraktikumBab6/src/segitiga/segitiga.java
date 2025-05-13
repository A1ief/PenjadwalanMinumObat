/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segitiga;

/**
 *
 * @author WINDOWS 11
 */
public abstract class segitiga {
    public double alas,tinggi,luas;
    public double Luas(){
        luas = 0.5*(alas *tinggi);
        return luas;
    }  
    abstract double Volume();
}
