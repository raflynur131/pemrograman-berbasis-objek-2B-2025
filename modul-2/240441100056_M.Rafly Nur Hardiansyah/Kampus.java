/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author rizky
 */
public class Kampus {
    private String nama;
    private String alamat;

    private static int totalMahasiswa = 0;

    // Constructor
    public Kampus(String nama, String alamat) {
        if (!isValidNamaKampus(nama)) {
            throw new IllegalArgumentException("Nama kampus tidak valid! Tidak boleh mengandung angka.");
        }
        this.nama = nama;
        this.alamat = alamat;
    }

    // Menambahkan total mahasiswa (misalnya jika dikaitkan dengan class Mahasiswa)
    public static void tambahMahasiswa() {
        totalMahasiswa++;
    }

    // Method class untuk menampilkan info kampus
    public static void tampilkanInfoKampus(Kampus kampus) {
        System.out.println("Nama Kampus    : " + kampus.nama);
        System.out.println("Alamat Kampus  : " + kampus.alamat);
        System.out.println("Total Mahasiswa: " + totalMahasiswa);
    }

    // Method statis untuk validasi nama kampus (tidak boleh mengandung angka)
    public static boolean isValidNamaKampus(String nama) {
        return !nama.matches(".*\\d.*"); // cek jika mengandung angka
    }
}

