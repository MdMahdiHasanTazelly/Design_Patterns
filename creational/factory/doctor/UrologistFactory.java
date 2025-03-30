public class UrologistFactory extends DoctorFactory{
    public Doctor createDoctor(){
        return new Urologist();
    }
}
