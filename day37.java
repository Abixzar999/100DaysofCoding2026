import java.util.Scanner;
public class days37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan angka
        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();

        // Mengecek apakah lebih dari 0
        if (angka > 0) {
            System.out.println("Positif");
        
        // Mengecek apakah kuraang dari 0
        } else if (angka < 0) {
            System.out.println("Negatif");

        // Jika bukan negatif dan positif maka menampilkan 0
        } else {
            System.out.println("Nol");
        }

        // Latihan: Menentukan bilangan positif, negatif dan nol

    }
}
