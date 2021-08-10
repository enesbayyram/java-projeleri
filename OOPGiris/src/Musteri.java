
public class Musteri { // Müşterimin özellikleri 
    
    
    public int musteriid;
    private String isim;
    private String soyisim;
    
    private int yas;
    
    public Musteri()
    {
        
    }
    
    public Musteri(int musteriID)
    {
    
    
    }
    
    public Musteri(int musteriID, String isim)
    {
        
    }
    
    public Musteri(int musteriID, String isim, String soyisim)
    {
        this.musteriid=musteriID;
        this.isim=isim;
        this.soyisim=soyisim;
        
        System.out.println("Müşteri sınıfının yapıcı metoduna girdik ve değişkenlere değer ataması yaptık");
        
    }
    
    
    public String AdsoyadGetir() // imzası
    {
        return this.isim + " " + this.soyisim; // Body
    }
}
