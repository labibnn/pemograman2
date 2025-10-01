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
import java.util.Scanner;

public class SistemPenilaian {
    static final int MAX_SISWA = 50;
    static Siswa[] daftarSiswa = new Siswa[MAX_SISWA];
    static int jumlahSiswa = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            tampilkanMenu();
            pilihan = Integer.parseInt(scanner.nextLine());

            switch (pilihan) {
                case 1:
                    tambahSiswa();
                    break;
                case 2:
                    tampilkanSiswa();
                    break;
                case 0:
                    System.out.println("Terima kasih, program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }

    public static void tampilkanMenu() {
        System.out.println("\n=== MENU SISTEM PENILAIAN ===");
        System.out.println("1. Tambah Data Siswa");
        System.out.println("2. Tampilkan Data Siswa");
        System.out.println("0. Keluar");
        System.out.print("Pilih: ");
    }

    public static void tambahSiswa() {
        if (jumlahSiswa >= MAX_SISWA) {
            System.out.println("Data siswa sudah penuh.");
            return;
        }

        System.out.print("Masukkan nama siswa: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan nilai siswa: ");
        double nilai = Double.parseDouble(scanner.nextLine());

        daftarSiswa[jumlahSiswa] = new Siswa(nama, nilai);
        jumlahSiswa++;

        System.out.println("Data siswa berhasil ditambahkan.");
    }

    public static void tampilkanSiswa() {
        if (jumlahSiswa == 0) {
            System.out.println("Belum ada data siswa.");
            return;
        }

        System.out.println("\n=== DATA SISWA ===");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println((i + 1) + ". " + daftarSiswa[i].toString());
        }
    }
}
