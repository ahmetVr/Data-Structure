public class SmithWesson extends Guns{
    private String magazineType;

    public SmithWesson(String type,double bulletDiameter,int magazineCapacity,String country,String magazineType) {
        super(type,bulletDiameter,magazineCapacity,country);
        this.magazineType = magazineType;
    }
    @Override
    public void shotGun() {
        super.shotGun();
        System.out.println("And after shotting with this gun " + this.magazineType + " type magazine wont throw out the bullet.");
    }

    @Override
    public void workPlace() {
        System.out.println("Smith & Wesson is personal weapon.");
    }
}
