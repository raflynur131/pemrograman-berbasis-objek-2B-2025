/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author rizky
 */
import java.util.ArrayList;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    private ArrayList<String> mataKuliah;

    private static int totalMahasiswa = 0;

    // Constructor
    public Mahasiswa(String nama, String nim, String prodi) {
        if (!isValidNIM(nim)) {
            throw new IllegalArgumentException("NIM tidak valid!");
        }
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.mataKuliah = new ArrayList<>();
        totalMahasiswa++;
    }

    // Menambahkan mata kuliah
    public void tambahMataKuliah(String mk) {
        mataKuliah.add(mk);
    }

    // Menampilkan biodata dan daftar mata kuliah
    public void tampilkanBiodata() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Prodi: " + prodi);
        System.out.println("Daftar Mata Kuliah:");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }
    }

    // Method class (class method) untuk menampilkan total mahasiswa
    public static void tampilkanTotalMahasiswa() {
        System.out.println("Total Mahasiswa: " + totalMahasiswa);
    }

    // Method static untuk validasi NIM
    public static boolean isValidNIM(String nim) {
        return nim.startsWith("23") && nim.length() == 10;
    }
}

 
