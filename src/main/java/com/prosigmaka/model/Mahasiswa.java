package com.prosigmaka.model;

import java.sql.Date;

public class Mahasiswa {
    private int nim;
    private String nama;
    private Date tanggalLahir;
    private String jurusan;
    private int tahunMasuk;

    public Mahasiswa(int nim, String nama, Date tanggalLahir, String jurusan, int tahunMasuk) {
        this.nim = nim;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.jurusan = jurusan;
        this.tahunMasuk = tahunMasuk;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
               "nim=" + nim +
               ", nama='" + nama + '\'' +
               ", tanggalLahir=" + tanggalLahir +
               ", jurusan='" + jurusan + '\'' +
               ", tahunMasuk=" + tahunMasuk +
               '}';
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(int tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }
}