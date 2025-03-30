
public class DestroyerFactory implements ShipFactory{
    public BattleShip createShip(){
        return new Destroyer();
    }
}
