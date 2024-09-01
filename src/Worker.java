public class Worker extends Person{

    private String jopTitle;
    private int salary;

    public Worker(String name, String gender, int height, int weight, int age,String jopTitle,int salary) {
        super(name, gender, height, weight, age);
        this.jopTitle = jopTitle;
        this.salary = salary;
    }

    public String getJopTitle() {
        return jopTitle;
    }

    public void setJopTitle(String jopTitle) {
        this.jopTitle = jopTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return  super.toString().substring(0,super.toString().length()-1) +
                ", jopTitle : " + this.jopTitle +
                ", salary : " + this.salary + " }";
    }

    @Override
    public void helloPrinter() {
        System.out.println(getJopTitle() + " " + getName() + " says Hello.");
    }


}
