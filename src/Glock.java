public class Glock extends Guns{
    private boolean polymer;
    public Glock(String type,double bulletDiameter,int magazineCapacity,String country,boolean polymer) {
        super(type,bulletDiameter,magazineCapacity,country);
        this.polymer = polymer;
    }

     @Override
    public void shotGun() {
        super.shotGun();
        System.out.println("People have a incorrect information about this gun.'Glock's type is Polymer...' information is " + this.polymer + ".");
    }

    @Override
    public void workPlace() {
        super.workPlace();
        System.out.println("Glock is the most commonly using in 'hostage' operations.");
    }
}
