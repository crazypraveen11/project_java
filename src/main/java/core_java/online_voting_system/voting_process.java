package core_java.online_voting_system;

import java.util.Scanner;

public class voting_process implements political_parties_implementation, people_implementation
{
    static Scanner scan = new Scanner(System.in);

    @Override
    public political_parties addnew_Parties(political_parties partiesdetails) 
    {
        
        return partiesdetails;
    }

    @Override
    public void find_partiesname(String Partiesname) {
       
        
    }

    @Override
    public void listall_parties() 
    {
           
        
    }

    @Override
    public int update_parties(String Partiesname) 
    {
        
        return 0;
    }

    @Override
    public peoples addPeoples(peoples people_details) 
    {
       
        return people_details;
    }

    @Override
    public void listall_people_details() 
    {
        
    }

    @Override
    public void update_people_details() 
    {
        
        
    }

    public static void main(String[] args) 
    {
        voting_process vote = new voting_process();
        
    }


    
}
