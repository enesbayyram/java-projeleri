
package Entities;

public class Idman {
   
    
    private int burpee_sayisi;
    private int pushup_sayisi;
    private int situp_sayisi;
    private int squat_sayisi;

   
    public Idman(int burpee_sayisi, int pushup_sayisi, int situp_sayisi, int squat_sayisi)
    {
        this.burpee_sayisi=burpee_sayisi;
        this.pushup_sayisi=pushup_sayisi;
        this.situp_sayisi=situp_sayisi;
        this.squat_sayisi=squat_sayisi;
    }

    public int getBurpee_sayisi() {
        return burpee_sayisi;
    }

    public void setBurpee_sayisi(int burpee_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
    }

    public int getPushup_sayisi() {
        return pushup_sayisi;
    }

    public void setPushup_sayisi(int pushup_sayisi) {
        this.pushup_sayisi = pushup_sayisi;
    }

    public int getSitup_sayisi() {
        return situp_sayisi;
    }

    public void setSitup_sayisi(int situp_sayisi) {
        this.situp_sayisi = situp_sayisi;
    }

    public int getSquat_sayisi() {
        return squat_sayisi;
    }

    public void setSquat_sayisi(int squat_sayisi) {
        this.squat_sayisi = squat_sayisi;
    }
    
    
    public void HareketYap(String hareket_turu , int sayi)
    {
        if (hareket_turu.equals("burpee")) {
            
            burpeeYap(sayi);
        }
        
        else if (hareket_turu.equals("pushup")) {
            
            pushupYap(sayi);
        }
        //
        
        else if (hareket_turu.equals("situp")) {
            
            situpYap(sayi);
        }
        
        else if(hareket_turu.equals("squat"))
        {
            squatYap(sayi);
        }
        
        else
        {
            System.out.println("Geçerli bir haraket türü giriniz.");
        }
    }
    
    
    public void burpeeYap(int sayi)
    {
        if (burpee_sayisi==0) {
            
            System.out.println("Yapılacak burpee kalmadı");
        }
        
        if (burpee_sayisi-sayi<0) {
            
            System.out.println("Hedefinizden daha fazla burpee yaptınız tebrikler");
            burpee_sayisi=0;
        }
        
        else
        {
            burpee_sayisi=burpee_sayisi-sayi;
            System.out.println("Kalan Burpee Sayiniz :"+burpee_sayisi);
        }
    }
    
    public void pushupYap(int sayi)
    {
        if (pushup_sayisi==0) {
            
            System.out.println("Yapılacak pushup kalmadı.");
        }
        
        if (pushup_sayisi-sayi<0) {
            
            System.out.println("Hedefinizden daha fazla Pushup yaptınız");
            pushup_sayisi=0;
        }
        
        else{
            pushup_sayisi-=sayi;
            System.out.println("Kalan Pushup sayiniz :"+pushup_sayisi);
        }
    }
    
    public void situpYap(int sayi)
    {
        if (situp_sayisi==0) {
            
            System.out.println("Yapılacak situp kalmadı");
        }
        
        if (situp_sayisi-sayi<0) {
            
            System.out.println("Hedeflediğinizden daha fazla Situp yaptınız");
            situp_sayisi=0;
        }
        else
        {
            situp_sayisi-=sayi;
            System.out.println("Kalan Situp sayiniz :"+situp_sayisi);
        }
    }
    
    public void squatYap(int sayi)
    {
        if (squat_sayisi==0) {
            
            System.out.println("Yapılacak daha fazla Squat Kalmadı");
        }
        if (squat_sayisi-sayi<0) {
            
            System.out.println("Hedeflediğinizden daha fazla Squat Yaptınız Tebrikler");
            squat_sayisi=0;
        }
        
        else
        {
            squat_sayisi-=sayi;
            System.out.println("Kalan Squat Sayisiniz :"+squat_sayisi);
        }
    }
    
    
    public boolean idmanBittiMi()
    {
        if (burpee_sayisi==0 && pushup_sayisi==0 && situp_sayisi==0 && squat_sayisi==0) {
            
            return true;
        }
        else
            
        {
            return false;
        }
    }
}
