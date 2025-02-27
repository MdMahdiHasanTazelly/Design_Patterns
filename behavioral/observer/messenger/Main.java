
public class Main {
    public static void main(String[] args) {
        GroupChat chat = new GroupChat();

        Friends friend1 = new Friends("friend1");
        Friends friend2 = new Friends("friend2");
        Friends friend3 = new Friends("friend3");

        chat.subscribe(friend1);
        chat.subscribe(friend2);
        chat.subscribe(friend3);
        chat.sendMessage("DEMO MESSAGE!");

        System.out.println("--------After removing one Observer----------");

        chat.unsubscribe(friend2);
        chat.sendMessage("AFTER REMOVING");


    }
}
