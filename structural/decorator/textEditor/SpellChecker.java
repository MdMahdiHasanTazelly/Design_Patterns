
public class SpellChecker extends Decorator{
    public SpellChecker(ConcreteEditor editor){
        super(editor);
    }

    public void write(){
        System.out.println("This is Spell checker editor.");
    }
}
