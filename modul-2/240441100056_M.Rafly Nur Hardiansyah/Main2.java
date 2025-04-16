/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author rizky
 */
public class Main2 {
    public static void main(String[] args) {
        MataKuliah mk1 = new MataKuliah("SI101", "Pemrograman Basis Objek", 3);
        mk1.tampilkanInfo();

        MataKuliah mk2 = new MataKuliah("SI102", "Pemrograman Basis Web", 2);
        mk2.tampilkanInfo();

        // Validasi SKS menggunakan method statis
        System.out.println("Apakah SKS 3 valid? " + MataKuliah.isValidSKS(3));
        System.out.println("Apakah SKS 4 valid? " + MataKuliah.isValidSKS(4));
    }
}
