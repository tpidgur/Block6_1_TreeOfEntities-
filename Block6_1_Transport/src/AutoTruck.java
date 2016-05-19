/**
 * Created by Зая on 19.05.2016.
 */
public class AutoTruck extends Vehicle {
    public AutoTruck(String serialNumber, String model) {
        setSerialNumber(serialNumber);
        setModel(model);
    }

    @Override
    public void move() {
        System.out.println("Autotruck has crossed the road");
    }
}

