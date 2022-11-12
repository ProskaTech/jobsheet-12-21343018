/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JS12Latihan4_Abstraction;

/**
 *
 * Created by 21343018_Anita Nursi
 */
abstract class Orang {
    public String namaAyah = "Randi Proska";
    abstract  void makan();
    public void minum(){
        System.out.println("Minum air teh dan kopi");
    }
}

class AnakUmur1Tahun extends Orang{
    public void namaAyahku(){
        System.out.println("Nama ayahku adalah " + namaAyah);
    }
    
    public void makan(){
        System.out.println("Anak umur 1 tahun makan asi.");
    }
    
    public void minum(){
        System.out.println("Anak umur 1 tahun minum asi.");
    }
}
