
public class Main {
    public static void main(String[] args) {
        ConcreteEditor editor = new ConcreteEditor();
        editor.write();
        
        SpellChecker spellEditor = new SpellChecker(editor);
        spellEditor.write();
    }
}
