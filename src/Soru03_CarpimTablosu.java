import java.util.Scanner;

/** Soru 3: Çarpım Tablosu */
public class Soru03_CarpimTablosu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.println("Bir sayi giriniz:");
        
        if (!sc.hasNextInt()) { System.out.println("Girdiginiz sayi tam sayi olmalidir");
        return;}
       
        int sayi=sc.nextInt();
        if (sayi<=1) {System.out.println("Girdiginiz sayi 1 den fazla olmalıdır");  
        return;}
        
        else { int i=1; System.out.println("Carpim tablosu:");
            while ( i<=10 ) { System.out.println(i+"x"+sayi+"="+i*sayi);               
            i++;
                
            }
       }
       

        scanner.close();
    }
}
