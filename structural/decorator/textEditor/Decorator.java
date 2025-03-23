
public class Decorator extends ConcreteEditor{
    private ConcreteEditor editor;
    public Decorator(ConcreteEditor editor) {
        this.editor = editor;
    }
    
    public void editor(){
    }
}
