/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal1;

/**
 *
 * @author Hype AMD
 */
public class Main {
    public static void main(String[] args) {
        MahasiswaReguler m1 = new MahasiswaReguler("Rafly", "056", "SI-1A");
        m1.infoReguler();

        System.out.println();

        MahasiswaBeasiswa m2 = new MahasiswaBeasiswa("Rizky", "082", "SI-2B");
        m2.infoBeasiswa();
    }
}

/*Objek Mahasiswa Reguler & Beasiswa...menggunakan inputan parameter konstruktor...infomhs untuk memanggil super class mencetak nama & nim*/
