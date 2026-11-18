import java.util.Scanner;

/** Soru 9: Sayıların Ortalaması */
public class Soru09_SayilarinOrtalamasi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        float toplam=0;
        int pozitif=0;
        int negatif=0;
        int notr=0;
        for (int i=1;i<=10; i++)  { System.out.println(i+". sayiyi giriniz:");
        float sayi=sc.nextFloat();
        toplam+=sayi;
            if (sayi==0) { notr++; }
            if (sayi<0) { negatif++; }
            if (sayi>0) { pozitif++; }     
           
      }
     float ort=toplam/10;
     
        System.out.println("Girdiginiz sayilarin ortalamasi:"+ort+"Toplami:"+toplam+" Girdiginiz pozitif sayi sayisi:"+pozitif+" Negatif sayi sayisi:"+negatif+" 0 girdiginiz sayi sayisi:"+notr);

        

        
        scanner.close();
    }
}
