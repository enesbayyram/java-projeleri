
package ınheritance2;


public class Hayvan {
    
    private String isim;
    private int kilo;
    private String boy;
    private String cinsiyet;
    
    
    public Hayvan(String isim, int kilo, String boy, String cinsiyet)
    {
        this.isim=isim;
        this.kilo=kilo;
        this.boy=boy;
        this.cinsiyet=cinsiyet;
       
    }
    
    public void Hayvani_kostur(int hiz)
    {
        System.out.println("Hayvan şuanda"+hiz+" "+ "km hızla koşuyor.");
    }
    
    public void Deneme()
    {
        System.out.println("Denemedir");
    }
    
}
