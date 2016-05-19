/**
 * Created by Зая on 20.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Journal journal = new Journal();

        journal.addVehicle(new Car("JF1SF615XXG700001", "Toyota"));
        journal.addVehicle(new AutoTruck("JJ1SS000SSS000001", "Zik"));
        journal.addVehicle(new AutoTruck("AA1SS111SSS111111", "Nik"));
        journal.addVehicle(new MotorBike("BB1SS222SSS222222", "Honda"));
        journal.addVehicle(new MotorBike("CC1SS333SSS333333", "Suzuki"));
        journal.addVehicle(new MotorBike("CA23434B", "YAMAHA"));

        ///System.out.println(journal.countCarTotal());
        //System.out.println(journal.countCarInGroup(AutoTruck.class));
        System.out.println(journal);
        System.out.println("Did the MotorBike CA23434B, YAMAHA passed the crossroad?- "+journal.findTransport(MotorBike.class,"CA23434B", "YAMAHA"));
    }
}
