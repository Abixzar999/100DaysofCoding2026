
import java.util.Scanner;

public class days47 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);


        System.out.print("Masukkan nama hari : ");
        String hari = input.nextLine();
        
        // Mengubah semua huruf menjadi huruf kecil agar input
        // tetap cocok meskipun pengguna memakai huruf kapital
        // diatas bahas toLowerCase ini
        switch (hari.toLowerCase()) {

            // Jika hari Sabtu atau Minggu
            case "minggu","sabtu" :
            System.out.println("Hari libur");
            break;

            // Jika hari Senin sampai Jumat
            case "senin","selasa","rabu","kamis","jumat" :
            System.out.println("Hari kuliah");
            break;

            // Jika salah hari atau tidak ada yang didalam case
            default :
            System.out.println("Hari apa itu");



        }

        // Latihan: Program untuk Menentukan Hari

    }
    
}


