/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5_Overiding_pada_Inheritance;

/**
 *
 * @author MyBook14F
 */
class Hewan {
    void suara() {
        System.out.println("Hewan mengeluarkan suara...");
    }
}

class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Kucing: Meong!");
    }
}

class Anjing extends Hewan {
    @Override
    void suara() {
        System.out.println("Anjing: Guk Guk!");
    }
}

class Sapi extends Hewan {
    @Override
    void suara() {
        System.out.println("Sapi: Moo Moo!");
    }
}

