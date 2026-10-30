
import java.util.Scanner;

public class days59 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan angka M
        System.out.print("Masukkan angka untuk M : ");
        int m = input.nextInt();

        // Memasukkan batas angka N
        System.out.print("Masukkan angka untuk N : ");
        int n = input.nextInt();


        // Mencetak kelipatan M dari 1 sampai N
        System.out.println("Bilangan kelipatan " + m + " : ");
        
        for (int i = 1; i <= n; i++) {
            // Memeriksa apakah i habis dibagi M
            if (i % m == 0) {
                System.out.print(i + " ");
            }
        }

      // Latihan: Mencetak bilangan kelipatan M dari 1-N
    }
}
