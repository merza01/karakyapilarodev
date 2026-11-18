import java.util.Scanner;

/** Soru 8: Tahmin Oyunu */
public class Soru08_TahminOyunu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int gizlisayi=2859;
        int tahmin;
        do {
            System.out.print("Tahmininizi girin: ");
           tahmin = sc.nextInt();

            if (tahmin < gizlisayi) {
                System.out.println("Daha buyuk bir sayi girin.");
            } else if (tahmin > gizlisayi) {
                System.out.println("Daha kucuk bir sayi girin.");
            } else {
                System.out.println("Tebrikler dogru sayiyi buldunuz!");
            }

        } while (tahmin!=gizlisayi);  


        scanner.close();
    }
}
