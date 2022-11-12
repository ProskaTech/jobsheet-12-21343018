/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JS12Latihan3_PolymorphismDynamic;

/**
 *
 * Created by 21343018_Anita Nursi
 */
public class polymorphismDynamic {
    public static void main(String[] args) {
        Bank B;
        B = new BRI();
        System.out.println("Tingkat suku bunga BRI adalah: " + B.sukuBunga());
        B = new BNI();
        System.out.println("Tingkat suku bunga BRI adalah: " + B.sukuBunga());
        B = new Mandiri();
        System.out.println("Tingkat suku bunga BRI adalah: " + B.sukuBunga());
    }
}
