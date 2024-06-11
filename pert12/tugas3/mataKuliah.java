package pert12.tugas3;

public class mataKuliah {
  public String kodeMk;
  public String namaMk;
  public int sks;

  public void MataKuliah() {
    this.kodeMk = "";
    this.namaMk = "";
    this.sks = 0;
  }

  public void setKodeMk() {
    this.kodeMk = "001";
  }

  public void setNamaMk() {
    this.namaMk = "PBO";
  }

  public void setSks() {
    this.sks = 4;
  }

  public String getInfo() {
    return "Kode MK: " + kodeMk + ", Nama MK: " + namaMk + ", SKS: " + sks;
  }
}
