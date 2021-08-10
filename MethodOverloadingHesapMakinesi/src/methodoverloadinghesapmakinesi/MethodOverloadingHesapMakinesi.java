
package methodoverloadinghesapmakinesi;

public class MethodOverloadingHesapMakinesi {

   
    public static void main(String[] args) {
        
        
        Carpma(5, 3,11,10);
        
        
    }
    
    
    //Toplama işlemi Method Overloading
    
    public static void Toplama(int a, int b)
    {
        System.out.println("Toplama Sonucu :"+ (a+b));
    }
    
    public static void Toplama(int a , int b, int c)
    {
        System.out.println("Toplama Sonucu :"+(a+b+c));
    }
    
    // Çarpma Method Overloading
    
    public static void Carpma(int a, int b)
    {
        System.out.println("Çarpım Sonuc :"+(a*b));
    }
    
    public static void Carpma(int a, int b ,int c)
    {
        System.out.println("Çarpım Sonuc :"+(a*b*c));
    }
    
    public static void Carpma(int a, int b ,int c ,int d)
    {
        System.out.println("Çarpım Sonuc :"+(a*b*c*d));
    }
    
}
