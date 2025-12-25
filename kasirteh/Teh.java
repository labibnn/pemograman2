/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasirteh;

/**
 *
 * @author MyBook14F
 */

public class Teh implements Minuman {

    protected String nama;
    protected int harga;

    public Teh(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public int getHarga() {
        return harga;
    }
}

