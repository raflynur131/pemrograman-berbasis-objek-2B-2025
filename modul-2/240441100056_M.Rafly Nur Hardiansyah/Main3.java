/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author rizky
 */
public class Main3 {
    public static void main(String[] args) {
        Kampus kampus1 = new Kampus("Universitas Trunojoyo Madura", "Jl. Telang Indah No. 1");
        Kampus.tambahMahasiswa();
        Kampus.tambahMahasiswa();

        Kampus.tampilkanInfoKampus(kampus1);

        // Cek validasi nama kampus
        System.out.println("Apakah 'Universitas 123' valid? " + Kampus.isValidNamaKampus("Universitas 123"));
        System.out.println("Apakah 'Institut Koding' valid? " + Kampus.isValidNamaKampus("Institut Koding"));
    }
}

