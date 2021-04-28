package javaapplication1;

public class JavaApplication1 {
    
    
interface calisan{

public void calis(); 

}

class Mudur implements calisan
{

public void calis()
{
    
    System.out.println("Mudur Calisiyor");
}
    
}

class programcı implements calisan
{

public void calis() {}

}

class GenelMudur extends Mudur{

public void toplantiyap() { 

System.out.println("GenelMudur Calisiyor");

}

class AnalizProgramci extends programcı{
public void analizyap(){}
}


}

    public static void main(String[] args) {
        
        calisan[] c = new calisan[6];
       /*  c[0] = new programcı();
         c[1] = new Mudur();
               */
    }
    
}
