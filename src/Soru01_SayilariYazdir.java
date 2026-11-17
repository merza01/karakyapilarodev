import java.util.Scanner;

/** Soru 1: 1'den N'e Kadar Sayılar */
public class Soru01_SayilariYazdir {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bir N sayisi giriniz");  
        int n=sc.nextInt();
        int i=1 ;
        if (n<1) { System.out.println("Lutfen 1'den buyuk bi sayi giriniz");
            
        }
        else { System.out.println("Bir tam sayi giriniz");}
        
        while (i<=n) { System.out.println(i);            
        
        i++;   
        }

        scanner.close();
    }
}
