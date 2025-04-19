
public class Main {
    public static void main(String[] args) {
        PancakeHouseMenu pancake = new PancakeHouseMenu();
        DinerMenu diner = new DinerMenu();

        System.out.println("Breakfast Menu Item");
        for( MenuItem item: pancake.getMenuItem() ){
            System.out.println(item.getName() + " - " + item.getDescription() + " - $" + item.getPrice());
        }


        System.out.println("\n\nLunch Menu Items:");
        for(MenuItem item: diner.getItems() ){
            System.out.println(item.getName() + " - " + item.getDescription() + " - $" + item.getPrice());
        }


    }
}
