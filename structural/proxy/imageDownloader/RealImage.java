
public class RealImage implements Image{
    private String fileName;

    private void load(){
        System.out.println("Loading image "+fileName);
    }

    public RealImage(String fileName){
        this.fileName = fileName;
        load();
    }

    public void display(){
        System.out.println("Displaying image: "+fileName);
    }

}
