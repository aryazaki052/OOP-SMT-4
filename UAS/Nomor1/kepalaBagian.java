package UAS.Nomor1;

public class kepalaBagian extends karyawan {
    public int tunjangan = 1000000;
    public int gajiKabag = gajiKaryawan + tunjangan;

    @Override
    public void gaji() {
        System.out.println("Gaji Kepala Bagian Adalah " + gajiKabag);
        System.out.println("Dengan rincian:");
        System.out.println(tunjangan + " adalah tunjangan");
        System.out.println(gajiKaryawan + " adalah gaji pokok");
    }
}
