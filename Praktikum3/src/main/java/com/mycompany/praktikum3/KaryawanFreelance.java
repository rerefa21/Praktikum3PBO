/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum3;

/**
 *
 * @author anindya
 */
public class KaryawanFreelance {
    private String idKaryawan;
    private String namaKaryawan;
    private String jabatan;
    private double upahPerJam;

    public KaryawanFreelance(String id, String nama, String jabatan, double upah) {
        idKaryawan = id;
        namaKaryawan = nama;
        this.jabatan = jabatan;
        upahPerJam = upah;
    }
    public String getIdKaryawan() {
        return idKaryawan;
    }
    public String getNamaKaryawan() {
        return namaKaryawan;
    }
    public String getJabatan() {
        return jabatan;
    }
    public double getUpahPerJam() {
        return upahPerJam;
    }
    public void setIdKaryawan(String id) {
        idKaryawan = id;
    }
    public void setNamaKaryawan(String nama) {
        namaKaryawan = nama;
    }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    public void setUpahPerJam(double upah) {
        upahPerJam = upah;
    }
    public double hitungGaji(int jamKerja) {
        return upahPerJam * jamKerja;
    }
    public double hitungGaji(double jamKerja) {
        return upahPerJam * jamKerja;
    }
    public double hitungGaji(int jamKerja, double bonusProject) {
        return (upahPerJam * jamKerja) + bonusProject;
    }
    
    public static void main(String[] args) {

        KaryawanFreelance k1 = new KaryawanFreelance("FRL-10","Andi","Web Programmer",100000);

        KaryawanFreelance k2 = new KaryawanFreelance("FRL-11","Budi","UI/UX Designer",85000);

        System.out.println("--- Data Karyawan 1 ---");
        System.out.println("Nama           : " + k1.getNamaKaryawan());
        System.out.println("Jabatan        : " + k1.getJabatan());
        System.out.println("Upah/Jam       : Rp " + k1.getUpahPerJam());

        double gajiPokok = k1.hitungGaji(40);
        System.out.println("Gaji Pokok (40 jam) : Rp " + gajiPokok);

        System.out.println("Bonus Project  : Rp 500000");

        double totalGaji = k1.hitungGaji(40, 500000);
        System.out.println("Total Gaji Akhir : Rp " + totalGaji);

        System.out.println();

        System.out.println("--- Data Karyawan 2 ---");
        System.out.println("Nama           : " + k2.getNamaKaryawan());
        System.out.println("Jabatan        : " + k2.getJabatan());
        System.out.println("Upah Awal/Jam  : Rp " + k2.getUpahPerJam());

        k2.setUpahPerJam(90000);
        System.out.println("-> Upah dinaikkan menjadi: Rp " + k2.getUpahPerJam());

        double gajiAkhir = k2.hitungGaji(35.5);
        System.out.println("Total Gaji Akhir (35.5 jam) : Rp " + gajiAkhir);
    }
}

