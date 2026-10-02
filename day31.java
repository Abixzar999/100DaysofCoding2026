import java.util.Scanner;
public class days31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukan umur atau nilai
        System.out.print("Masukkan Umur: ");
        int umur = input.nextInt();
    
        // Operator dan (AND)
        System.out.println("Umur 18 - 30 : " + (umur >= 18 && umur <= 30));

        // Operator atau (OR)
        System.out.println("Dibawah 18 atau diatas 30 : " + (umur < 18 || umur > 30));

        // Operator tidak (NOT)
        System.out.println(umur + ">= 18 : " + (umur >= 18));
        System.out.println(umur + ">= 18 : " + !(umur >= 18));
        
        // Operator Logika AND (&&), OR (||), dan NOT (!).

    }
}
