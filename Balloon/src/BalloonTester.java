public class BalloonTester {
    public static void main(String[] args){
        Balloon test = new Balloon(4);
        test.inflate(0);
        System.out.println(test.getVolume());

    }
}
