
package ınheritance2;

public class Kopek extends Hayvan {
    private String renk;
    private int yas;
    
    public Kopek(String isim, int kilo, String boy, String cinsiyet,String renk, int yas)
    {
        super(isim, kilo, boy, cinsiyet);
        this.renk=renk;
        this.yas=yas;
    }
    
    public void Tetikle(int hayvan_hizi)
    {
       super.Hayvani_kostur(hayvan_hizi);
    }
    
}
