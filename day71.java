import java.util.Scanner;
public class days71 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int n = input.nextInt();

        // Perulangan luar untuk mengatur jumlah baris
        for(int i = 1; i <= n; i++){


            // Perulangan dalam untuk mencetak bintang
            // Dimulai dari nilai i sampai n
            for(int j = i;j<=n;j++){


                // Mencetak bintang tanpa pindah baris
                System.out.print("* ");
            }


                // pindah baris
            System.out.println();
        }


        // Latihan: Membuat Pola Segi Tiga Siku-Siku Terbalik
    }
}
