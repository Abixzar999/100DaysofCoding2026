import java.util.Scanner;
public class days36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan angka
        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();

        // mengecek apakah angka habis dibagi 2 atau tidak
        if (angka % 2 == 0) {
            System.out.println("Bilangan genap");
        } else {
            System.out.println("Bilangan ganjil");
        }
     
        // Latihan: Menentukan bilangan ganjil atau genap
    }
}
