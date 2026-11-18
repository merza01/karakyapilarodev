import java.util.Scanner;

/** Soru 7: Asal Sayı Kontrolü */
public class Soru07_AsalSayi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Bir sayi giriniz");
        if (!sc.hasNextInt()) { System.out.println("Tam sayi giriniz");}
        int sayi=sc.nextInt();   
        if (sayi<0) {System.out.println("Negatif sayilar asal olamaz!");}
        else if (sayi==0 || sayi==1) {System.out.println("Sayi asal degildir");}
      
        else { int i=2;
        boolean bayrak=true;
        
        while (i<sayi ) { 
         if (sayi%i==0) { bayrak=false;       
        break; }
       i++;
       }      
        if (bayrak) {System.out.println("Sayi asaldir");} 
        else if (!bayrak) { System.out.println("Sayi asal degildir");
            
        }
        } 

        scanner.close();
    }
}
