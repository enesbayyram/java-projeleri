package armstrongsayisiornek;

import java.util.Scanner;

public class ArmStrongSayisiOrnek {

    public static void main(String[] args) {
        int sayi;
        int basamak_sayisi;
        int toplam=0;
        // 371  3'3 + 7'3 + 1'3  
        Scanner S1 = new Scanner(System.in);

        System.out.println("Bir sayı giriniz");
        sayi = S1.nextInt();
        
        System.out.println("Basamak sayısını giriniz");
        basamak_sayisi=S1.nextInt();
        
        do {
            
           int yakalanan_sayi= sayi%10;
          toplam+= Math.pow(yakalanan_sayi, basamak_sayisi);
          
        sayi=  sayi/10;
        
            if (sayi<10) {
                
               toplam+= Math.pow(sayi, basamak_sayisi);
               
               break;
            }
            
            
        } while (sayi>0);
        
        System.out.println("Armstrong Değeri :"+ toplam);

    }

}
