import java.util.Scanner;
public class days75 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan nama 1
        System.out.print("Masukkan nama 1 : ");
        String nama1 = input.nextLine();

        // Memasukkan nama 2
        System.out.print("Masukkan nama 2 : ");
        String nama2 = input.nextLine();        

        // untuk contains
        String cont = "al";

        // Memeriksa apakah kedua teks sama persis
        System.out.println(nama1.equals(nama2));

        // Memeriksa kesamaan tanpa memperhatikan huruf besar/kecil
        System.out.println(nama1.equalsIgnoreCase(nama2));
        
         // Memeriksa apakah teks mengandung kata al
        System.out.println(nama1.contains(cont));

        // Memeriksa apakah String kosong
        System.out.println(nama1.isEmpty());
        

        // Method String untuk Pengecekan (equals(), equalIgnoreCase(), contains(), isEmpty()).

    }
}
