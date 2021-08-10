
package ınheritanceproje;


public class Yonetici extends Calisan{
    
    private int sorumlu_kisi_sayisi;
    
    public Yonetici(int id , String isim, String soyisim , int sorumlu_kisi_sayisi)
    {
        super(id,isim,soyisim);
        this.sorumlu_kisi_sayisi=sorumlu_kisi_sayisi;
    }
    
    public void zamyap(int zam_miktari)
    {
        System.out.println(super.getIsim() + " " + super.getSoyisim() + " "+ "kişisi"+ " "+ zam_miktari + " "+ "TL zam istiyor.");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Ben Yonetici Classı içindeki bilgilerigoster Foksiyonunu çalıştırmaktayım.");
    }
    
    
    
}
