import java.util.Scanner;
public class days19 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan angka
        System.out.print("Masukkan angka: ");
        float a = input.nextFloat();

        // Mengubah tipe data float menjadi byte dengan casting
        byte hasil = (byte) a;
        System.out.println("Hasil konversi: " + hasil);

        // Konversi Manual/Paksa ( Dari Tipe Data Besar ke Kecil )
        // batas byte -128 sampai 127, jika melebihi batas maka akan terjadi overflow
        // Casting adalah proses mengubah tipe data dari satu tipe ke tipe lain secara manual.
    }
}      
