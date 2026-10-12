import java.util.Scanner;
public class days41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Meminta masukkan suhu ruangan
        System.out.print("Masukkan suhu ruangan (°C) : ");
        double suhu = in.nextDouble();

        // Memeriksa suhu ruangan
        if (suhu < 4) {
            System.out.println("Suhu ruangan terlalu dingin!!");
        } else if (suhu <= 20) {
            System.out.println("Suhu ruangan dingin");
        } else if (suhu <= 28) {
            System.out.println("Suhu ruangan normal");
        } else {
            System.out.println("Suhu ruangan terlalu panas");
        }

        // Latihan : Menentukan Temperature Ruangan menggunakan if

    }
}
