
public class ProxyImage implements Image{
    String fileName;
    RealImage realImage;

    public ProxyImage(String fileName){
        this.realImage = null;
        this.fileName = fileName;
    }

    public void display(){
        if( realImage == null ){
            //lazy initialization
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
