/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segitiga;

/**
 *
 * @author WINDOWS 11
 */
public class limas_segitiga extends segitiga{
    double vol,t;  
    @Override
    double Volume() {
        vol = (Luas()*t)/3;
        return vol;
    }
}
