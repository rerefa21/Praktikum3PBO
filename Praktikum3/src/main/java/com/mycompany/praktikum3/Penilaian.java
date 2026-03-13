/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum3;

/**
 *
 * @author anindya
 */
public class Penilaian {
    private String namaMhs;
    private double nilaiTugas;
    private double nilaiUjian;

    public Penilaian(String nama, double nTugas, double nUjian) {
        this.namaMhs = nama;
        this.nilaiTugas = nTugas;
        this.nilaiUjian = nUjian;
    }

    public String getNamaMhs() { return namaMhs; }
    public void setNamaMhs(String nama) { this.namaMhs = nama; }

    public double getNilaiTugas() { return nilaiTugas; }
    public void setNilaiTugas(double nTugas) { this.nilaiTugas = nTugas; }

    public double getNilaiUjian() { return nilaiUjian; }
    public void setNilaiUjian(double nUjian) { this.nilaiUjian = nUjian; }

    public double hitungRataRata() {
        return (nilaiTugas + nilaiUjian) / 2;
    }

    public void cetakHasil(String mataKuliah) {
        System.out.println("Nama Mahasiswa : " + namaMhs);
        System.out.println("Mata Kuliah : " + mataKuliah);
        System.out.println("Nilai Akhir : " + hitungRataRata());
        System.out.println();
    }

    public void cetakHasil(int sks) {
        System.out.println("Nama Mahasiswa : " + namaMhs);
        System.out.println("Beban SKS : " + sks + " SKS");
        System.out.println("Nilai Akhir : " + hitungRataRata());
        System.out.println();
    }
    
     public static void main(String[] args) {
        Penilaian mhs1 = new Penilaian("Gojo", 85.0, 90.0);
        Penilaian mhs2 = new Penilaian("Geto", 70.0, 60.0);

        System.out.println("--- Laporan 1 ---");
        mhs1.cetakHasil("Pemrograman Berorientasi Objek");

        System.out.println("--- Laporan 2 ---");
        mhs2.cetakHasil(3);
    }
}
