import java.util.Scanner;

/** Soru 10: Menü Tabanlı İşlem Programı */
public class Soru10_MenuProgrami {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
       
    int secim; 
    int sayi = 0; 
  do { 
    System.out.println("SECIM MENUSU :");
    System.out.println("1: Bir sayinin karesini hesapla.");
    System.out.println("2: Bir sayinin kupunu hesapla.");
    System.out.println("3: Bir sayinin tek veya cift oldugunu kontrol et.");
    System.out.println("4: Bir sayinin pozitif, negatif veya sifir oldugunu belirle.");
    System.out.println("5: Programdan cik.");
    System.out.println("Seciminiz: ");

    secim = sc.nextInt();

    if (secim<=4 && secim>=1) {
        System.out.println("Bir sayi giriniz");
        sayi = sc.nextInt(); 
    }

    switch (secim) {
        case 1:
            int kare=sayi*sayi;
            System.out.println("Girdiginiz sayinin karesi: " + kare);
            break;
        case 2:
            int kup =sayi*sayi*sayi;
            System.out.println("Girdiginiz sayinin kupu: " + kup);
            break;
        case 3:
            if (sayi%2==0) {
                System.out.println("Sayi cifttir");
            } else {
                System.out.println("Sayi tektir");
            }
            break;
        case 4:
            if (sayi==0) {
                System.out.println("Sayi sifirdir");
            } else if (sayi < 0) {
                System.out.println("Sayi negatiftir");
            } else {
                System.out.println("Sayi pozitiftir");
            }
            break;
        case 5:
            System.out.println("Programdan cikiliyor...");
            break;
        default:
            System.out.println("Gecersiz secim 1-5 arasinda bir secim yapiniz:");
            break;
    }
} while (secim != 5);
        scanner.close();
    }
}
