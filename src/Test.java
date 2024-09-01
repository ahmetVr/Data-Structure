//import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Test {
    public static void main(String[] args) {
    /*    Person person1 = new Person("Kerem","Male",190,90,25);
        Worker worker1 = new Worker("Ahmet","Male",184,80,30,"Police Officer",3000);
        EducationWorker educationWorker1 = new EducationWorker("Efe","Male",189,89,25,"Developer",4000,"Softwafre");

    //    System.out.println(person1);
        System.out.println(worker1);
        worker1.helloPrinter();
        educationWorker1.helloPrinter();
*/
       /*  Guns gun = new Guns("AK47",7.62,30,"Russia");
        Glock glock = new Glock("pistol",9.19,15,"Australia",false);
        FnMinimi fnMinimi = new FnMinimi("Machine Gun",5.56,200,"Belgium",850);
        SmithWesson smithWesson = new SmithWesson("pistol",9.65,6,"USA","revolver");
        glock.shotGun();
        fnMinimi.shotGun();
        smithWesson.shotGun(); */
        Guns glock = new Glock("pistol",9.19,15,"Australia",false);
        glock.shotGun();
        glock.workPlace();


    }



}
