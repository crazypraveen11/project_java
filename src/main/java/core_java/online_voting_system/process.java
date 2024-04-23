package core_java.online_voting_system;

import java.util.Scanner;

public class process implements political_parties_implementation,peoples_implementation
{
    political_parties [] party_space = new political_parties[2];
    peoples [] people_space = new peoples[2];
    static Scanner scan = new Scanner(System.in);

    static
    {
        System.out.println("\t         <<<  HII Welcome to our Online Voting System  >>> \n <<<  For Voting Process your's age can be 18 and above can be eligible to Vote  >>>");
    }
    @Override
    public political_parties addnew_parties(political_parties team) 
    {
        try
        {
            for(int i = 0; i <party_space.length; i++)
         {
            if (party_space[i] == null) 
            {
                party_space[i] = team;
                System.out.println( team.getPolitical_parties_name() + " has been added successfully..!");   
                return  party_space[i];
            }
         } 
         throw new voting_exception();
        }  
        catch(voting_exception ve)
        {
            System.out.println(ve);
            System.out.println("\n If you want to add one, you need to delete from this List");
            listall_parties();
            System.out.println("Please select any one from this list \nWhich name you want to delete ");
            delete_parties();
            addnew_parties(team);
        }
        return team;
    }

    @Override
    public void delete_parties() 
    {
        System.out.println(" <<< You choose to delete a particular field in Political Parties >>>");
        System.out.println("1)Political Party name \n2)Political Party Flag");
        System.out.println(" Please choose any one from the field");
        int process = scan.nextInt();

        switch(process)
        {
            case 1:
             System.out.println("\t <<< You choose to delete by Political Party name >>>");
             System.out.println(" Enter the Political Party name");
             String partyname = scan.next();
             for(int a = 0; a < party_space.length; a++)
             {
                if(party_space[a].getPolitical_parties_name().equalsIgnoreCase(partyname))
                {
                    party_space[a] = null;
                    System.out.println( partyname + " has been deleted successfully...!");
                    return;
                }
             }
            break;
            case 2:
              System.out.println(" \t <<< You choose to delete by Political Party Flag name >>>");
              System.out.println(" Enter the Political Party Flag name");
              String flagname = scan.next();
              for(int a = 0; a < party_space.length; a++)
              {
                if(party_space[a].getPolitical_parties_flag().equalsIgnoreCase(flagname))
                {
                    party_space[a] = null;
                    System.out.println( flagname + " has been deleted successfully..!");
                    return;
                }
              }
            break;
            default:
             System.out.println(" You entered wrong number...!");
            break;
        }  
    }

    @Override
    public void listall_parties() 
    {
        for(political_parties get : party_space)
        {
            System.out.println(get);
        }
    }

    @Override
    public void search_parties(String party_name) 
    {
        for(int a = 0; a < party_space.length; a++)
        {
            if (party_name.equalsIgnoreCase(party_space[a].getPolitical_parties_name())) 
            {
                System.out.println( party_space[a] + " has been founded at no : "+ (a+1) + " position");  
                break; 
            }
            else
            {
                System.out.println("<<< You entered Party cannot be Found  >>>");
            }
        }     
    }

    // @Override
    // public String update_parties(String party_name) 
    // {
    //     System.out.println(" Party List : " );
    //     for(int a = 0; a < party_space.length; a++)
    //     {
    //         if(party_name.equalsIgnoreCase(party_space[a].getPolitical_parties_name()))
    //         {
    //             System.out.println(party_space[a]);
    //             System.out.println("<<< Please enter a new party name to update  >>>");
    //             String newparty = scan.next();

    //             party_space[a].setPolitical_parties_name(newparty);
    //             System.out.println(party_space[a].getPolitical_parties_name() + " has been updated successfully...!");
    //             listall_parties();
    //             break;
    //         }
    //     }
        
