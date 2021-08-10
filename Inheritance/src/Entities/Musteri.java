
package Entities;

public class Musteri {
    
    public int musteriID;
    private String isim;
    private String soyisim;
    private String cinsiyet;
    
    
    public Musteri(int musteriid, String isim, String soyisim, String cinsiyet)
    {
        this.musteriID=musteriid;
        this.isim=isim;
        this.soyisim=soyisim;
        this.cinsiyet=cinsiyet;
    }
    
    
   public void MusteriBilgileriniGoster()
   {
       System.out.println("Musteri İD :"+this.musteriID);
       System.out.println("İsim :"+this.isim);
       System.out.println("Soyisim :"+this.soyisim);
       System.out.println("Cinsiyet :"+this.cinsiyet);
       
   }
    
    
}
