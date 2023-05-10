/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanuts;

/**
 *
 * @author Acer
 */
public class Tayo {
    String merekMobil = "Tayo";
    String warnaMobil = "Biru";
    int jumlahBan = 6;
    String Plat = "BM 1234 TIF";
    
    void methodPertama(){
        System.out.println("Merek mobil : " + merekMobil);
        System.out.println("Warna mobil : " + warnaMobil);
        System.out.println("Jumlah ban : " + jumlahBan);
        System.out.println("No plat : " + Plat);
    }
   
  
    String tampil (){
    return "Menghitung jarak tempuh tayo";
}

int jarak (int kecepatan, int waktu){
    int total = kecepatan*waktu;
    return total ;
}        
}
