/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul1;

public class Soal1 {
    String nama;
    int umur;
    String alamat;

    public Soal1(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }
    
     public String berjalan() {
        return nama + " (umur " + umur + ", alamat " + alamat + ") sedang berjalan.";
    }

    public String berlari() {
        return nama + " (umur " + umur + ", alamat " + alamat + ") sedang berlari.";
    }
    
    public static void main(String[] args) {
        Soal1 manusia1 = new Soal1("RAFLY", 19, "SIDOARJO");
        Soal1 manusia2 = new Soal1("ISMA", 19, "SURABAYA");
        Soal1 manusia3 = new Soal1("FAHRI", 19, "JOMABANG");
        Soal1 manusia4 = new Soal1("YOGA", 19, "SIDOARJO");
        Soal1 manusia5 = new Soal1("HAIDAR", 19, "SIDOARJO");

        System.out.println(manusia1.berjalan());
        System.out.println(manusia2.berlari());
        System.out.println(manusia3.berjalan());
        System.out.println(manusia4.berlari());
        System.out.println(manusia5.berjalan());
    }
}
