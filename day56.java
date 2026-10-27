import java.util.Scanner;

public class days56{
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);


        // Meminta pengguna memasukkan angka N
        System.out.print("Masukkan angka N : ");
        int n = input.nextInt();


        // Mencetak angka 1 sampai N
        System.out.println("Angka 1 sampai N : ");
        for (int i = 1; i <= n;i++) {
            System.out.println(i + " ");
        }

        System.out.println();


        // Mencetak angka N sampai 1
        System.out.println("Angka N sampai 1 : ");
        for (int i = n; i >= 1 ;i--) {
            System.out.println(i + " ");
        }



        // Latihan: Mencetak angka 1-N dan angka N-1

    }
}
