package pert12;

public class persegiPanjang extends bangunDatar {

  // atribute
  public double panjang, lebar;

  @Override
  public double hitungLuas() {
    double luas = this.panjang * this.lebar;
    return luas;
  }

  @Override
  public double hitungKeliling() {
   double keliling = 2 * (this.panjang + this.lebar);
   return keliling;
  }
  
}
