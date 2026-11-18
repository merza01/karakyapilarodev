import java.util.Scanner;

/** Soru 6: Sayıyı Ters Çevirme */
public class Soru06_SayiyiTersCevir {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
  System.out.println("Bir sayi giriniz: ");
        int sayi = sc.nextInt();
        
        int ters=0;
        int basamak;
        
        while (sayi != 0) {
            basamak = sayi%10;
            ters=ters*10+basamak;
            sayi=sayi/10;
        }
        
        System.out.println("Sayinin tersi: " + ters);

        scanner.close();
    }
}
