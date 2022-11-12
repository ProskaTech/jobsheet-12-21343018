/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JS12Latihan1_Inheritance;

/**
 *
 * Created by 21343018_Anita Nursi
 */
class RodaDua extends Kendaraan{
    double NaikHargaKe = 0.20;
    void hargaAkhir(){
        hargaDasar = hargaDasar + (hargaDasar * NaikHargaKe);
        System.out.println("Setelah dimodifikasi, harga sepeda menjadi Rp" + hargaDasar);
    }
}
