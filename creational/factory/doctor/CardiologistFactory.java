public class CardiologistFactory extends DoctorFactory{
    public Doctor createDoctor(){
        return new Cardiologist();
    }
}
