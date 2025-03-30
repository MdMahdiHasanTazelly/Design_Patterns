public abstract class DoctorFactory {
    public DoctorFactory(){
        System.out.println("Doctor factory is called.");
    }
    public abstract Doctor createDoctor();
}
