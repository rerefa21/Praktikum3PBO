/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum3;

/**
 *
 * @author anindya
 */
public class BarangElektronik {
    private String kodeBarang;
    private String namaBarang;
    private double hargaSatuan;
    private int jumlahBeli;

    public BarangElektronik(String kode, String nama, double harga, int jumlah) {
        this.kodeBarang = kode;
        this.namaBarang = nama;
        this.hargaSatuan = harga;
        this.jumlahBeli = jumlah;
    }

    public String getKodeBarang() { return kodeBarang; }
    public void setKodeBarang(String kode) { this.kodeBarang = kode; }

    public String getNamaBarang() { return namaBarang; }
    public void setNamaBarang(String nama) { this.namaBarang = nama; }

    public double getHargaSatuan() { return hargaSatuan; }
    public void setHargaSatuan(double harga) { this.hargaSatuan = harga; }

    public int getJumlahBeli() { return jumlahBeli; }
    public void setJumlahBeli(int jumlah) { this.jumlahBeli = jumlah; }

    public double hitungTotalHarga() {
        return hargaSatuan * jumlahBeli;
    }
    
     public static void main(String[] args) {
        BarangElektronik barang1 = new BarangElektronik("ELK-001", "Monitor LED 24 Inch", 1500000, 2);
        BarangElektronik barang2 = new BarangElektronik("ELK-002", "Keyboard Mekanikal", 850000, 5);

        System.out.println("--- Struk Barang Pertama ---");
        System.out.println("Kode: " + barang1.getKodeBarang());
        System.out.println("Nama: " + barang1.getNamaBarang());
        System.out.println("Total Bayar: Rp " + barang1.hitungTotalHarga());

        System.out.println("\n--- Struk Barang Kedua ---");
        System.out.println("Kode: " + barang2.getKodeBarang());
        System.out.println("Nama: " + barang2.getNamaBarang());
        System.out.println("Total Bayar: Rp " + barang2.hitungTotalHarga());
    }
}