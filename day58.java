import java.util.Scanner;
public class days58 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Memasukkan batas angka
        System.out.print("Masukkan angka N : ");
        int n = input.nextInt();
        

         // Mencetak angka ganjil dari N ke 1
         System.out.println("angka ganjil");
         for (int i = n; i >= 1; i--) {
            if (i%2 != 0) {
            System.out.print(i + " ");
        }
    }

     System.out.println();

     
         // Mencetak angka ganjil dari N ke 1
         System.out.println("angka genap");
         for (int i = n; i >= 1;i--) {
            if (i%2 == 0) {
                System.out.print(i + " ");
            }
        }



        // Latihan: Mencetak angka ganjil N-1 dan angka genap N-1
    }
}
