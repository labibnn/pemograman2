/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5_Overiding_pada_Inheritance;

/**
 *
 * @author MyBook14F
 */
public class main {
    public static void main(String[] args) {
        Hewan h1 = new Hewan();
        Hewan h2 = new Kucing();
        Hewan h3 = new Anjing();
        Hewan h4 = new Sapi();
        
        h1.suara();
        h2.suara();
        h3.suara();
        h4.suara();
    }
}