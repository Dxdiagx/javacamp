package ıntegerset;

  public class IntegerSet 
  {
      
    public static final int DiziBoyutu = 99; // Dizi eleman sayısı = [1, 99] (1,100)
    
    public static int i;
      
    public  boolean [] booleanArray = new boolean[DiziBoyutu];
     
     
    public static IntegerSet union(IntegerSet set1, IntegerSet set2)
    {
        /*
        Java’da tanımladığımız bir dizimizi başka bir diziye kopyalamak isteyebiliriz. 
        Bunun için 2 yöntem var. Bu yöntemlerden ilki for döngüsünde dizi elemanlarını 
        başka bir diziye atarak kopyalama işlemi yapmak.
        */
        
         
        IntegerSet union = new IntegerSet();
         
         /*
            System.arraycopy(Kaynak dizi, Kaynak dizi’nin başlangıç index’i, Hedef dizi, Hedef dizi’nin başlangıç index’i,  Adedi);

            Kaynak dizi: Kaynak dizinin adı yazılır.
            Kaynak dizi’nin başlangıç index’i: Kaynak dizi’nin kaçıncı indexten itibaren eleman kopyalanacağı belirtilir.
            Hedef dizi: Hangi diziye kopyalanacaksa o dizinin adı yazılır.
            Hedef dizi’nin başlangıç index’i: Kaynak dizi’nin, hedef dizi’nin kaçıncı index elemanından itibaren kopyalanacağı belirtilir.
            Adedi: Kopyalanacak olan elemanların sayısı belirtilir.
         
         */
         
        System.arraycopy( set1.booleanArray, 0, union.booleanArray, 0, DiziBoyutu);
         
        for ( int i = 0; i < DiziBoyutu; i++ )
        {
            if ( set1.booleanArray[i] || set2.booleanArray[i] )
            {
                union.booleanArray[i] = true;
            }
             
            else 
            { 
                union.booleanArray[i] = false;     // yanlış ise false döndericek
            }                                          
        }
        
        return union;
    }
     
    public static IntegerSet intersection(IntegerSet set1, IntegerSet set2)    // kesişim
    {
        IntegerSet intersection = new IntegerSet();
        
        for (int i = 0; i < DiziBoyutu; i++)
        {
            intersection.booleanArray[i] = set1.booleanArray[i] && set2.booleanArray[i];
        }
        return intersection;
    }
     
    public void insertElement(int x) 
    { 
        booleanArray[x] = true; 
    }
     
    public void deleteElement(int y) 
    { 
        booleanArray[y] = false;
    }
     
    
    public boolean isEqualTo(IntegerSet set)   // eşitlik kontrolü "isEqualTo"
    {
        for (int i = 0; i < DiziBoyutu; i++)
        {
            if (booleanArray[i] != set.booleanArray[i])
            {
                return false;
            }
        }
        return true;
    }
     
    public static void main( String[] args )
    {
        IntegerSet integerSet1 = new IntegerSet();
        System.out.println("intergerSet1 boş: " + integerSet1 );
         
        IntegerSet integerSet2 = new IntegerSet();
        System.out.println("Boş Küme: " + union( integerSet1, integerSet2) );
         
        
       
        System.out.println("intergerSet1 sıfır elemanına sahiptir: " + integerSet1 );
        
        System.out.println("intergerSet1 != integerSet2: eşittir: " + integerSet1.isEqualTo( integerSet2 ) );
        
        System.out.println("intergerSet2 != integerSet1: eşittir: " + integerSet2.isEqualTo(integerSet1 ) );
        
        integerSet2.insertElement( 0 );
        
        System.out.println("intergerSet1 == integerSet2: eşittir: " + integerSet1.isEqualTo(integerSet2 ) );
        
        integerSet1.deleteElement( 0 );
        
        System.out.println("intergerSet1 boş: " + integerSet1 );
        
        integerSet2.booleanArray[i]=true;
    }
 }
 
