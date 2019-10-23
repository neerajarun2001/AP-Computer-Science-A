public class Balloon {
    private double radius;
    private double volume;
    public Balloon(double balloonRadius){
        radius = balloonRadius;
    }

    public void inflate(double amount){
        radius = radius + amount;
    }

    public double getVolume(){
        volume = (4 * Math.PI * radius * radius * radius)/3;
        return volume;
    }
}
