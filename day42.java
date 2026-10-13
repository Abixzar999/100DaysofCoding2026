import java.util.Scanner;

public class days42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // memasukkan gaji pokok
        System.out.print("Masukkan gaji pokok : ");
        double gajipokok = input.nextDouble();
        
        double potongan;
        
        // Menentukan potongan berdasarkan gaji
        if (gajipokok > 5000000) {
            potongan = gajipokok *10 / 100;
        } else {
            potongan = gajipokok * 5 / 100;
        }

        // Menghitung gaji bersih
        double gajibersih = gajipokok - potongan;


        // Menampilkan hasil
        System.out.println("Gaji pokok  : Rp " + gajipokok);
        System.out.println("Potongan    : Rp " + potongan);
        System.out.println("Gaji Bersih  : Rp " + gajibersih);

        // Latihan: Menentukan Gaji Bersih

    }
}
