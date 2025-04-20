import java.util.*;

public class Sandwich{
    Bread b;
    Protein p;
    Wrapper w;
    List<Side> sides = new ArrayList<>();
    List<Sauce> sauces = new ArrayList<>();

    public String toString(){
        return "Sandwich{" +
                "bread=" + b +
                ", protein=" + p +
                ", wrapper=" + w +
                ", sides=" + sides +
                ", sauces=" + sauces +
                '}';
    }
}

