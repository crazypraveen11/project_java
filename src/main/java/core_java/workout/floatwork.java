package core_java.workout;

public class floatwork 
{
    public static void main(String[] args) 
    {
        float [] values = {2.0f,3.2f,4.7f,7.0f,9.9f,10.3f,11.0f,13.0f,15.7f};

        int a = 0;
        for( ; a<values.length;a++)
        {
            int b = (int) values[a];
            if(b%2 == 0)
            {
                System.out.println("This is even number " +values[a]);
            }
            if(b%2 != 0)
            {
                System.out.println("This is Odd number " + values[a]);
            }
        }

       
    }
    
}
