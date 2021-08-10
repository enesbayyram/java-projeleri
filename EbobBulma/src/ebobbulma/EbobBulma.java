
package ebobbulma;

import java.util.Scanner;

public class EbobBulma {

    
    public static void main(String[] args)
    {
        Scanner s1 =new Scanner(System.in);
        int ebob_sonuc=1;
       
        // Kullanıcıdan alınan 2 sayıının ebobunu bulan program parçasını yazınız.
        
        System.out.println("Birinci sayiyi giriniz");
        int sayi1=s1.nextInt(); // 24
        
        System.out.println("İkinci sayiyi giriniz");
        int sayi2=s1.nextInt(); // 72
        
        if (sayi1<sayi2) {
            
            for (int i = sayi1/2  ; i >=2; i--)
            {
                
                if (sayi1%i==0 && sayi2%i==0) {
                    sayi1=sayi1/i;
                    sayi2=sayi2/i;
                    
                    ebob_sonuc*=i;
                }
            }
            System.out.println("Girilen iki sayının Ebobu :"+ebob_sonuc);
        }
        
            else if(sayi2<sayi1)
            {
                for (int i = sayi2/2; i >=2; i--) {
                    
                    if (sayi2%i==0 && sayi1%i==0) {
                        
                        sayi2=sayi2/i;
                        sayi1=sayi1/i;
                        ebob_sonuc*=i;
                    }
                }
                 System.out.println("Girilen iki sayının Ebobu :"+ebob_sonuc);
                
            }

    }
    
}
