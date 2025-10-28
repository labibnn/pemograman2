/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4Modifier;

/**
 *
 * @author MyBook14F
 */
public class ClassUtama {
    public static void main(String[] args) {
    Mahasiswa m1 = new Mahasiswa ("2455201003", "Labib", 3.25);
    m1.nilaitambahan(0.1);
    m1.tampilData ();
    
    //Fungsi dgn Parameter
    double hasilBaru = m1.hitungIPKBaru(0.3);
    System.out.println("\nIPK baru (hasil fungsi): " + hasilBaru);
    System.out.println(m1.predikat ());      
    }
}