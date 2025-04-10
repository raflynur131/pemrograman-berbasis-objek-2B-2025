/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul1;

import java.util.ArrayList;

class Hewan {
    String nama, jenis, suara;

    public String bersuara() {
        return nama + " mengeluarkan suara " + suara + ".";
    }

    public String info() {
        return nama + " adalah hewan jenis " + jenis + ".";
    }
}

class Kucing extends Hewan {
    String warna;

    public Kucing(String nama, String warna) {
        this.nama = nama;
        this.jenis = "Kucing";
        this.suara = "Meong";
        this.warna = warna;
    }

    public String info() {
        return nama + " adalah kucing berwarna " + warna + ".";
    }
}

class Sapi extends Hewan {
    String ras;

    public Sapi(String nama, String ras) {
        this.nama = nama;
        this.jenis = "Sapi";
        this.suara = "Moo-moo";
        this.ras = ras;
    }

    public String info() {
        return nama + " adalah sapi ras " + ras + ".";
    }
}

class Burung extends Hewan {
    boolean bisaTerbang;

    public Burung(String nama, boolean bisaTerbang) {
        this.nama = nama;
        this.jenis = "Burung";
        this.suara = "Cuit-cuit";
        this.bisaTerbang = bisaTerbang;
    }

    public String info() {
        String kemampuan = bisaTerbang ? "bisa terbang" : "tidak bisa terbang";
        return nama + " adalah burung yang " + kemampuan + ".";
    }
}

public class Soal3 {
    public static void main(String[] args) {
        ArrayList<Hewan> hewanList = new ArrayList<>();

        // Format data: nama, atribut_khusus, jenis
        Object[][] dataHewan = {
            {"PUTRA", "Hitam", "Kucing"},
            {"PUTRI", "JKT", "Sapi"},
            {"MESSI", true, "Burung"}
        };

        for (Object[] data : dataHewan) {
            String nama = (String) data[0];
            String jenis = (String) data[2];

            switch (jenis) {
                case "Kucing" -> hewanList.add(new Kucing(nama, (String) data[1]));
                case "Sapi" -> hewanList.add(new Sapi(nama, (String) data[1]));
                case "Burung" -> hewanList.add(new Burung(nama, (Boolean) data[1]));
            }
        }

        // Tampilkan info dan suara
        for (Hewan hewan : hewanList) {
            System.out.println(hewan.info());
            System.out.println(hewan.bersuara());
            System.out.println();
        }
    }
}
