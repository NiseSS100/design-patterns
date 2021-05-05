package chat;

public class ChatUser extends User {


    public ChatUser(MessageMediator mediator, String name) {
        super(mediator, name);
        mediator.addUser(this);
    }

    @Override
    public void send(String message) {
        if(mediator != null) {
            System.out.println(this.name + " sends: " + message);
            this.mediator.sendMessage(message, this);
        }
    }

    @Override
    public void receive(String message) {
        if(mediator != null) {
            System.out.println(this.name + " received: " + message);
        }
    }

    @Override
    public void join(MessageMediator chat) {
        if(mediator==null)
        {
            System.out.println(this.name + " joined the chatroom.");
            mediator = chat;
        }

    }

    @Override
    public void leave() {
        System.out.println(this.name + " was removed from the chatroom.");
        mediator = null;
    }

}
