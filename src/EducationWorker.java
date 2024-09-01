public class EducationWorker extends Worker{

    private String educationProfficy;

    public EducationWorker(String name, String gender, int height, int weight, int age, String jopTitle, int salary,String educationProfficy) {
        super(name, gender, height, weight, age, jopTitle, salary);
        this.educationProfficy = educationProfficy;
    }

    @Override
    public void helloPrinter() {
        super.helloPrinter();
        System.out.println(this.educationProfficy + " " + super.getName() + " ");
    }

}
