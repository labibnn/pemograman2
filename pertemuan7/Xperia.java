/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author MyBook14F
 */

public class Xperia implements Phone {

    private int volume = 25;

    @Override
    public void powerOn() {
        System.out.println("Sony Xperia menyala... Powered by Sony!");
    }

    @Override
    public void powerOff() {
        System.out.println("Sony Xperia dimatikan...");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("Volume Xperia: " + volume);
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("Volume Xperia: " + volume);
    }
}
