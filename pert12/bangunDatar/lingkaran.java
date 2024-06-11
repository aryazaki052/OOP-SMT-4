package pert12.bangunDatar;

public class lingkaran extends bangunDatar{

  public final double pi = 3.14;
  public double r;
  @Override
  public double hitungLuas() {
    double luas = pi * r * r;
    return luas; 
  }

  @Override
  public double hitungKeliling() {
   double keliling = 2 * pi * r;
   return keliling;
  }

  
}
