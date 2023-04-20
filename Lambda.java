package Interface;

@FunctionalInterface
interface Car1
{
    void drive(int avg, int topSpeed);
}


public class Lambda {
    public static void main(String[] args) {
        Car1 obj = (avg, ts) -> System.out.println("Running with avg " + avg +".. .."+ts);


        obj.drive(16, 140);


    }
}
