/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal1;

/**
 *
 * @author Hype AMD
 */
public class MahasiswaBeasiswa extends Mahasiswa { /*mewarisi kelas mahasiswa...atribut tambahan*/
    String jenisBeasiswa;

    public MahasiswaBeasiswa(String nama, String nim, String jenisBeasiswa) {
        super(nama, nim);
        this.jenisBeasiswa = jenisBeasiswa;
    }

    public void infoBeasiswa() {
        infoMahasiswa();
        System.out.println("Jenis Beasiswa: " + jenisBeasiswa);
    }
}
