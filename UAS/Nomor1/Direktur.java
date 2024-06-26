package UAS.Nomor1;

public class Direktur extends karyawan {
    public int tunjangan = 2000000;
    public int komunikasi = 200000;

    public int gajiDirektur = gajiKaryawan + tunjangan + komunikasi;

    @Override
    public void gaji() {
        System.out.println("Gaji Direktur Adalah " + gajiDirektur);
        System.out.println("Dengan rincian:");
        System.out.println(tunjangan + " adalah tunjangan");
        System.out.println(komunikasi + " adalah tunjangan komunikasi");
        System.out.println(gajiKaryawan + " adalah gaji pokok");
    }
}
