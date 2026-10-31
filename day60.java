import java.util.Scanner;
public class days60 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Memasukkan angka untuk N
        System.out.print("Masukkan angka N : ");
        int n = input.nextInt();


        // Tempat menyimpan hasil penjumlahan
        int total = 0;

        // Menghitung angka dari 1 sampai N
        for (int i = 1; i <= n;i++) {
            total = total + i;
        }

        // Menampilkan hasil
        System.out.println("Hasil penjumlahan : " + total);



        // Latihan: Menjumlahkan angka 1-N
    }
}