    //     return party_name;
    // }
     public void update_parties()
     {
        System.out.println(" <<< Update a field in Political Parties is by Two Field Ways >>>");
        System.out.println("1)Political Party Name \n2)Political Party Flag Name");
        System.out.println("<< Choose one field from this >>");
        int process = scan.nextInt();

        switch(process)
        {
            case 1:
             System.out.println("\t <<< You choose by Political Party Name >>>");
             System.out.println(" Enter Political Party Name");
             String party = scan.next();
             for(int a = 0; a < party_space.length; a++)
             {
                if(party.equalsIgnoreCase(party_space[a].getPolitical_parties_name()))
                {
                    System.out.println( party_space[a]);
                    System.out.println(" Enter a new Party name to change");
                    String newparty = scan.next();

                    party_space[a].setPolitical_parties_name(newparty);
                    System.out.println( party_space[a].getPolitical_parties_name() + " has been updated successfully..!");
                    listall_parties();
                    break;
                }
             }
            break;
            case 2:
                System.out.println("\t <<< You choose by Political Party Flag Name >>>");
                System.out.println(" Enter Political Party Flag Name");
                String flagname = scan.next();

                for(int a = 0; a < party_space.length; a++)
                {
                    if(flagname.equalsIgnoreCase(party_space[a].getPolitical_parties_flag()))
                    {
                        System.out.println(party_space[a]);
                       System.out.println(" Enter a new Flag name to change");
                       String flag = scan.next();
                       party_space[a].setPolitical_parties_flag(flag);
                       System.out.println( party_space[a].getPolitical_parties_flag() + " has been updated successfully...!");
                        break;
                    }
                }
            break;
            default:
            System.out.println(" You entered wrong number");
            break;
        }
     }

    @Override
    public peoples addnew_peoples(peoples members) 
    {
        try
        {
            for(int a = 0; a < people_space.length; a++)
        {
            if (people_space[a] == null) 
            {
                people_space[a] = members;
                System.out.println( members.getPeople_name() + " has been added Successfully...!");  
                return people_space[a];
            }
            throw new voting_exception();
        }
        }
        catch(voting_exception ve)
        {
            System.out.println(ve);
            System.out.println("\n If you want to add one, you need to delete from this List");
            listall_peoples();
            System.out.println("Please select any one from this list \nWhich name you want to delete ");
            delete_peoples();
            addnew_peoples(members);
        }
        return members;
    }

    @Override
    public void delete_peoples() 
    {
        System.out.println(" <<< You choose to delete a particular field name >>>");
        System.out.println("1) By Voter Id \n2) People Name");
        System.out.println(" Enter any one number to delete the field");
        int process = scan.nextInt();

        switch (process) {
            case 1:
                System.out.println(" \t <<< You choose to delete by Voter Id >>>");
                System.out.println(" Please enter your Voter Id");
                int id = scan.nextInt();
                for(int a = 0; a < people_space.length; a++)
                {
                    if(people_space[a].getVoter_id() == id)
                    {
                        people_space[a] = null;
                        System.out.println( id + " has been deleted successfully..!");
                        return;
                    }
                }
                break;
            case 2:
                System.out.println("\t  <<< You choose to delete by People Name >>>");
                System.out.println(" Please enter the People Name");
                String people = scan.next();

                for(int a = 0; a < people_space.length; a++)
                {
                    if(people_space[a].getPeople_name().equalsIgnoreCase(people))
                    {
                        people_space[a] = null;
                        System.out.println( people + " has been deleted successfully...!");
                        return;
                    }
                }
            break;
            default:
                System.out.println("You entered wrong number");
                break;
        }
    }

    @Override
    public void listall_peoples() 
    {
        for(peoples get : people_space)
        {
            System.out.println(get);
        }
    }

    @Override
    public void search_people(String people_name) 
    {
        for(int a=0; a < people_space.length; a++)
        {
            if(people_name.equalsIgnoreCase(people_space[a].getPeople_name()))
            {
                System.out.println( people_space[a] + " has been founded at " + " no : " + (a+1) + " position"); 
                break;
            }
            else
            {
                System.out.println(" You entered people cannot be found...!");
            }
        }
        
    }

    

    // @Override
    // public String update_peoples(String people_name) 
    // {
    //     System.out.println("People list : ");
    //     for(int a=0; a < people_space.length; a++)
    //     {
    //         if(people_name.equalsIgnoreCase(people_space[a].getPeople_name()))
    //         {
    //             System.out.println(people_space[a]);
    //             System.out.println("Please enter new people name to change...!");
    //             String newpeople = scan.next();

    //             people_space[a].setPeople_name(newpeople);
    //             System.out.println(people_space[a].getPeople_name() + " has been updated successfully...!");
    //             listall_peoples();
    //             break;
    //         }

