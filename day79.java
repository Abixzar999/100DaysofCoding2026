import java.util.Scanner;

public class days79{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Membuat array dengan 5 tempat
        int[] nilai = new int[5];

        // Mengisi array
        for(int i = 0; i < nilai.length; i++){
            System.out.print("Masukkan nilai ke-" + (i + 1) + " : ");
            nilai[i] = input.nextInt();
        }

        // Menampilkan isi array
        System.out.println("\n======= DAFTAR NILAI ========");
         
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai ke-" + (i + 1) + ": " + nilai[i]);
        }
    // array 1d
    
    }
}
