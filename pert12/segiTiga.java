package pert12;

public class segiTiga extends bangunDatar
 {
public double alas, tinggi;
  @Override
  public double hitungLuas() {
   double luas = 0.5 * alas * tinggi;
   return luas;
  }

  @Override
  public double hitungKeliling() {
    double keliling = alas * tinggi * this.sisimiring();
    return keliling;
  }
  
  public double sisimiring(){
    double sisiMiring = Math.sqrt(Math.pow(this.alas, 2) + Math.pow(this.tinggi, 2));
    return sisiMiring;
  }
}
