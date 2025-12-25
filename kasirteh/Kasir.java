/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasirteh;

/**
 *
 * @author MyBook14F
 */

public class Kasir {

    // Method berparameter
    public int hitungTotal(Minuman teh, int jumlahBeli) {
        return teh.getHarga() * jumlahBeli;
    }

    public int hitungKembalian(int bayar, int total) {
        return bayar - total;
    }
}
