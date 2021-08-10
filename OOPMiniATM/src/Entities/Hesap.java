
package Entities;

import java.util.Scanner;

public class Hesap {
    
    Scanner S1 =new Scanner(System.in); // class seviyesinde olduğu için bu class içerisinde heryerden erişilebilir...
    public int bakiye=1000;
    //1- Para çek
    //2- Para yatır
    //3- Bakiye görüntüle
    //4- Çıkış yap
    
    
    public void CikisYap()
    {
        
        System.out.println("Hesabınızdan çıkış yaptınız");
    }
    
    public void BakiyeGoruntule()
    {
        System.out.println("Şuandaki bakiyeniz :"+this.bakiye);
    }
    
    public void ParaYatir(double miktar)
    {
        System.out.println("Paranız Yatırılıyor");
        System.out.println("Bakiyeniz :"+(bakiye+miktar));
        
        
       
    }
    
    // 10 tl den daha az para çekemesin ve bakiyesini geçemesin.
    public void ParaCek(int  miktar)
    {
        if (miktar<=bakiye && miktar>=10) {
            
            // bu koşul miktar bakiyeden küçükse veye eşitse aynı zamanda miktar 10 'a eşitse veya büyükse çektiricek
            
            System.out.println("Paranız çekiliyor");
            System.out.println("Kalan Bakiye :"+(bakiye-miktar));
        }
        
        else
        {
            System.out.println("Lütfen geçerli tutar giriniz");
        }
    }
    
    
    
    
}
