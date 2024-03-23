package core_java.ifstatement;

public class demoswitch {
    
    public static void main(String[] args) 
    {
        access("subash");
    }

    public static void access(String studentname) {
        switch (studentname) {
            case "praveen":
                System.out.println("praveen in BSC computer science Student..!");
                break;
            case "niranjana":
                System.out.println(" she is AIDS department");
                break;
            case "subash":
                System.out.println("he is mech engi");
                break;
            default:
                System.out.println(" nothing..!");
        }

    }
}
