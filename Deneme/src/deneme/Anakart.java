
package deneme;


public class Anakart {
    
    public int anakartid;
    public String anakart_fiyat;
    public String soket_sayisi;
    
    
    
    public void AnakartBilgileriYazdir(Anakart A1)
    {
        System.out.println("Anakart ID :"+A1.anakartid);
        System.out.println("Anakart Fiyat :"+A1.anakart_fiyat);
        System.out.println("Soket Sayisi :"+A1.soket_sayisi);
    }
}
