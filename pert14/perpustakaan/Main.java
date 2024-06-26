package pert14.perpustakaan;

public class Main {
  public static void main(String[] args) {
    Buku buku = new Buku();
    buku.id = 12;
    buku.isbn = 123456;
    buku.judul = "OOP dasar";
    buku.Pengarang = "Zaki";
    buku.pinjam();

    System.out.println("\n");

    Dvd dvd = new Dvd();
    dvd.id = 2;
    dvd.judul = "OOP pemula";
    dvd.Pengarang = "Zaki";
    dvd.putar();
    }
}
