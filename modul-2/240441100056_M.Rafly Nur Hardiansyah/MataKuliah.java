/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author rizky
 */
public class MataKuliah {
    private String kode;
    private String nama;
    private int sks;

    // Constructor
    public MataKuliah(String kode, String nama, int sks) {
        if (!isValidSKS(sks)) {
            throw new IllegalArgumentException("Jumlah SKS tidak valid! Harus 2 atau 3.");
        }
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    // Method statis untuk validasi jumlah SKS
    public static boolean isValidSKS(int sks) {
        return sks == 2 || sks == 3;
    }

    // Menampilkan info mata kuliah
    public void tampilkanInfo() {
        System.out.println("Kode Mata Kuliah : " + kode);
        System.out.println("Nama Mata Kuliah : " + nama);
        System.out.println("Jumlah SKS       : " + sks);
    }
}
