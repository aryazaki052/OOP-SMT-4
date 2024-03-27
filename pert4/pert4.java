// package pert4;

// import java.util.Scanner;

import java.util.Scanner;

public class pert4 {
  // public static void main(String[] args) {
  // // declare variabel
  // int panjangPersegiPajang;
  // int lebarPersegiPanjang;
  // Scanner ipt = new Scanner(System.in);

  // // Catch the input from user
  // System.out.println("Masukan Panjang Persegi Panjang");
  // panjangPersegiPajang = ipt.nextInt();

  // System.out.println("Masukan Lebar Persegi Panjang");
  // lebarPersegiPanjang = ipt.nextInt();

  // // print output
  // System.out.println(panjangPersegiPajang + lebarPersegiPanjang);
  // }

  public static void main(String[] args) {
    // declare variabel
    int hargaBarang;
    double ppn = 0.11;
    double hargaAkhir;
    Scanner ipt = new Scanner(System.in);
    
    // catch the value from user
    System.out.println("Masukan Harga Dasar Barang");
    hargaBarang = ipt.nextInt();

    // show output
    hargaAkhir = hargaBarang * ppn;
    double totalHarga = hargaBarang + hargaAkhir;
    System.out.println(totalHarga);

    ipt.close();
  }
}
