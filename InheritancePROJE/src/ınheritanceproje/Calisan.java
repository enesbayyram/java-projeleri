
package ınheritanceproje;


public class Calisan { // SuperClass / BaseClass
    
    private int id;
    private String isim;
    private String soyisim;

    public Calisan(int id , String isim, String soyisim)
    {
        this.id=id;
        this.isim=isim;
        this.soyisim=soyisim;
    }
    
    
    public void setid(int id)
    {
        this.id=id;
    }
    
    public int getid()
    {
        return this.id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }
            
    
    public void bilgileriGoster()
    {
        System.out.println("Çalışan Bilgileri");
        System.out.println("Çalışan İD :"+this.id);
        System.out.println("İsim :"+this.isim);
        System.out.println("Soyisim :"+this.soyisim);
    }
    
    
    
    
}
