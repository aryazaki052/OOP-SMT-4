package UAS.Nomor1;

public class karyawan {
  public int NIK;
  public String nama;
  public String jabatan;

  public final int hariKerja = 5;
  public final int jamKerja = 8;
  public final int gajiPokok= 30000;
  public int gajiKaryawan = (hariKerja * jamKerja) * gajiPokok;

  public void gaji(){
     System.out.println("Gaji Karyawan adalah " + gajiKaryawan);
  }

}
