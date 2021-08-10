
package miniatm;

import java.util.Scanner;

public class MiniATM {

    public static void main(String[] args) {
        
        Musteri M1 =new Musteri();
        
        
        
          int bakiye = 1000;
        String islem;
        Scanner S1 = new Scanner(System.in);

       
        System.out.println("Yapmak istediğiniz işlemi giriniz");
        System.out.println("1 = Bakiye Görüntüleme");
        System.out.println("2 = Para Çek");
        System.out.println("3 = Para Yatır");
        System.out.println("q = Çıkış yap");
        
         islem = S1.nextLine();

        switch (islem) {
            case "1":
                System.out.println("Bakiyeniz :" + bakiye);
                break;
            case "2":
                System.out.println("Çekilecek tutarı giriniz");
                int cekilecek_tutar = S1.nextInt();

                System.out.println("Kalan Tutar :" + (bakiye - cekilecek_tutar));
                break;

            case "3":
                System.out.println("Yatırılacak tutarı giriniz");
                int yatirilacak_tutar = S1.nextInt();
                System.out.println("Yeni Bakiye :" + (bakiye + yatirilacak_tutar));
                break;
                
            case "q":
                System.out.println("Çıkış yapılıyor Lütfen bekleyin");
                break;
              
            default:
                System.out.println("Yanlış Tuşladınız.");
                break;

        }
           
    }
    
}
