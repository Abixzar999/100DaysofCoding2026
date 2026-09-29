import java.util.Scanner;

public class days28 {
    public static void main(String []args){

        Scanner input = new Scanner(System.in);

        // Memasukkan angka
        System.out.print("Masukkan angka : ");
        int a = input.nextInt();
        System.out.print("Masukkan angka : ");
        int b = input.nextInt();

        // Melakukan perbandingan sama dengan sekaligus menampilkan hasil
        System.out.println("Operator perbandingan a == b : " + (a == b));

        // Melakukan perbandingan tidak sama dengan sekaligus menampilkan hasil
        System.out.println("Operator perbandingan a != b : " + (a != b));

        // Operator Perbandingan == dan !=
    }
}
