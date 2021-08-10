
import java.util.Scanner;

public class Musteri {

    public static void main(String[] args) {

        // While dongüsünü kullanarak ATM uygulaması
        //1 'e basıldığında Bakiye göster
        //2 ' ye basıldığında Para çek
        //3 ' e basıldığında Para yatır
        // q' a basıldığında çık
        int bakiye = 1000;
        String islem;
        
        Scanner S1 = new Scanner(System.in);
        
        do {            
       
        System.out.println("Yapmak istediğiniz işlemi seçiniz");
        System.out.println("1 = Bakiye Göster");
        System.out.println("2 =Para Çek");
        System.out.println("3 =Para Yatır");
        System.out.println("q çıkış");
        islem = S1.nextLine(); // Fonksiyon scope'ları arasında olduğu için tüm scope'lardan görülebilir /local scope / global scope.

        switch (islem) {
            case "1":
                System.out.println("Bakiyeniz :" + bakiye);
                break;
                
            case "2":
                System.out.println("Çekmek istediğiniz tutarı giriniz ?");
                int cekilecek_tutar = S1.nextInt();
                System.out.println("Para çekilmiştir. Kalan Tutar :" + (bakiye - cekilecek_tutar));
                break;
                
            case "3":
                System.out.println("Yatırılacak Tutarı giriniz");
                int yatirilacak_tutar=S1.nextInt();
                System.out.println("Para yatırma işlemi tamamlandı. Bakiyeniz :"+(bakiye+yatirilacak_tutar));
                break;
                
            case "q":
                System.out.println("Hesabınızdan çıkış yapılmıştır");
                break;
                
            default: // Eğer bu 4 seçenekten biri değilse default blcoklarına girecektir. aynı else gibidir...
                System.out.println("Yanlış Tuşladınız");
        }
            
  
            
        } while (islem!="q");

       

    }

}
