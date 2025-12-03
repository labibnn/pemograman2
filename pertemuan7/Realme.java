/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author MyBook14F
 */

public class Realme implements Phone {

    private int volume = 30;

    @Override
    public void powerOn() {
        System.out.println("Realme menyala... Start!");
    }

    @Override
    public void powerOff() {
        System.out.println("Realme dimatikan...");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("Volume Realme: " + volume);
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("Volume Realme: " + volume);
    }
}

