package pert14.perpustakaan;

public class Buku extends Koleksi {
  public int isbn;

  public void pinjam(){
    System.out.println("buku dengan id:");
    System.out.println(this.id);
    System.out.println(this.judul);
    System.out.println(this.Pengarang);
    System.out.println("Bisa Dipinjam");

  }
}
