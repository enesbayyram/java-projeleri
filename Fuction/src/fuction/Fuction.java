package fuction;

public class Fuction {

    public static void main(String[] args) { // 1 'den 100 'e kadar olan asal sayıları ekrana yazdırma.

        
        for (int i = 2; i < 1000; i++) {
            
            if (asalmi(i)) {
                
                System.out.println(i);
            }
            
        }
        
        
    }
    
    
    public static boolean asalmi(int sayi)
    {
        for (int i =2; i < sayi; i++) {
            
            if (sayi%i==0) {
                
                return false;
            }
            
        }
        return true;
    }

}
