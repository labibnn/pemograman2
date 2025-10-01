/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1_semester3;

/**
 *
 * @author pc9
 */
public class Siswa {
    private String nama;
    private double nilai;

    public Siswa(String nama, double nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public double getNilai() {
        return nilai;
    }

    public String getPredikat() {
        if (nilai >= 85) {
            return "A";
        } else if (nilai >= 70) {
            return "B";
        } else if (nilai >= 55) {
            return "C";
        } else {
            return "D";
        }
    }

    public String toString() {
        return "Nama: " + nama + ", Nilai: " + nilai + ", Predikat: " + getPredikat();
    }
}

