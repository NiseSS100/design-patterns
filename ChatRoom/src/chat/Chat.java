package chat;

import javax.jws.soap.SOAPBinding;
import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class Chat implements MessageMediator {

    private List<User> users;
    private Bot chatBot;

    public Chat() {
        this.users = new ArrayList<>();
        chatBot = Bot.getInstance();
    }

    @Override
    public void sendMessage(String message, User user) {

        if(message.equals("addBot"))
        {
            System.out.println("A bot was added to the chatroom.");
            chatBot.activate();
            return;
        }

        if(message.equals("removeBot"))
        {
            System.out.println("A bot was removed from the chatroom.");
            chatBot.deactivate();
            return;
        }

        for(User chatUser: this.users) {

            if (chatBot.getStatus()) {
                if (chatBot.checkMessage(message)) {
                    System.out.println(user.name + " was kicked for saying a banned word");
                    user.leave();
                    return;
                }
            }

            if (chatUser != user) {
                chatUser.receive(message);

            }
        }

    }


    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void removeUser(User user){
        this.users.remove(user);
    }

}
