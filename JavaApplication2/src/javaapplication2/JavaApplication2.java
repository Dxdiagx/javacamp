package javaapplication2;


public class JavaApplication2 {
    
    
interface kosabilme 
{ 
   public void kos() ;
}

interface dahahızlıkosabilme extends kosabilme
{
   public void dahahızlıkos();
    
}

class roadrunner implements dahahızlıkosabilme
{
    @Override
    public void kos() 
    { 
      System.out.println("Daha Hzılı Koşuyor");
    }

    @Override
    public void dahahızlıkos() 
    { 
      System.out.println("Daha Hzılı Koşuyor");
    }

}

interface Avlanabilme extends dahahızlıkosabilme
{
    public void avlan();
     
}

abstract class jaguar implements Avlanabilme
{

}
    
    public static void main(String[] args) {
        
      
    }
    
}
