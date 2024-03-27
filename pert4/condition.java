import java.util.Scanner;

public class condition {
  public static void main(String[] args) {
    // declare variable
    int angka; 
    Scanner ipt = new Scanner(System.in);

    // catch value from user
    System.out.println("Inputkan Bilangan:");
    angka = ipt.nextInt();

    // proces compare number
    if(angka % 2 == 0){
      System.out.println(angka + " Adalah Bilangan Genap");
    }else{
      System.out.println(angka + " Adalah Bilangan Ganjil");
    }

    
    ipt.close();
  }
}
