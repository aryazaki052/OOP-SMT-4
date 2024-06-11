package pert12.bangunDatar;

public class main {
  public static void main(String[] args) {
    persegiPanjang pp = new persegiPanjang();
    pp.panjang = 5;
    pp.lebar = 3;
    System.out.println(pp.hitungLuas());
    System.out.println(pp.hitungKeliling());

    lingkaran link = new lingkaran();
    link.r = 10;
    System.out.println(link.hitungLuas());
    System.out.println(link.hitungKeliling());

    segiTiga sss = new segiTiga();
    sss.alas = 10;
    sss.tinggi = 20;
    System.out.println(sss.hitungLuas());
    System.out.println(sss.hitungKeliling());
  }
}
