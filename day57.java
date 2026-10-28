import java.util.Scanner;
public class days57 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Memasukkan batas angka
        System.out.print("masukkan angka N : ");
        int n = input.nextInt();

        // Mencetak angka ganjil dari 1 sampai N
        System.out.println("Angka ganjil");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }


        System.out.println();


        // Mencetak angka genap dari 1 sampai N
        System.out.println("Angka genap");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        

        // Latihan: Mencetak angka ganjil 1-N dan angka genap 1-N
    }
}
