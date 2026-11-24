import java.util.Scanner;
public class days84{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Membuat array dengan 5 tempat
        int[] angka = new int[5];


        // Mengisi array
        for(int i = 0; i < angka.length;i++){
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }
        
            // Menganggap angka pertama sebagai angka terbesar
            int max = angka[0];

            // Mencari angka terbesar
            for(int i = 1; i < angka.length;i++){
                if (angka[i] > max){
                    max = angka[i];
                }
            }
    
            // Memanggil tampilan
            System.out.println("Angka Terbesar : " + max);
    }

}
