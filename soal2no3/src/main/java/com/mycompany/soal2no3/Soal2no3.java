/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.soal2no3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LOQ 11
 */
public class Soal2no3 {

    // Fungsi buat melakukan operasi aritmatika
    public static int hitung(int bilangan1, int bilangan2, char operator) {
        switch (operator) {
            case '*':
                return bilangan1 * bilangan2;
            case '/':
                if (bilangan2 == 0) {
                    System.out.println("Tidak dapat membagi dengan nol.");
                    return 0;
                }
                return bilangan1 / bilangan2;
            case '%':
                return bilangan1 % bilangan2;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char operator;
        int bilangan1, bilangan2, jawaban, jawabanUser;
        boolean lanjut = true;

        while (lanjut) {
            bilangan1 = random.nextInt(10) + 1;
            bilangan2 = random.nextInt(10) + 1;
            double operasi = random.nextInt(3);
            operator = operasi == 0 ? '*' : operasi == 1 ? '/' : '%';

            System.out.print(bilangan1 + " " + operator + " " + bilangan2 + " = ");
            jawabanUser = scanner.nextInt();

            jawaban = hitung(bilangan1, bilangan2, operator);

            if (jawabanUser == jawaban) {
                System.out.println("Benar!");
            } else {
                System.out.println("Salah. Jawaban yang benar: " + jawaban);
            }

            System.out.print("Ingin melanjutkan? (yes/no): ");
            String pilihan = scanner.next();
            lanjut = pilihan.equalsIgnoreCase("yes");
        }

        System.out.println("Terima kasih udah mengikuti kuis !");
    }
}