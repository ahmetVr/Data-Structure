package InterfaceDeneme;

public class Bmw extends Car implements IVehicle{

    @Override
    void numberOfWheels(int wheelsNumber) {
        System.out.println("This is bmw's wheelsNumber : " + wheelsNumber);
        enginePower(3);
    }



    @Override
    public void modelYear(int modelYear) {
        System.out.println("This car is Bmw ans this car's modelYear is: " + modelYear);
    }
}
