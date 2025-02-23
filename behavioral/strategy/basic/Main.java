
public class Main {
   public static void main(String[] args) {
       Context context = new Context();

       context.setStrategy( new ConcreteStrategyA() );
       context.contextExecute();

       context.setStrategy( new ConcreteStrategyB() );
       context.contextExecute();
   } 
}
