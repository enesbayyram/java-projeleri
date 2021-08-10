
package ınheritanceproje;

public class Yazilimci extends Calisan {
    
    private int maas;
    
    public Yazilimci(int id, String isim, String soyisim,int maas) {
        super(id, isim, soyisim);
        this.maas=maas;
    }
    
    
    public void formatAt()
    {
        System.out.println(super.getIsim()+" "+" Şuanda Bilgisayar'a format atıyor.");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yazilimci Sinifi içindeki BilgileriGoster fonksiyonu çalıştı.");
    }

  
    
    
    
    
    
    
}
