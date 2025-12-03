/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6_Setter_Getter;

/**
 *
 * @author MyBook14F
 */
public class main {
    public static void main(String[] args) {
        Buku b = new Buku();
        
        b.setJudul("Struktur Data");
        b.setPenulis("pak yanto");

        System.out.println("Judul Buku   : " + b.getJudul());
        System.out.println("Penulis Buku : " + b.getPenulis());
    }
}