/**
 * Created by Зая on 19.05.2016.
 */
public class MotorBike extends Vehicle {

    public MotorBike(String serialNumber, String model) {
        setSerialNumber(serialNumber);
        setModel(model);
    }

    @Override
    public void move() {
        System.out.println("Bike has crossed the road");
    }
}
