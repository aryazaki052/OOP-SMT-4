package mahasiswa;

public class Main {
  public static void main(String[] args) {
    Mahasiswa arya = new Mahasiswa();
    arya.nama = "Arya";
    arya.nim = "220010117";
    arya.bayar();

    MhsEksekutif agus = new MhsEksekutif();
    agus.nama = "Agus";
    agus.nim = "220010116";
    agus.bayar();
    agus.permisiKerja();
    
  }
}
