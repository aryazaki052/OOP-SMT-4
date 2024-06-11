package pert12.tugas3;

public class Main {
  public static void main(String[] args) {
    // Membuat objek dosen
    Dosen dosen1 = new Dosen();
    dosen1.setNama();
    dosen1.setAlamat();
    dosen1.setNidn();
    dosen1.setDepartemen();

    // Membuat objek mata kuliah
    mataKuliah mk1 = new mataKuliah();
    mk1.setKodeMk();
    mk1.setNamaMk();
    mk1.setSks();

    // Membuat objek mahasiswa
    Mahasiswa mahasiswa1 = new Mahasiswa();
    mahasiswa1.setNama();
    mahasiswa1.setAlamat();
    mahasiswa1.setNim();
    mahasiswa1.setJurusan();

    // Menampilkan informasi dan melakukan aktivitas
    mahasiswa1.introduce();
    mahasiswa1.belajar();
    dosen1.introduce();
    dosen1.mengajar();
    System.out.println(mk1.getInfo());
  }
}
