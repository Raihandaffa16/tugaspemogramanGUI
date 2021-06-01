package com.company;

public class masukandata {
    private String Nama;
    private String tahunmasuk;
    private String jenjang;
    private String fakultas;
    private String jurusan;
    private String kelamin;
    private String urutan;

    public masukandata() {
    }

    public masukandata(String nama, String tahunmasuk, String jenjang, String fakultas, String jurusan, String kelamin, String urutan) {
        Nama = nama;
        this.tahunmasuk = tahunmasuk;
        this.jenjang = jenjang;
        this.fakultas = fakultas;
        this.jurusan = jurusan;
        this.kelamin = kelamin;
        this.urutan = urutan;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getTahunmasuk() {
        return tahunmasuk;
    }

    public void setTahunmasuk(String tahunmasuk) {
        this.tahunmasuk = tahunmasuk;
    }

    public String getJenjang() {
        return jenjang;
    }

    public void setJenjang(String jenjang) {
        this.jenjang = jenjang;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getKelamin() {
        return kelamin;
    }

    public void setKelamin(String kelamin) {
        this.kelamin = kelamin;
    }

    public String getUrutan() {
        return urutan;
    }

    public void setUrutan(String urutan) {
        this.urutan = urutan;

    }

    @Override
    public String toString() {
        return "masukandata{" +
                "Nama='" + Nama + '\'' +
                ", tahunmasuk='" + tahunmasuk + '\'' +
                ", jenjang='" + jenjang + '\'' +
                ", fakultas='" + fakultas + '\'' +
                ", jurusan='" + jurusan + '\'' +
                ", kelamin='" + kelamin + '\'' +
                ", urutan='" + urutan + '\'' +
                '}';
    }
}


