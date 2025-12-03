/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author MyBook14F
 */

public class Infinix implements Phone {

    private int volume = 20;

    @Override
    public void powerOn() {
        System.out.println("Infinix menyala... Hello!");
    }

    @Override
    public void powerOff() {
        System.out.println("Infinix dimatikan...");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("Volume Infinix: " + volume);
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("Volume Infinix: " + volume);
    }
}

