import java.util.Scanner;

/** Soru 5: Sayının Basamaklarını Bulma */
public class Soru05_BasamakSayisi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

  System.out.println("Bir sayi giriniz");
        if (!sc.hasNextInt()) { System.out.println("Lutfen tam sayi giriniz");     
        return; } 
        int sayi=sc.nextInt();
        int basamak = 0;
        
        do {
            sayi = sayi / 10;
            basamak++; } 
        while (sayi != 0);{ 

        System.out.println("Basamak sayisi: " + basamak); }
        
        scanner.close();
    }
}
