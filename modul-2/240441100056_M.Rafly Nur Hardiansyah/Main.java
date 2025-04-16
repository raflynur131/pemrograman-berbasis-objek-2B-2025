/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author rizky
 */
public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Isma", "2311000111", "Informatika");
        mhs1.tambahMataKuliah("Pemrograman Java");
        mhs1.tambahMataKuliah("Struktur Data");
        mhs1.tampilkanBiodata();
                
        Mahasiswa mhs2 = new Mahasiswa("Rafly", "2311000222", "Informatika");
        mhs2.tambahMataKuliah("Pemrograman Java");
        mhs2.tambahMataKuliah("Struktur Data");
        mhs2.tampilkanBiodata();
        
        Mahasiswa mhs3 = new Mahasiswa("Hudin", "2311000333", "Informatika");
        mhs3.tambahMataKuliah("Pemrograman Java");
        mhs3.tambahMataKuliah("Struktur Data");
        mhs3.tampilkanBiodata();

        Mahasiswa mhs4 = new Mahasiswa("Fahri", "2311000444", "Sistem Informasi");
        mhs4.tambahMataKuliah("Basis Data");
        mhs4.tampilkanBiodata();
        
        Mahasiswa mhs5 = new Mahasiswa("Yoga", "2311000555", "Sistem Informasi");
        mhs5.tambahMataKuliah("Basis Data");
        mhs5.tampilkanBiodata();
        
        Mahasiswa mhs6 = new Mahasiswa("Haidar", "2311000666", "Sistem Informasi");
        mhs6.tambahMataKuliah("Basis Data");
        mhs6.tampilkanBiodata();

        Mahasiswa.tampilkanTotalMahasiswa();

        // Contoh validasi NIM
        System.out.println("Validasi NIM '2311111111': " + Mahasiswa.isValidNIM("2311111111"));
        System.out.println("Validasi NIM '2311111111': " + Mahasiswa.isValidNIM("2311111111"));
        System.out.println("Validasi NIM '2311111111': " + Mahasiswa.isValidNIM("2311111111"));
        System.out.println("Validasi NIM '221111': " + Mahasiswa.isValidNIM("221111"));
        System.out.println("Validasi NIM '221111': " + Mahasiswa.isValidNIM("221111"));
        System.out.println("Validasi NIM '221111': " + Mahasiswa.isValidNIM("221111"));
    }
}

