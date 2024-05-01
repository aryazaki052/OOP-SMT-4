package UTS;

public class soal3 {
    public static void main(String[] args) {
        // Variabel untuk menyimpan angka sebelumnya
        int angka = 1;

        // Cetak angka pertama
        System.out.print(angka + ", ");

        // Perulangan untuk menghasilkan pola
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 1) {
                // Jika i ganjil, kalikan angka dengan 2
                angka += 3;
            } else {
                // Jika i genap, tambahkan 3
                angka *= 2;
            }
            // Cetak hasil
            System.out.print(angka + ", ");
        }
    }
}
