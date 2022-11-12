/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JS12Latihan6_Encapsulation;

/**
 *
 * Created by 21343018_Anita Nursi
 */
public class BuahUtama {
    public static void main(String[] args) {
        EncapsulationBuah Apel = new EncapsulationBuah("Apel", "Rp3000", "Merah");
        System.out.println("Nama Buah: " + Apel.getNama() + "\nHarga: "
                + Apel.getPrice() + "\nWarna: " + Apel.getColor());
        
        Apel.setColor("Hijau");
        Apel.setPrice("Rp7000");
        
        System.out.println("\nInformasi terkait Apel setelah diupdate");
        
        System.out.println("Nama Buah: " + Apel.getNama() + "\nHarga: "
                + Apel.getPrice() + "\nWarna: " + Apel.getColor());
    }
}
