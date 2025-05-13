/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB6_abstraks;

/**
 *
 * @author WINDOWS 11
 */
public class Main {
        public static void main(String[] args) {
        System.out.println("LUAS dan KELILING");
        LayangLayang x = new LayangLayang();
        System.out.println("------------------------------");
        System.out.println("Luas Layang-layang : " + x.luas() );
        System.out.println("Keliling Layang-layang : " + x.keliling());
        System.out.println("------------------------------");
        JajarGenjang y = new JajarGenjang();
        System.out.println("Luas Jajargenjang : " +y.luas());
        System.out.println("Keliling Jajargenjang : " +y.keliling());
    }

}
