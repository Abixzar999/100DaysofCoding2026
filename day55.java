import java.util.Scanner;
public class days55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mau sampai berapa? : ");
        int batas = input.nextInt();


        for (int i = 1; i <= batas; i++) {

        if (i == 5){
            continue; // Lewati angka 5
        }
    
        if (i == 9) {
            break; // Hentikan perulangan saat i = 9
        }
    
        System.out.println(i);
    }

        System.out.println("Perulangan selesai");
        return;
        // System.out.println("Perulangan selesai");
        // Akhiri metode main

        
        //Keyword continue, break dan return


    }

}
