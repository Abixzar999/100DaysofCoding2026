
import java.util.Scanner;

public class day11 {

    public static void main(String[] args) {

        // Membuat Scanner untuk menerima input dari keyboard
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan nama
        System.out.print("Masukkan nama : ");
        String nama = input.nextLine();

        // Menampilkan nama yang sudah dimasukkan
        System.out.println("Halo, " + nama);

        // Meminta pengguna memasukkan asal
        System.out.println("Kalau boleh tau kamu dari mana?");
        String alamat = input.nextLine();

        // Menampilkan asal yang sudah dimasukkan
        System.out.println("Wah " + alamat + ", tempat yang bagus yah");

        // Meminta pengguna memasukkan umur
        System.out.print("btw Umur kamu sekarang sudah berapa? : ");
        int umur = input.nextInt();

        // Menampilkan umur yang sudah dimasukkan
        System.out.println("wah sudah " + umur + " yah!, Selamat ");

        // Menampilkan kembali data yang sudah dimasukkan dalam bentuk biodata
        System.out.println("");
        System.out.println("---Biodata---");
        System.out.println("Nama \t : " + nama);
        System.out.println("Alamat \t : " + alamat);
        System.out.println("Umur \t : " + umur);

    }
}
