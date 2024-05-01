package pert5;

import java.util.Scanner;

public class pert5 {
    // public static void main(String[] args) {
    //     int deret = 2;
    //     for(int i = 0; i < 5; i++) {
    //         System.out.println(deret);
    //         deret = (deret*2);
    //         System.out.println(deret);
    //         deret = (deret-1);
    //     }
    // }

    public static void main(String[] args) {
      Scanner ipt = new Scanner(System.in);
      String pilih;
      
      do {
          System.out.println("Input Bilangan:");
          int bilangan = ipt.nextInt();
          
          System.out.print("Faktor dari " + bilangan + " adalah: ");
          for (int i = 1; i <= bilangan; ++i) {
              if (bilangan % i == 0) {
                  System.out.print(i + " ");
              }
          }
          
          System.out.println("\nIngin mencari faktor lagi? (y/n)");
          ipt.nextLine(); // Membersihkan newline di buffer
          pilih = ipt.nextLine();
      } while (pilih.equals ("y"));
      
      ipt.close();
      System.out.println("Program selesai.");
  }
}
