public class Guns {

        private String type;
        private double bulletDiameter;
        private int magazineCapacity;
        private String country;

        public Guns(String type,double bulletDiameter,int magazineCapacity,String country) {
            this.type = type;
            this.bulletDiameter = bulletDiameter;
            this.magazineCapacity = magazineCapacity;
            this.country = country;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setBulletDiameter(double bulletDiameter) {
            this.bulletDiameter = bulletDiameter;
        }


        public double getBulletDiameter() {
            return bulletDiameter;
        }

        public void setMagazineCapacity() {
            this.magazineCapacity = magazineCapacity;
        }

        public int getMagazineCapacity() {
            return magazineCapacity;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getCountry() {
            return country;
        }

        public void shotGun() {
            System.out.println("This " + " '" + this.type + "'" + " type weapon producing by " + this.country + " and has " +  this.magazineCapacity + " bullet capacity , and shotting  " + this.bulletDiameter + " mm bullet diameter.");
        }

        public void workPlace() {
            System.out.println("This is a Tactical Weapon.");
        }



    }


