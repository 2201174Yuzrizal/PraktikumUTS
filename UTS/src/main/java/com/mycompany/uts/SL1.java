/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts;

import java.util.Scanner;

public class SL1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Masukkan bilangan bulat tiga digit: ");
        int number = scanner.nextInt();
        
        
        if (isPalindrome(number)) {
            System.out.println(number + " adalah bilangan palindrom.");
        } else {
            System.out.println(number + " bukan bilangan palindrom.");
        }
        
        scanner.close();
    }
    
    
    public static boolean isPalindrome(int number) {
        
        int digit1 = number / 100;         
        int digit3 = number % 10;         
        
       
        return digit1 == digit3;
    }
}
