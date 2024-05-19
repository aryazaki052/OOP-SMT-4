package tugas2;

public class Main {
  public static void main(String[] args) {
    
    // Membuat objek KaryawanTetap
    kartap karyawanTetap = new kartap();
    karyawanTetap.nama = "Budi";
    karyawanTetap.idKaryawan = "T001";
    karyawanTetap.posisi = "Manager";
    karyawanTetap.gaji = 8000000;

    // Menampilkan informasi karyawan tetap
    System.out.println("Karyawan Tetap: " + karyawanTetap.nama);
    System.out.println("ID: " + karyawanTetap.idKaryawan);
    System.out.println("Posisi: " + karyawanTetap.posisi);
    System.out.println("Gaji: " + karyawanTetap.gaji + "/n");
    karyawanTetap.departemen();
    karyawanTetap.bonustahunan();

    System.out.println();
    // Membuat objek KaryawanKontrak
    kartak karyawanKontrak = new kartak();
    karyawanKontrak.waktuKontrak = "01-01-2023 s.d 31-12-2023";

    // Menggunakan objek karyawan untuk atribut dasar
    karyawan karyawanDasar = new karyawan();
    karyawanDasar.nama = "Ani";
    karyawanDasar.idKaryawan = "K001";
    karyawanDasar.posisi = "Staff";
    karyawanDasar.gaji = 5000000;

    // Menampilkan informasi karyawan kontrak
    System.out.println("Karyawan Kontrak: " + karyawanDasar.nama);
    System.out.println("ID: " + karyawanDasar.idKaryawan);
    System.out.println("Posisi: " + karyawanDasar.posisi);
    System.out.println("Gaji: " + karyawanDasar.gaji);
    System.out.println("Waktu Kontrak: " + karyawanKontrak.waktuKontrak);
    karyawanDasar.departemen();
}
  }

