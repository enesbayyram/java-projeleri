
package composition;


public class Anakart {
    
    private String marka;
    public int fiyat;
    public String renk;
    
    
    public Anakart(String marka, int fiyat, String renk)
    {
        this.marka=marka;
        this.fiyat=fiyat;
        this.renk=renk;
    }
    
    
    public String getMarka()
    {
        return this.marka;
    }
    
    public void AnakartBilgileri()
    {
        System.out.println("Marka :"+this.marka);
        System.out.println("Renk :"+this.renk);
    }
}
