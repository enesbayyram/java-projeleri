
import java.awt.BorderLayout;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        
        
       Scanner S1 =new Scanner(System.in);
       
        System.out.println("Ana Paranızı Giriniz.");
        
        int para= S1.nextInt();
        
        System.out.println("Kaç yıl Vadeli olarak yatırmak istiyorsunuz ?");
        
        int yil=S1.nextInt();
        
        
        for (int i = 1; i <=yil; i++) {
            
            System.out.println(i+". yil paranız :"+(para+((para*6/100)*i)));
            para=para+(para*6/100)*i; // Faizi koyarak koyulmuş haliyle %6 sını aldım
       
        }
        
        
    }
}
