
package oopminiatm;

import Entities.Giris;
import Entities.Hesap;
import java.util.Scanner;

public class OOPMiniATM {

    public static void main(String[] args) {
        
       Scanner S1 =new Scanner(System.in);   
        Giris G1 =new Giris();
        Hesap H1 =new Hesap();
        
      int returnvalue= G1.GirisKontrol("yakup", "123");
      
        if (returnvalue>0) {
            
            System.out.println("Yapmak istediğiniz işlemi seçiniz");
            System.out.println("1- Para çek");
            System.out.println("2- Para yatır");
            System.out.println("3- Bakiye Sorgula");
            System.out.println("4- Çıkış yap");
            int islem=S1.nextInt();
            
            switch(islem)
            {
                case 1:
                    System.out.println("Çekilecek Tutarı Giriniz");
                    int cekilecek_tutar=S1.nextInt();
                    
                   H1.ParaCek(cekilecek_tutar);
                    break;
                    
                case 2 :
                    System.out.println("Yatırılacak Tutarı giriniz");
                    int yatirilacak_tutar=S1.nextInt();
                    H1.ParaYatir(yatirilacak_tutar);
                    break;
                
                case 3:
                    
                     H1.BakiyeGoruntule();
                    break;
                case 4:
                    
                  H1.CikisYap();
                    break;
            }
        }
        
        else
        {
            System.out.println("Kullanıcı Adı veya Şifreniz Yanlış Lütfen Kontrol Ediniz.");
        }
        
    }
    
}
