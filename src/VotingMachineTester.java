public class VotingMachineTester {
    public static void main(String[] args){
        VotingMachine test = new VotingMachine();
        test.voteDem(1);
        test.voteRep(1);
        System.out.println(test.getDem());

    }
}
