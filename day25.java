import java.util.Scanner;

public class days25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan jari jari
        System.out.print("Masukkan jari - jari lingkaran : ");
        double jarijari = input.nextDouble();

        // Menghitung Luas lingkaran
        double luas = Math.PI * jarijari * jarijari;

        // Menampilkan hasil luas
        System.out.printf("Luas lingkaran: %.2f%n", luas);
    }
}
