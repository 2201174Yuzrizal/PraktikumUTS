/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts;

import java.util.Scanner;

public class SL2d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Bilangan Bulat : ");
        int i = scanner.nextInt();

        for (int row = i; row >= 1; row--) {
            for (int space = 1; space <= i - row; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= row; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        scanner.close();
    }
}
