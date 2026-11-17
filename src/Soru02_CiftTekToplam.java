import java.util.Scanner;

/** Soru 2: Çift ve Tek Sayıların Toplamı */
public class Soru02_CiftTekToplam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bir n sayisi giriniz");
        if (!sc.hasNextInt()) { System.out.println("Girdiginiz sayi tam sayi olmalidir");
         return;}
       
        int n=sc.nextInt();
        if (n<=1) {System.out.println("Girdiginiz sayi 1 den fazla olmalıdır");  
        return;}
          
        
        else {
        int i=1;
        int tektoplam=0;
        int cifttoplam=0;
        while (i<n) { 
         if (i%2!=0 && i!=1) { tektoplam=tektoplam+i;}       
         else if (i%2==0) { cifttoplam=cifttoplam+i; }
         i++; }

       
         System.out.println("1 ile N arasindaki Tek sayilarin toplami: "+tektoplam +" Cift sayilarin toplami:"+ cifttoplam);
        }
       

        scanner.close();
    }
}
