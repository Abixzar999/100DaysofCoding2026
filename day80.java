import java.util.Scanner;
public class days80 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] nilai = new int[5];

        // Mengisi array
        for(int i = 0; i < nilai.length; i++){
            System.out.print("Masukkan nilai ke- " + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }
    
        // Memilih index
        System.out.print("\nMasukkan index yang ingin dilihat ( 0 - 4 ): ");
        int index = input.nextInt();


        // Mengakses elemen array
        System.out.println("Nilai pada index " + index + " adalah " + nilai[index]);
    

        // Latihan: Akses Elemen Array Dengan Indeks
    }
    
}
