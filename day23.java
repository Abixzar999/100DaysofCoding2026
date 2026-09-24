import java.util.Scanner;
public class days23 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan panjang sisi persegi
        System.out.print("Masukkan sisi persegi : ");

        //menghitung luas persegi
        int sisi = input.nextInt();
        int luas = sisi * sisi;

        //Menampilkan hasil luas persegi
        System.out.println("Luas persegi adalah : " + luas);

        // Latihan: Program untuk menghitung luas persegi.
        
    }
}
