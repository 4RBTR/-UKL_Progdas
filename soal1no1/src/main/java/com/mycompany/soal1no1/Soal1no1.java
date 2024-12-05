/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.soal1no1;

import java.util.Scanner;

/**
 *
 * @author LOQ 11
 */
public class Soal1no1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//         Menginput jumlah barang
        System.out.print("Masukkan jumlah barang: ");
        int jumlahBarang = scanner.nextInt();

//         Membuat array untuk menyimpan nama dan harga barang
        String[] namaBarang = new String[jumlahBarang];
        double[] hargaBarang = new double[jumlahBarang];

//         Menginput nama dan harga setiap barang
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.print("Masukkan nama barang ke-" + (i + 1) + ": ");
            namaBarang[i] = scanner.next();
            System.out.print("Masukkan harga barang ke-" + (i + 1) + ": Rp ");
            hargaBarang[i] = scanner.nextDouble();
        }

//         Buat meminta informasi keanggotaan
        System.out.print("Apakah Anda memiliki member card? (y/n): ");
        char memberCard = scanner.next().charAt(0);

        double diskonMember = 0;
        if (memberCard == 'y' || memberCard == 'Y') {
            System.out.print("Sudah berapa lama Anda menjadi member (dalam bulan): ");
            int lamaKeanggotaan = scanner.nextInt();
            diskonMember = hitungDiskonMember(lamaKeanggotaan);
        }

//        Buat menghitung total belanja
        double totalBelanja = hitungTotalBelanja(hargaBarang);

//        Buat menghitung diskon dasar
        double diskonDasar = hitungDiskon(totalBelanja);

//        Buat menghitung total diskon
        double totalDiskon = diskonDasar + diskonMember;

//        buat menghitung total bayar
        double totalBayar = totalBelanja - (totalBelanja * totalDiskon);

//         Menampilkan struk belanja
        System.out.println("Struk Belanja");
        System.out.println("=================");
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println(namaBarang[i] + ": Rp " + hargaBarang[i]);
        }
        System.out.println("Total Belanja: Rp " + totalBelanja);
        System.out.println("Diskon Dasar: " + (diskonDasar * 100) + "%");
        System.out.println("Diskon Member: " + (diskonMember * 100) + "%");
        System.out.println("Total Diskon: " + (totalDiskon * 100) + "%");
        System.out.println("Total Bayar: Rp " + totalBayar);
    }

//     Method buat menghitung total belanja
    public static double hitungTotalBelanja(double[] harga) {
        double total = 0;
        for (double hargaBarang : harga) {
            total += hargaBarang;
        }
        return total;
    }

//     Method buat menghitung diskon dasar
    public static double hitungDiskon(double totalBelanja) {
        if (totalBelanja >= 200000) {
            return 0.2;
        } else if (totalBelanja >= 100000) {
            return 0.1;
        } else {
            return 0;
        }
    }

//     Method buat menghitung diskon member
    public static double hitungDiskonMember(int lamaKeanggotaan) {
        if (lamaKeanggotaan >= 12) {
            return 0.05; // Diskon tambahan 5% untuk member 1 tahun ke atas
        } else if (lamaKeanggotaan >= 6) {
            return 0.03; // Diskon tambahan 3% untuk member 6-11 bulan
        } else if (lamaKeanggotaan >= 1) {
            return 0.01; // Diskon tambahan 1% untuk member 1-5 bulan;
        } else {
            return 0;
        }
    }
}
