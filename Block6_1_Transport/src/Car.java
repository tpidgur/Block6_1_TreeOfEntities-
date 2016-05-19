/**
 * Created by Зая on 19.05.2016.
 */
public class Car extends Vehicle {
    public Car(String serialNumber, String model) {
        setSerialNumber(serialNumber);
        setModel(model);
    }

    @Override
    public void move() {
        System.out.println("Car has crossed the road");
    }
}
