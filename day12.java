
import java.util.Scanner;

public class days12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan nama
        System.out.print("Masukkan nama : ");
        String nama = input.nextLine();
        System.out.println("Hay " + nama + " mohon di isi data data berikutnya yah");

        // Meminta pengguna memasukkan alamat
        System.out.print("Alamat : ");
        String alamat = input.nextLine();

        // Meminta pengguna memasukkan umur
        System.out.print("Masukkan Umur : ");
        int umur = input.nextInt();

        //Meminta pengguna memasukkan tinggi badan
        System.out.print("Tinggi badan : ");
        double tinggi = input.nextDouble();

        // Menampilkan kembali data yang sudah dimasukkan dalam bentuk biodata
        System.out.println("===BIODATA===");
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Umur : " + umur);
        System.out.println("Tinggi badan : " + tinggi);

    }
}
