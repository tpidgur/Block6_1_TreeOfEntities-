import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Зая on 19.05.2016.
 */
public class Journal implements Statistics { //contains information about the vehicles that passed the crossroad
    private ArrayList<Vehicle> vehicle = new ArrayList<>();


    @Override
    public int countCarTotal() {
        return vehicle.size();
    }

    @Override
    public int countCarInGroup(Class vehicleType) {
        int numberSpecific = 0;
        Iterator<Vehicle> itr = vehicle.iterator();
        while (itr.hasNext()) {
            Vehicle element = itr.next();
            if (element.getClass() == vehicleType) {
                numberSpecific++;
            }
        }
        return numberSpecific;
    }

    @Override
    public boolean findTransport(Class vehicleType, String serial, String model) {
        Iterator<Vehicle> itr = vehicle.iterator();
        while (itr.hasNext()) {
            Vehicle element = itr.next();
            if ((element.getClass() == vehicleType) &
                    (element.getSerialNumber().equals(serial)) &
                    (element.getModel().equals(model))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void addVehicle(Vehicle veh) {
        vehicle.add(veh);
        veh.move();
    }



    public ArrayList<Vehicle> getVehicle() {
        return vehicle;
    }


    @Override
    public String toString() {
        return "The total number of vehicles that crossed the road " + countCarTotal() +
                " among them the number of trucks " + countCarInGroup(AutoTruck.class);
    }
}
