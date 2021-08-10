package ınheritanceproje;

import java.util.Scanner;

public class InheritancePROJE {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        Yazilimci yazilimci1 = new Yazilimci(155, "Enes", "Bayram", 2500);
        Yonetici yonetici1 = new Yonetici(10, "Yasin", "Yazıcı", 25);

        while (true) {
            System.out.println("İşlem Seçiniz");
            System.out.println("********************");

            String islemler = "1.Yazilimci İşlemleri\n"
                    + "2. Yönetici İşlemleri\n"
                    + "Çıkış için q ' ya basınız    :";

            System.out.print(islemler);

            String secilen_islem = s1.nextLine();

            if (secilen_islem.equals("1")) {

                // Yazılımci islemlerini yapıcaz.
                System.out.println("Yazılımcı işlemlerine hoşgeldiniz !");
                while (true) {

                    System.out.println("************************************");

                    String yazilimci_islemleri = "1. Format At\n"
                            + "2.Bilgileri Goster\n"
                            + "Yazılımcı islemlerinden çıkış yap";
                    System.out.println(yazilimci_islemleri);
                    System.out.println("******************************");

                    String yazilimci_secim = s1.nextLine();

                    if (yazilimci_secim.equals("1")) {
                        // Format attır

                        yazilimci1.formatAt();
                    } else if (yazilimci_secim.equals("2")) {

                        //Yazilimci bilgileri göster
                        yazilimci1.bilgileriGoster();
                    } else if (yazilimci_secim.equals("q")) {

                        // Yazılımcıdan çıkış yap
                        System.out.println("Yazilimci işlemlerinden çıkılıyor.");
                        break;
                    } else {
                        // Yazılımcı geçersiz işlem.
                        
                        System.out.println("Geçersiz Yazilimci işlemi girdiniz.");
                    }

                }
            } 
            
            else if (secilen_islem.equals("2")) {
                
                System.out.println("Yönetici işlemlerine Hoşgeldiniz.");
                // Yönetici İşlemleri
                while(true)
                {
                    String yonetici_islemleri="1. Zam yap\n"
                                            +"2. Yönetici Bilgilerini Göster\n"
                                            +"Çıkış yapmak için q 'ya basınız.";
                    System.out.println(yonetici_islemleri);
                    
                    
                    System.out.print("Yönetici ile ilgili yapmak istediğiniz işlemi seçiniz :");
                    
                    String yonetici_secim=s1.nextLine();
                    
                    if (yonetici_secim.equals("1")) {
                        
                        // Yonetici zam yap
                        System.out.print("Yapılacak zam tutarı giriniz :");
                        int zamMiktari=s1.nextInt();
                        s1.nextLine();
                        
                        yonetici1.zamyap(zamMiktari);
                    }
                    else if (yonetici_secim.equals("2")) {
                        
                        //Yonetici bilgileri goster
                        yonetici1.bilgileriGoster();
                    }
                    
                    else if (yonetici_secim.equals("q")) {
                        
                        // çıkış yap
                        System.out.println("Yönetici işlemlerinden çıkış yapıldı");
                        break;
                    }
                    else {
                        
                        System.out.println("Lütfen geçerli bir Yönetici işlemi giriniz.");
                    }
                }
                
            } 
            else if (secilen_islem.equals("q")) {
                
                
                // Çıkış yapıcaz
                System.out.println("Sistemden çıkıldı İyi günler");
                break;
            } 
            else {
                
                
                System.out.println("Lütfen Geçerli karakter giriniz.");
            }

        }
    }

}
