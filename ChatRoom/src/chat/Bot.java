package chat;

public class Bot {
    private static Bot instance;

    private boolean isActive;

    private Bot() {
        isActive = false;
    }

    public static Bot getInstance() {

        if(instance == null) {
            instance = new Bot();
        }

        return instance;
    }

    public void activate(){
        isActive = true;
    }

    public void deactivate(){
        isActive = false;
    }

    public boolean getStatus(){
        return isActive;
    }


    public boolean checkMessage(String message) {
        if (message.contains("cat")){
            return true;
        }
        return false;
    }
}
