import java.util.Scanner;
public class days69 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Memasukkan jumlah baris
        System.out.print("Masukkan Jumlah baris : ");
        int n = input.nextInt();

        // Memasukkan jumlah kolom
        System.out.print("Masukkan jumlah kolom : ");
        int m = input.nextInt();

        // Perulangan untuk mengatur baris
        for (int i = 1;i <= n;i++){

            // Perulangan untuk mencetak bintang pada setiap baris
            for (int j = 1;j<=m;j++){
                System.out.print("* ");

            }

            // Pindah ke baris berikutnya
            System.out.println();
    
        }
     // Latihan: Membuat Pola Persegi Panjang
    }

    
}




