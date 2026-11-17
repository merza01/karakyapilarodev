import java.util.Scanner;

/** Soru 1: 1'den N'e Kadar Sayılar */
public class Soru01_SayilariYazdir {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bir sayi giriniz");  
        int sayi=sc.nextInt();
        int i=1 ;
        if (sayi<1) { System.out.println("Lutfen 1'den buyuk bi sayi giriniz");
            
        }
        else { System.out.println("Bir tam sayi giriniz");}
        
        while (i<=sayi) { System.out.println(i);            
        
        i++;   
        }

        scanner.close();
    }
}
