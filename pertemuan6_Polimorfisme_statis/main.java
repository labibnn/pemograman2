/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6_Polimorfisme_statis;

/**
 *
 * @author MyBook14F
 */
public class main {
    public static void main(String[] args) {
        Matematika m = new Matematika();

        System.out.println("Tambah 2 angka  : " + m.tambah(5, 3));
        System.out.println("Tambah 3 angka  : " + m.tambah(2, 3, 4));
        System.out.println("Tambah desimal  : " + m.tambah(2.5, 3.7));
    }
}