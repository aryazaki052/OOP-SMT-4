package mahasiswa;

public class Mahasiswa {
  public String nim;
  public String nama;
  public final int spp = 800000;

  public void bayar(){
    System.out.println(this.nim + " - " + this.nama + "membayar sebesar" + this.spp);
  }
}
