package UAS.Nomor1;

public class Main {
    public static void main(String[] args) {
        karyawan k = new karyawan();
        System.out.println(k.NIK = 220010117);
        System.out.println(k.nama = "Arya Zaki");
        System.out.println(k.jabatan = "Karyawan");
        System.out.println("NIK: " + k.NIK);
        System.out.println("Nama: " + k.nama);
        System.out.println("Jabatan: " + k.jabatan);
        k.gaji();

        System.out.println("\n");
        
        kepalaBagian kabag = new kepalaBagian();
        kabag.NIK = 220010118;
        kabag.nama = "Budi Santoso";
        kabag.jabatan = "Kepala Bagian";
        System.out.println("NIK: " + kabag.NIK);
        System.out.println("Nama: " + kabag.nama);
        System.out.println("Jabatan: " + kabag.jabatan);
        kabag.gaji();
        
        System.out.println("\n");

        Direktur dir = new Direktur();
        dir.NIK = 220010119;
        dir.nama = "Cindy Putri";
        dir.jabatan = "Direktur";
        System.out.println("NIK: " + dir.NIK);
        System.out.println("Nama: " + dir.nama);
        System.out.println("Jabatan: " + dir.jabatan);
        dir.gaji();
    }
}
