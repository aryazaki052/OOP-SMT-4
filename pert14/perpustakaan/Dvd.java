package pert14.perpustakaan;

public class Dvd extends Koleksi {
  public int durasi;

  public void putar(){
    System.out.println("dvd dengan id:");
    System.out.println(this.id);
    System.out.println(this.judul);
    System.out.println(this.Pengarang);
    System.out.println("Bisa Dipinjam");
  }
}
