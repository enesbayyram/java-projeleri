package ıdmanprogrami;

import Entities.Idman;
import java.util.Scanner;

public class IdmanProgrami {

    public static void main(String[] args) {

        Scanner S1 = new Scanner(System.in);

        System.out.println("Idman programına hoşgeldiniz");
        System.out.println("Idmanda yapılacak hareketler");

        String hareketler = "Burpee\n"
                + "Pushup\n"
                + "Situp\n"
                + "Squat\n";
        System.out.println(hareketler);

        System.out.print("Burpee Sayısı :");
        int burpee = S1.nextInt();
        
        System.out.print("Pushup Sayisi :");
        int pushup = S1.nextInt();
        
        System.out.print("Situp Sayisi :");
        int situp = S1.nextInt();
        
        System.out.print("Squat Sayisi :");
        int squat = S1.nextInt();
        
        S1.nextLine();
        
        Idman idman =new Idman(burpee, pushup, situp, squat);
        
        while (idman.idmanBittiMi()==false) {            
            
            System.out.println("Hareket Türünü giriniz");
            String hareket_turu=S1.nextLine();
            
            System.out.println("Tekrar Sayısı giriniz");
            int tekrar=S1.nextInt();
            S1.nextLine(); // Enter karakterini çöpe atabilmek için bu hareketi yaptık arkadaşlar.
            
            idman.HareketYap(hareket_turu, tekrar);
        }
        
        System.out.println("İdmanınız Bitmiştir Tebrikler");

    }

}
