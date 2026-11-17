import java.util.Scanner;

/** Soru 4: Faktöriyel Hesaplama */
public class Soru04_Faktoriyel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println(" Faktoryeli hesaplanacak sayiyi giriniz:");
        if (!sc.hasNextInt()) { System.out.println("Girdiginiz sayi tam sayi olmalidir");
        return;}
        int sayi=sc.nextInt();
        int i=1;
        int faktoryel=1;
        if (sayi<0) {System.out.println("Negatif sayilarin faktoryeli bulunmaz");}
        

        
        else {
        while (i<=sayi) { faktoryel=faktoryel*i;
        i++;
            
        }
        System.out.println("Girdiginiz sayinin faktoryeli="+ faktoryel);}

        scanner.close();
    }
}
