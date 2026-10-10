import java.util.Scanner;
public class days39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Memasukkan angka untuk melakukan kalkulator nanti
        System.out.print("Masukkan angka pertama : ");
        int angka1 = input.nextInt();
        System.out.print("Masukkan angka kedua : ");
        int angka2 = input.nextInt();

        // Menampilkan pilihan operator yang mau digunakan
        System.out.println("");
        System.out.println("1. tambah (+) ");
        System.out.println("2. kurang (-) ");
        System.out.println("3. kali (*) ");
        System.out.println("4. bagi (/) ");

        // Memilih salah satu operator pilihan 1-4
        System.out.print("Pilih operasi : ");
        int pilih = input.nextInt();
        System.out.println("");


        // Memeriksan pilihan dan melakukan operator aritmatika
        if (pilih == 1) {
            System.out.println("Hasil : "+ (angka1 + angka2));
        } else if (pilih == 2) {
            System.out.println("Hasil : "+ (angka1 - angka2));
        } else if (pilih == 3) {
            System.out.println("Hasil : "+ (angka1 * angka2));
        } else if (pilih == 4) {
            if (angka2 != 0) {
                System.out.println("Hasil : "+ (angka1 / angka2));
            } else {
                System.out.println("Tidak bisa membagi dengan nol!");
            }
        } else {
            System.out.println("Pilihan tidak valid");
        }

        // Latihan: Membuat Kalkulator menggunakan if


    }
}
