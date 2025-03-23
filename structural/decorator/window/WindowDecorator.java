public class WindowDecorator implements Window {
    private Window decorateWindow;
    public WindowDecorator(Window window){
        this.decorateWindow = window;
    } 

    public void draw(){
    }
}
