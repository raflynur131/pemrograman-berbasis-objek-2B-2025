/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal2;

/**
 *
 * @author Hype AMD
 */
public class Buku {
    String judul;
    String penulis;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public void info() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
    }
}
