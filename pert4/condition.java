// import java.util.Scanner;

import java.util.Scanner;

public class condition {
  // public static void main(String[] args) {
  //   // declare variable
  //   int angka; 
  //   Scanner ipt = new Scanner(System.in);

  //   // catch value from user
  //   System.out.println("Inputkan Bilangan:");
  //   angka = ipt.nextInt();

  //   // proces compare number
  //   if(angka % 2 == 0){
  //     System.out.println(angka + " Adalah Bilangan Genap");
  //   }else{
  //     System.out.println(angka + " Adalah Bilangan Ganjil");
  //   }

    
  //   ipt.close();
  // }

    public static void main(String[] args) {
      // declare variable
      int hargaBarang;
      double hargaDiskon = 0.0;
      int diskonMaksimal = 50000;
      Scanner ipt = new Scanner(System.in);
      final double PERSENDISC = 0.2;

      // catch value from the user
      System.out.println("Inputkan Harga Barang");
      hargaBarang = ipt.nextInt();

      // logic
      // jika harga barang diatas 100.000
      if (hargaBarang > 100000) {
          hargaDiskon = hargaBarang * PERSENDISC;
          // jika diskon lebih dari 50.000
          if (hargaDiskon > diskonMaksimal) {
              hargaDiskon = diskonMaksimal;
          }
          // print total mendapat diskon
          System.out.println("Anda Mendapatkan Diskon Sebesar " + hargaDiskon);
      } else {
          // Jika harga barang kurang dari atau sama dengan 40000, maka tidak ada diskon
          hargaDiskon = 0.0;
          System.out.println("Anda Belum Mencapai Minimal Belanja Untuk Mendapatkan Diskon, Silahkan Tambah Lagi " + (100000 - hargaBarang));
      }

      double hargaAkhir = hargaBarang - hargaDiskon;
      System.out.println("Harga Akhir nya adalah " + hargaAkhir);

      ipt.close();
  }

  // public static void main(String[] args) {
  //   // declare variable
  //   float beratPaket;
  //   double ongkosKirim = 0.0;

  //   // catch input from user
  //   Scanner ipt = new Scanner(System.in);
  //   System.out.println("Masukan Berat Barang (KG)");

  //   beratPaket = ipt.nextFloat();

  //   if (beratPaket <= 1) {
  //     ongkosKirim = 5000;
  //   }else if (beratPaket > 1) {
  //     ongkosKirim = 5000 + (beratPaket * 4000);    
  //   }

  //   System.out.println(ongkosKirim);
  //   ipt.close();
  // }
}
