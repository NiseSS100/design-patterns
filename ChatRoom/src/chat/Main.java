package chat;

public class Main {

    public static void main(String[] args) {

        MessageMediator chat = new Chat();

        User user1 = new ChatUser(chat, "Ivan");
        User user2 = new ChatUser(chat, "Maria");
        User user3 = new ChatUser(chat, "Peter");

        user2.send("Hi, guys");

        user2.send("addBot");

        user2.send("cat");

        user1.send("Hi");

    }
}
