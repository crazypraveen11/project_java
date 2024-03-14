package core_java;


public class returntype {

    public String Mymethod(int a, float weight)
    {
          System.out.println(a +"\n"+ weight);
          return "Praveen";
    }
     public static void main(String[] args)
      {
        
        returntype scan = new returntype();

        String name = scan.Mymethod(100, 34.5f);

        System.out.println(name);
     }
}