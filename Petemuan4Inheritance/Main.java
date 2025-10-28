/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Petemuan4Inheritance;

/**
 *
 * @author MyBook14F
 */
public class Main {
    public static void main(String[] args) {
        Enemy moster = new Enemy();
        Zombie zumbi = new Zombie(); 
        Pocong pocongJawir = new Pocong();
        Burung tilang = new Burung();
        
        moster.attack();
        zumbi.walk();
        pocongJawir.jump();
        tilang.walk();
        tilang.jump();
        tilang.fly();
        
    }
}
