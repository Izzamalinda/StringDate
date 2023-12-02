import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TransaksiPenjualan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Masukkan No Faktur: ");
            int noFaktur = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Masukkan Nama Pelanggan: ");
            String namaPelanggan = scanner.nextLine();

            System.out.print("Masukkan No Hp: ");
            String noHp = scanner.nextLine();

            System.out.print("Masukkan Nama Barang: ");
            String namaBarang = scanner.nextLine();

            System.out.print("Masukkan Harga Barang: ");
            long hargaBarang = scanner.nextLong();

            System.out.print("Masukkan Jumlah Beli: ");
            int jumlahBeli = scanner.nextInt();

            System.out.print("Masukkan Nama Kasir: ");
            String namaKasir = scanner.nextLine();

            long totalBayar = hargaBarang * jumlahBeli;

            Date tanggalSekarang = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");

            System.out.println("MINIMARKETIbunda");
            System.out.println("----------------------------");
            System.out.println("No Faktur : " + noFaktur);
            System.out.println("Nama Pelanggan : " + namaPelanggan);
            System.out.println("No Hp : " + noHp);
            System.out.println("Nama Barang : " + namaBarang);
            System.out.println("Harga Barang : " + hargaBarang);
            System.out.println("Jumlah Beli : " + jumlahBeli);
            System.out.println("Total Bayar : " + totalBayar);
            System.out.println("Tanggal Transaksi : " + dateFormat.format(tanggalSekarang));
            System.out.println("Jam : " + timeFormat.format(tanggalSekarang));
            System.out.println("Kasir : " + namaKasir);
            System.out.println("----------------------------");
            System.out.println("Selamat Berbelanja:)");

        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Pastikan input data sesuai dengan tipe data yang benar.");
        } finally {
            scanner.close();
        }
    }
}
