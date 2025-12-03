/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5_Interince;

/**
 *
 * @author MyBook14F
 */

class Kendaraan {
    String nama = "Mobil";
    int roda = 4;

    void info() {
        System.out.println("Nama: " + nama);
        System.out.println("Jumlah Roda: " + roda);
    }
}

class Mobil extends Kendaraan {
    String jenis = "INOVA";

    void tampil() {
        info();
        System.out.println("Jenis: " + jenis);
    }
}
