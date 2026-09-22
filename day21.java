import java.util.Scanner;
public class days21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meamasukkan data menggunakan tipe data String
        System.out.print("Masukkan umur : ");
        String umur = input.nextLine();

        System.out.print("Masukkan Tahun lahir : ");
        String tahunLahir = input.nextLine();

        System.out.print("Masukkan Tinggi badan : ");
        String tinggiBadan = input.nextLine();

        System.out.print("Masukkan Berat badan : ");
        String beratBadan = input.nextLine();

        // Mengubah String menjadi tipe data primitif
        byte byteumur = Byte.parseByte(umur);
        short tahunLahirshort = Short.parseShort(tahunLahir);
        float tinggiBadanfloat = Float.parseFloat(tinggiBadan);
        double beratBadandouble = Double.parseDouble(beratBadan);

        // Menampilkan hasil
        System.out.println("Umur : " + byteumur);
        System.out.println("Tahun Lahir : " + tahunLahirshort);
        System.out.println("Tinggi Badan : " + tinggiBadanfloat);
        System.out.println("Berat Badan : " + beratBadandouble);

        
        //Mengubah String menjadi Tipe Data Primitif

    }
}
