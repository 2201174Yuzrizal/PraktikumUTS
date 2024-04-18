/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts;

import java.util.Scanner;

public class SL2a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat: ");
        int i = scanner.nextInt();

        for (int row = 1; row <= i; row++) {
            for (int j = 1; j <= row; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        scanner.close();
    }
}