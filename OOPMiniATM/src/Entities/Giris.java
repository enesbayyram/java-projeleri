
package Entities;


public class Giris {
    
    public String musteriID;
    public String kullaniciAdi;
    public String sifre;
    
    
    public int GirisKontrol(String kulad , String sif)
    {
        if (kulad.equals("enes") && sif.equals("123")) {
            
            System.out.println("Başarılı bir şekilde giriş yaptınız");
            return 1;
        }
        
        else
        {
            
            return -1;
        }
    }
    
    
}
