/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts;

import java.util.Scanner;

public class SL4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Balok balok1 = new Balok(1, 1, 1);
        Balok balok2 = new Balok(30, 40, 50);
        Balok balok3 = new Balok(25, 35, 45);

       
        System.out.println("Balok dengan panjang : " + balok1.panjang + ", lebar : " + balok1.lebar + " dan tinggi : " + balok1.tinggi +
                ". Luasnya : " + balok1.getLuas() + ", sedangkan kelilingnya : " + balok1.getKeling() + " dan volumenya : " + balok1.getVolume());

        System.out.println("Balok dengan panjang : " + balok2.panjang + ", lebar : " + balok2.lebar + " dan tinggi : " + balok2.tinggi +
                ". Luasnya : " + balok2.getLuas() + ", sedangkan kelilingnya : " + balok2.getKeling() + " dan volumenya : " + balok2.getVolume());

        System.out.println("Balok dengan panjang : " + balok3.panjang + ", lebar : " + balok3.lebar + " dan tinggi : " + balok3.tinggi +
                ". Luasnya : " + balok3.getLuas() + ", sedangkan kelilingnya : " + balok3.getKeling() + " dan volumenya : " + balok3.getVolume());

        scanner.close();
    }
}

class Balok {
    int panjang;
    int lebar;
    int tinggi;

    
    public Balok() {
        panjang = 0;
        lebar = 0;
        tinggi = 0;
    }

  
    public Balok(int panjangBaru, int lebarBaru, int tinggiBaru) {
        panjang = panjangBaru;
        lebar = lebarBaru;
        tinggi = tinggiBaru;
    }

   
    public int getLuas() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }

    
    public int getKeling() {
        return 4 * (panjang + lebar + tinggi);
    }

    
    public int getVolume() {
        return panjang * lebar * tinggi;
    }
}
