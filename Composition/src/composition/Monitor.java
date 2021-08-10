
package composition;

public class Monitor {
    
    public String marka;
    public int fiyat;
    public String boyut;
    public Resolution coz;
    
    
    public Monitor(String marka, int fiyat, String boyut)
    {
        this.marka=marka;
        this.fiyat=fiyat;
        this.boyut=boyut;
    }
    
    public void MonitorBilgileri()
    {
        String deger="Marka :"+this.marka
                    +"Fiyat :"+this.fiyat
                    +"Boyut :"+this.boyut;
        
        System.out.println(deger);
    }
    
}
