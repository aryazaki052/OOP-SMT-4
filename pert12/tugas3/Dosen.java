package pert12.tugas3;

public class Dosen extends Person {
  private String nidn;
  private String departemen;

  public Dosen() {
    super();
    this.nidn = "";
    this.departemen = "";
  }

  public void setNidn() {
    this.nidn = "01";
  }

  public void setDepartemen() {
    this.departemen = "Sistem Komputer";
  }

  @Override
  public void introduce() {
    System.out.println("Halo, nama saya " + nama + ", saya adalah dosen dengan NIDN " + nidn + " dari departemen " + departemen + ".");
  }

  public void mengajar() {
    System.out.println("Saya sedang mengajar mata kuliah.");
  }
}
