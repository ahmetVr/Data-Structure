public class FnMinimi extends Guns{
    private int bulletRateOfFire;

    public FnMinimi(String type,double bulletDiameter,int magazineCapacity,String country,int bulletRateOfFire) {
        super(type,bulletDiameter,magazineCapacity,country);
        this.bulletRateOfFire = bulletRateOfFire;
    }

    @Override
    public void shotGun() {
        System.out.println("This " + " '" + this.getType() + "'" + " type weapon producing by " + this.getCountry() + " and has " +  this.getMagazineCapacity() + " bullet capacity , and shotting  " + this.bulletRateOfFire + " time " + this.getBulletDiameter() + " mm diameter bullet in a minute.");
    }

    @Override
    public void workPlace() {
        super.workPlace();
        System.out.println("Fn Minimi is most commonly using in Land Operations.");
    }
}
