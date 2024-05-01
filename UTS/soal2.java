package UTS;

import java.util.Scanner;

public class soal2 {
  public static void main(String[] args) {
    //deklrasi variabel
    int hargaBeli;
    double diskon;
    int cas = 1000; 
    double hargaTotal;
    Scanner ipt = new Scanner(System.in);

    // input harga barang
    System.out.println("Masukan harga barang: ");
    hargaBeli = ipt.nextInt();
  
    // kondisi jika lebih atau kurang dari 50000
    if (hargaBeli > 50000) {
      diskon = 0.25 * hargaBeli;
      hargaTotal = (hargaBeli - diskon) + cas;
      System.out.println("Harga setelah diskon = " + hargaTotal);
    }else{
      System.out.println("Harga akhir nya adalah = " + hargaBeli);
    }

  
    ipt.close();
  }
}
