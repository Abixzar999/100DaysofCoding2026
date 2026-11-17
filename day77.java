import java.util.Scanner;
public class days77 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);



        
        // Memasukkan nama
        System.out.print("Masukkan nama : ");
        String nama = input.nextLine();
        // Memasukkan nama lagi untuk pemeriksaan
        System.out.print("Masukkan nama lagi : ");
        String nama1 = input.nextLine();
        
        // untuk contains
        String cont = "b";

        // Menghitung jumlah karakter
        System.out.println("Panjang nama : " + nama.length());
        // Mengubah huruf menjadi besar
        System.out.println("Huruf kapital : " + nama.toUpperCase());
        // Mengubah huruf menjadi kecil
        System.out.println("Huruf kecil : " + nama.toLowerCase());
        // Memeriksa apaka teks sama
        System.out.println("Apakah nama sama? : " + nama.equals(nama1));
        // Memeriksa Apakah besar kecil huruf sama
        System.out.println("Apakah huruf besar kecil sama? : " + nama.equalsIgnoreCase(nama1));
        // Memeriksa apakah teks menggandung huruf b
        System.out.println("Apakah teks menggandung kata b : " + nama.contains(cont));
        // Memeriksa apakah nama kosong
        System.out.println("Apakah nama kosong? : " + nama.isEmpty());
        // Mengganti huruf i menjadi x
        System.out.println("Replace : " + nama.replace("i", "x"));
        // Menghapus spasi di awal dan akhir
        System.out.println("Trim : " + nama.trim());
           // Mengambil sebagian teks jika panjang nama minimal 3 karakter
        if (nama.length() >= 3){
            System.out.println("Substring : " + nama.substring(0, 3));
        }


        // Latihan: Menggunakan berbagai method String

    }
}