    //     }
    //     return people_name;
    // }
    public void update_peoples()
    {
        System.out.println(" <<< Update a field in Peoples is by Two Field Ways >>>");
        System.out.println("1)Voter ID \n2)Peoples Name");
        System.out.println("<< Choose one field from this >>");
        int process = scan.nextInt();

        switch (process) {
            case 1: 
                System.out.println(" \t <<< You choose to update by Voter ID >>>");
                System.out.println(" Enter Voter ID");
                int id = scan.nextInt();
                for(int a = 0; a < people_space.length; a++)
                {
                    if(people_space[a].getVoter_id() == id)
                    {
                        System.out.println( people_space[a]);
                        System.out.println(" Enter a new Voter ID to change");
                        int change = scan.nextInt();

                        people_space[a].setVoter_id(change);
                        System.out.println( people_space[a].getVoter_id() + " has been updated successfully...!");
                        listall_peoples();
                        break;
                    }
                }
                break;
            case 2:
            System.out.println(" \t  <<< You choose to update by People Name >>>");
            System.out.println(" Enter People Name");
            String name = scan.next();
            for(int a=0; a<people_space.length; a++)
            {
                if(name.equalsIgnoreCase(people_space[a].getPeople_name()))
                {
                    System.out.println( people_space[a]);
                    System.out.println(" Enter a new People Name to change");
                    String newname = scan.next();
                    people_space[a].setPeople_name(newname);
                    System.out.println( people_space[a].getPeople_name() + " has been updated successfully..!");
                    listall_peoples();
                    break;
                }
            }
            break;
            default:
               System.out.println("<< You entered a wrong number >>");
                break;
        }
    }

    public static void main(String[] args) 
    {
        process vote = new process();
        System.out.println(" Enter your Age");
        int age = scan.nextInt();
        if(age >= 18)
        {
            System.out.println("\t <<<< You are eligible to vote for a Candidates >>>>");
            System.out.println("\t <<<< The Voting process has been begins  >>>>");
            System.out.println("\t <<<< Please fill the following formalities to initialize the Voting process  >>>>");
         do
            {      
            System.out.println(" \n 1) Add new Parties \n 2) Listall Parties \n 3) Update Parties \n 4) Search Parties \n 5) Delete Parties \n \n 6) Add new People \n 7) Listall People \n 8) Update People \n 9) Search People \n 10) Delete People \n 11) EXIT");
            System.out.println("Please choose any process");
            int choose = scan.nextInt();
            switch (choose) {
                case 1:
                System.out.println("\t <<< You choose to Add new Parties >>>");
                System.out.println(" Enter Your Parties Name");
                String party_name = scan.next();
                System.out.println(" Enter your Parties Flag");
                String flag_name = scan.next();

                political_parties newparty = new political_parties(party_name, flag_name);
                vote.addnew_parties(newparty);
                break;
                case 2:
                   vote.listall_parties();
                break;
                case 3:
                //   System.out.println("You choose party name can be update into a new name \n Please enter the name");
                //   String newname = scan.next();
                //   vote.update_parties(newname);
                 vote.update_parties();
                  break;
                case 4:
                 System.out.println(" Which Parties you want to Search ");
                 String party = scan.next();
                 vote.search_parties(party);
                break;
                case 5:
                  vote.delete_parties();
                break;
                case 6:
                System.out.println("\t <<< You choose to Add new People >>>");
                System.out.println(" Enter Your Voter ID");
                int voter_id = scan.nextInt();
                System.out.println(" Enter your Name");
                String people_name = scan.next();
                
                peoples new_people = new peoples(voter_id, people_name);
                vote.addnew_peoples(new_people);
                break;
                case 7:
                vote.listall_peoples();
                break;
                case 8:
                //   System.out.println("You choose to People name can be update to new name \n Please enter People name");
                //   String newpeople = scan.next();
                //   vote.update_peoples(newpeople);
                 vote.update_peoples();
                break;
                case 9:
                System.out.println(" <<< You choose to search People in this System Please enter the name >>>");
                String search_people = scan.next();
                vote.search_people(search_people);
                break;
                case 10:
                  vote.delete_peoples();
                break;
                case 11:
                return;
                default:
                System.out.println(" \t <<<<  Please Choose the Correct Number  >>>>");
                break;
            }
        }
        while(true);
            }
        else
        {
            System.out.println("\t \t \t ---- SORRY ----");
            System.out.println(" <<<  Your's Age is below 18, So you are not eligible to Vote for a Candidate >>>");
            return;
        }
    }
}
