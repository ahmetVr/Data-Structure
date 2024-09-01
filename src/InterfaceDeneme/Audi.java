package InterfaceDeneme;

public class Audi extends Car implements IVehicle{
    @Override
    void numberOfWheels(int wheelsNumber) {
        System.out.println("This car is Audi and this car's wheelsNumber: " + wheelsNumber);
    }

    @Override
    public void modelYear(int modelYear) {
        enginePower(111);
        System.out.println("This car is Audi and modelYear is : " + modelYear);
    }


}
