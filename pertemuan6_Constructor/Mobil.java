/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6_Constructor;

/**
 *
 * @author MyBook14F
 */
class Mobil {
    String merk;
    int tahun;

    // Constructor
    Mobil(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }

    void tampil() {
        System.out.println("Merk Mobil : " + merk);
        System.out.println("Tahun      : " + tahun);
    }
}
