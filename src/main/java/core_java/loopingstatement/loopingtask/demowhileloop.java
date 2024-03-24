package core_java.loopingstatement.loopingtask;

public class demowhileloop {
    

    public static void myclass()
    {
        int i = 1;
        while ( i <= 10) 
        {
               if ( i%2 == 0 ) 
               {
                 System.out.println( i + " This is even number" );
               }
               i++;
               
        }
        int a = 1;
        while ( a <= 10 ) 
        {
            if ( a%2 != 0 )
               {
                    System.out.println( a + " This is odd number");
                    
               }
               a++;
            
        }
    }
    public static void main(String[] args) 
    {
        myclass();       
        
    }
}
