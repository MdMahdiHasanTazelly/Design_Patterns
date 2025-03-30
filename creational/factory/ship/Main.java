public class Main {
    public static void main(String[] args) {
        ShipFactory carrierFactory = new CarrierFactory();
        BattleShip carrier = carrierFactory.createShip();
        carrier.fire();
        carrier.steer();


        ShipFactory destroyerFactory = new DestroyerFactory();
        BattleShip destroyer = new Destroyer();
        destroyer.fire();
        destroyer.steer();
    }
}
