import java.util.Scanner;
public class eval2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Untuk memasukkan jarijari
        double jari = input.nextDouble();

        // Menghitung rumus
        double hasil = Math.PI * jari * jari;

        // Menampilkan hasil
        System.out.printf("%.2f", hasil);
        

    }
}
