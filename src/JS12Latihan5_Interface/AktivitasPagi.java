/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JS12Latihan5_Interface;

/**
 *
 * Created by 21343018_Anita Nursi
 */
interface AktivitasPagi {
    abstract  void lari();
    abstract  void berenang();
}

class AktivitasPagiAnak implements AktivitasPagi{
    public void lari(){
        System.out.println("Aktivitas pertama pagi adalah lari pagi.");
    }
    public void berenang(){
        System.out.println("Aktivitas pertama pagi adalah berenang.");
    }
}
