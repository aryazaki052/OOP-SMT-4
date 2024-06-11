package pert12.tugas3;

public class Mahasiswa extends Person {
  public String nim;
  public String jurusan;

  public Mahasiswa() {
    super();
    this.nim = "";
    this.jurusan = "";
  }

  public void setNim() {
    this.nim = "220010117";
  }

  public void setJurusan() {
    this.jurusan = "Sistem Komputer";
  }

  @Override
  public void introduce() {
    System.out.println("Halo, nama saya " + nama + ", saya adalah mahasiswa dengan NIM " + nim + " dari jurusan " + jurusan + ".");
  }

  public void belajar() {
    System.out.println("Saya sedang belajar mata kuliah.");
  }
}
