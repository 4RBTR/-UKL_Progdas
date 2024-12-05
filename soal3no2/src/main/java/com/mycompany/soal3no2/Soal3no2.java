/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.soal3no2;

import java.util.Scanner;

/**
 *
 * @author LOQ 11
 */
public class Soal3no2 {

//     Fungsi buat mencari elemen negatif dan mengembalikan jumlahnya
    public static int hitungElemenNegatif(int[] array) {
        int jumlahNegatif = 0;
        for (int angka : array) {
            if (angka < 0) {
                jumlahNegatif++;
            }
        }
        return jumlahNegatif;
    }

//     Fungsi buat mencari elemen terbesar
    public static int cariElemenTerbesar(int[] array) {
        int terbesar = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > terbesar) {
                terbesar = array[i];
            }
        }
        return terbesar;
    }

//     Fungsi buat mencari elemen terkecil
    public static int cariElemenTerkecil(int[] array) {
        int terkecil = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < terkecil) {
                terkecil = array[i];
            }
        }
        return terkecil;
    }

//     Fungsi buat menghitung rata-rata
    public static double hitungRataRata(int[] array) {
        int jumlah = 0;
        for (int angka : array) {
            jumlah += angka;
        }
        return (double) jumlah / array.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan ukuran array: ");
        int ukuran = scanner.nextInt();

        int[] array = new int[ukuran];

        for (int i = 0; i < ukuran; i++) {
            array[i] = scanner.nextInt();
        }

        int jumlahNegatif = hitungElemenNegatif(array);
        int terbesar = cariElemenTerbesar(array);
        int terkecil = cariElemenTerkecil(array);
        double rataRata = hitungRataRata(array);

        System.out.println("Jumlah elemen negatif: " + jumlahNegatif);
        System.out.println("Elemen terbesar: " + terbesar);
        System.out.println("Elemen terkecil: " + terkecil);
        System.out.println("Rata-rata: " + rataRata);
    }
}
