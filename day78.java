import java.util.Scanner;
public class days78 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    

        // Membuat akun
        System.out.println("===== BUAT AKUN =====");
        System.out.print("Masukkan Username : ");
        String user = input.nextLine();
        
        System.out.print("Masukkan Password : ");
        String pass = input.nextLine();

        // Menyimpan status login
        boolean berhasil = false;
    

        // Mengulang proses login selama belum berhasil
        do{
            // Meminta username dan password
            System.out.println("\n===== Login =====");
        
            System.out.print("Masukkan Username : ");
            String username = input.nextLine();

            System.out.print("Masukkan Password : ");
            String password = input.nextLine();
        
            // Memeriksa apakah username DAN password benar
            if (username.equalsIgnoreCase(user) && password.equals(pass)) {
                System.out.println("Login berhasil, Selamat datang");
                
                // Mengubah status menjadi berhasil
                berhasil = true;

            } else {
                System.out.println("Login gagal!, Coba lagi");
            }

        } while (!berhasil);
    
        // Latihan: Membuat Akun dan Login Ke Akun (Menggunakan loop berhenti ketika user dan password-nya benar)        

    }
}
