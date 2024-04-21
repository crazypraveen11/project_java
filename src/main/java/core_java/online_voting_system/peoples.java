package core_java.online_voting_system;

public class peoples 
{
    private int voter_id;
    private String peoples_name;

    public peoples(int voter_id,String peoples_name)
    {
        this.voter_id = voter_id;
        this.peoples_name = peoples_name;
    }
    @Override
    public String toString() {
        return "\t <<<< People's Details >>>> \n Voter ID  = " + voter_id + "\n People Name = " + peoples_name + " ";
    }

    public int getVoter_id() {
        return voter_id;
    }

    public void setVoter_id(int voter_id) {
        this.voter_id = voter_id;
    }

    public String getPeople_name() {
        return peoples_name;
    }

    public void setPeople_name(String people_name) {
        this.peoples_name = people_name;
    } 
}