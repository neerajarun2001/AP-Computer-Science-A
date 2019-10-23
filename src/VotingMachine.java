public class VotingMachine {
    private int total;
    private int repVotes;
    private int demVotes;

    public VotingMachine(){

    }
    public void voteRep(int num){
        repVotes = repVotes + num;
        total = total + num;
    }
    public void voteDem(int num){
        demVotes = demVotes + num;
        total = total + num;
    }
    public void clearMachine(){
        total = 0;
    }
    public int getRep(){
        return repVotes;
    }
    public int getDem(){
        return demVotes;
    }
    public int getTotal(){
        return total;
    }
}
