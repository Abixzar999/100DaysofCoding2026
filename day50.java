
import java.util.Scanner;

public class days50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Memasukkan angka
        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();

        // Menentukan genap atau ganjil menggunakan ternary
        String hasil = (angka % 2 == 0) ? "Genap" : "ganjil" ;
        
        // Menampilkan hasil
        System.out.println(hasil);

        // Latihan: Membuat Program Ganjil Genap menggunakan ternary
    }
}
