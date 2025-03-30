
public class CarrierFactory implements ShipFactory{
    public BattleShip createShip(){
        return new Carrier();
    }
}
