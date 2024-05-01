package UTS;

import java.util.Scanner;

public class soal1 {
  public static void main(String[] args) {
    // inisialisasi harga barang
    double[] hargaBarang = {30000, 20000, 2000};
    Scanner ipt = new Scanner(System.in);

    // ambil total belanjaan dari pembeli
    double totalBelanja = 0;
    String[] items = {"wortel", "kentang", "kecap"};
    
    for (int i = 0; i < hargaBarang.length; i++) {
        System.out.println("Masukkan berat " + items[i] + " (kg): ");
        double berat = ipt.nextDouble();
        totalBelanja += berat * hargaBarang[i];
    }
    
// perhitungan diskon
    System.out.println("Masukan banyak Diskon = ");
    double diskon = ipt.nextDouble();
    double hargaAkhir = totalBelanja - diskon;
    System.out.println("Harga Akhir: " + hargaAkhir);
    


    ipt.close();
  }
}
