public class Main {
    public static void main(String[] args) {

        DoctorFactory uroFact = new UrologistFactory();
        Doctor urologist = uroFact.createDoctor();
        urologist.treatPatient();

        DoctorFactory cardioFact = new CardiologistFactory();
        Doctor cardiologist = cardioFact.createDoctor();
        cardiologist.treatPatient();
    }
}
