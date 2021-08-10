
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args)
    {  Scanner S1 =new Scanner(System.in);
    
        
        int sayac=1;
        
      
        while (sayac<=3) 
        {            
            System.out.println("Kullanici Adinizi giriniz");
            String kulad=S1.nextLine();
            
            System.out.println("Şifrenizi giriniz");
            String sifre=S1.nextLine();
            
            if (kulad.equals("enesbayram") && sifre.equals("123")) 
            {
                System.out.println("Başarılı şekilde giriş yaptınız");
                break;
            }
            else
            {
                System.out.println("Kullanici Adi veya Şifreniz Yanlış");
                sayac++;
            }
 
        }
        if (sayac>3) {
            
            System.out.println("Hesabınız Bloke Olmuştur");
        }
        
      
        
        
    }
}
