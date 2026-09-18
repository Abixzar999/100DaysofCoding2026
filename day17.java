import java.util.Scanner;

public class days17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan angka
        System.out.print("Masukkan angka: ");
        int a = input.nextInt();
        
        // Menambahkan 5 ke angka yang dimasukkan
        a += 5;
        System.out.println("Hasil penambahan 5 : " + a);

        // Mengurangkan 3 dari angka yang dimasukkan
        a -= 3;
        System.out.println("Hasil pengurangan 3 : " + a);

        // Mengalikan angka yang dimasukkan dengan 2
        a *= 2;
        System.out.println("Hasil perkalian 2 : " + a);

        // Membagi angka yang dimasukkan dengan 4
        a /= 4;
        System.out.println("Hasil pembagian 4 : " + a);

        // Menghitung sisa bagi dari angka yang dimasukkan dengan 3
        a %= 3;
        System.out.println("Hasil modulus 3 : " + a);

        // Operator penugasan (=, -=, dll)

        
    }
}
