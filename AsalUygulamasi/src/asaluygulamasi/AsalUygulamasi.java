
package asaluygulamasi;

public class AsalUygulamasi {

 
    public static void main(String[] args) {
        
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
