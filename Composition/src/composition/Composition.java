
package composition;

public class Composition {

   
    public static void main(String[] args) 
    {
       
    Bilgisayar pc=new Bilgisayar();
    
    pc.bilgisayarID=1;
    pc.fiyat=1250;
    pc.bilgisayarModel="Asus";
    
    
    pc.BilgisayarBilgileriniGoster(pc);
    
        
    }
    
}
