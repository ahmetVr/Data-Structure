package InterfaceDeneme;

public abstract class Car{
    public void enginePower(int power) {
        System.out.println("This car has " + power  + " motor power.");
    }

    abstract void numberOfWheels(int wheelsNumber);
}
