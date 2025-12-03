/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author MyBook14F
 */

public class Vivo implements Phone {

    private int volume = 50;

    @Override
    public void powerOn() {
        System.out.println("Vivo menyala... Selamat datang!");
    }

    @Override
    public void powerOff() {
        System.out.println("Vivo dimatikan...");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("Volume Vivo: " + volume);
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("Volume Vivo: " + volume);
    }
}

