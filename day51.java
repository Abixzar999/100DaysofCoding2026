import java.util.Scanner;

public class Days51 {
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);

        System.out.print("Mau sampai angka berapa : ");
        int batas = input.nextInt();

        
        // Perulangan for untuk mengulang kode
        // int i = 0 berarti perulangan dimulai dari angka 0
        // i <= 10 berarti perulangan berjalan sampai angka 10
        // i++ berarti nilai i bertambah 1 setiap putaran
        for (int i = 0; i <= batas; i++){

            // Menampilkan angka dan tulisan ". Sekolah"
            // Contoh: 0. Sekolah, 1. Sekolah, dan seterusnya
            System.out.println(i +".Sekolah");
        }
    
        //Perulangan for
    

    }
    
}
