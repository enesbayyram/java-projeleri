
package composition;


public class Bilgisayar {
    
    public int bilgisayarID;
    public String bilgisayarModel;
    public int fiyat;
    public Anakart anakart;
    public Monitor mon;
    
    
    
    public void BilgisayarBilgileriniGoster(Bilgisayar pc)
    {
        System.out.println("İd :"+ pc.bilgisayarID);
        System.out.println("bilgsayar model :"+pc.bilgisayarModel);
        System.out.println("fiyat :"+ pc.fiyat);
        
        
    }
    
    
}
