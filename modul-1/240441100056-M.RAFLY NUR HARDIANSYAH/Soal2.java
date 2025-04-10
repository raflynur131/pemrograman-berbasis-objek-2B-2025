/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul1;

import java.util.Scanner;

public class Soal2 {
    // Atribut
    String nama;
    String nim;
    String jurusan;
    String alamat;

    // Konstruktor
    public Soal2(String nama, String nim, String jurusan, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }
    // Method untuk menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println("\nData Mahasiswa:");
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println("Alamat   : " + alamat);
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data mahasiswa 1
        System.out.println("\nMasukkan data mahasiswa 1:");
        System.out.print("Nama: ");
        String nama1 = input.nextLine();
        System.out.print("NIM: ");
        String nim1 = input.nextLine();
        System.out.print("Jurusan/Prodi: ");
        String jurusan1 = input.nextLine();
        System.out.print("Alamat: ");
        String alamat1 = input.nextLine();
        Soal2 mahasiswa1 = new Soal2(nama1, nim1, jurusan1, alamat1);

        // Input data mahasiswa 2
        System.out.println("\nMasukkan data mahasiswa 2:");
        System.out.print("Nama: ");
        String nama2 = input.nextLine();
        System.out.print("NIM: ");
        String nim2 = input.nextLine();
        System.out.print("Jurusan/Prodi: ");
        String jurusan2 = input.nextLine();
        System.out.print("Alamat: ");
        String alamat2 = input.nextLine();
        Soal2 mahasiswa2 = new Soal2(nama2, nim2, jurusan2, alamat2);

        // Input data mahasiswa 3
        System.out.println("\nMasukkan data mahasiswa 3:");
        System.out.print("Nama: ");
        String nama3 = input.nextLine();
        System.out.print("NIM: ");
        String nim3 = input.nextLine();
        System.out.print("Jurusan/Prodi: ");
        String jurusan3 = input.nextLine();
        System.out.print("Alamat: ");
        String alamat3 = input.nextLine();
        Soal2 mahasiswa3 = new Soal2(nama3, nim3, jurusan3, alamat3);

        // Menampilkan data mahasiswa
        mahasiswa1.tampilkanInfo();
        mahasiswa2.tampilkanInfo();
        mahasiswa3.tampilkanInfo();
    }
}
