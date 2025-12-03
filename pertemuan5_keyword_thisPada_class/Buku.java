/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5_keyword_thisPada_class;

/**
 *
 * @author MyBook14F
 */
class Buku {
    String judul;
    String penulis;

    // Constructor menggunakan keyword "this"
    Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    void tampilInfo() {
        System.out.println("Judul Buku   : " + this.judul);
        System.out.println("Penulis Buku : " + this.penulis);
    }
}
