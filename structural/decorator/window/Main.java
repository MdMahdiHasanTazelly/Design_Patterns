
public class Main {
    public static void main(String[] args) {
        ConcreteWindow window = new ConcreteWindow();
        window.draw();

        ScroolbarWindow scroolWindow = new ScroolbarWindow(window);
        scroolWindow.draw();
    }
}
