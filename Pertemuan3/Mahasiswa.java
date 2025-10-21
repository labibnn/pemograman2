/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author MyBook14F
 */
public class Mahasiswa {
    String nim ="" ;
    String nama = "" ;
    double ipk =  0 ;
    String predikat = "" ;
    
 public Mahasiswa (String nim, String nama,double ipk){
     this.nim = nim ; 
     this.nama = nama ;
     this.ipk = ipk ;
         }
  void tampilData (){
      System.out.println(nim);
      System.out.println(nama);
      System.out.println(ipk);        
    }
  String predikat (){
    if (ipk >= 3.5){
        predikat = "cumlaude" ;  
    }
    else if (ipk >= 3.25){
             predikat = "sangat memuaskan" ;
    }
    return predikat ;
  }
  
  // Prosedur dengan parameter
  void nilaitambahan(double nilaitambah){
    ipk = ipk + nilaitambah ;  
  }
  
  // Fungsi dengan parameter (mengembalikan nilai)
  double hitungIPKBaru(double bonus){
    double ipkBaru = ipk + bonus;
    if (ipkBaru > 4.0){
        ipkBaru = 4.0; // batas maksimum IPK
    }
    return ipkBaru;
}

}

