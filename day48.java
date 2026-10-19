
import java.util.Scanner;

public class days48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan angka pertama
        System.out.print("Masukkan angka pertama : ");
        double angka1 = input.nextDouble();
        

        // Memasukkan angka kedua
        System.out.print("Masukkan angka kedua : ");
        double angka2 = input.nextDouble();

        // Menampilkan pilihan kalkulator
        System.out.println("\n=== KALKULATOR ===");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagi (/)");
        
        // Petunjuk pemilihan operator aritmetika
        System.out.println("Pilih salah satu operasi (1-4)\n");

        // Memasukkan pilihan operator yaitu salah satu dari 1 - 4
        System.out.print("Pilih : ");
        int pilih = input.nextInt();

        // Memeriksa pilihan yang dimasukkan dan case dipilih akan memlakukan operatornya
        switch (pilih) {
            case 1 :
            System.out.println("hasil : " + (angka1 + angka2));
            break;

            case 2 :
            System.out.println("hasil : " + (angka1 - angka2));
            break;

            case 3 :
            System.out.println("hasil : " + (angka1 * angka2));
            break;

            case 4 :
            // Memeriksa apakah angka kedua bukan nol
            if (angka2 != 0) {
                // Jika bukan nol, lakukan pembagian
                System.out.println("hasil : " + (angka1 / angka2));
            } else {
                System.out.println("Tidak bisa dibafi 0");
            }
            break;

            default :
            System.out.println("Pilihan tidak valid");


        }

        // Latihan: Membuat Kalkulator Menggunakan Switch-case


    }
}
