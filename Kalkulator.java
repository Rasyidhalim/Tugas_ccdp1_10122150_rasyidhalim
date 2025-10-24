package com.proyek;

/**
 * Kelas Kalkulator sederhana untuk operasi aritmatika dasar.
 * Kelas ini menyediakan metode untuk menambah, mengurangi,
 * mengali, dan membagi dua bilangan bulat.
 *
 * @acid
 * @version 1.0
 * @since 2025-10-24
 */
public class Kalkulator {

    /**
     * Metode untuk menjumlahkan dua bilangan bulat.
     *
     * @param a Bilangan bulat pertama (angka yang akan ditambah).
     * @param b Bilangan bulat kedua (angka penambah).
     * @return int Hasil penjumlahan dari a dan b.
     */
    public int tambah(int a, int b) {
        return a + b;
    }

    /**
     * Metode untuk mengurangkan dua bilangan bulat.
     *
     * @param a Bilangan bulat pertama (angka yang akan dikurangi).
     * @param b Bilangan bulat kedua (angka pengurang).
     * @return int Hasil pengurangan dari a oleh b.
     */
    public int kurang(int a, int b) {
        return a - b;
    }

    /**
     * Metode untuk membagi dua bilangan bulat.
     *
     * @param a Bilangan bulat pertama (pembilang).
     * @param b Bilangan bulat kedua (penyebut).
     * @return double Hasil pembagian dari a oleh b.
     * @throws ArithmeticException jika penyebut (b) adalah nol.
     */
    public double bagi(int a, int b) {
        if (b == 0) {
            // Melempar exception jika terjadi pembagian dengan nol
            throw new ArithmeticException("Tidak bisa membagi dengan nol");
        }
        return (double) a / b;
    }
}