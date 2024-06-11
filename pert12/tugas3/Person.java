package pert12.tugas3;

abstract public class Person {
  public String nama;
  public String alamat;

  public Person() {
    this.nama = "";
    this.alamat = "";
  }

  public void setNama() {
    this.nama = "Arya Zaki";
  }

  public void setAlamat() {
    this.alamat = "Renon";
  }

  public abstract void introduce();
}
