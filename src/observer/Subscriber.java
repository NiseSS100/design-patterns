package observer;

public class Subscriber implements Observer {
    private String name;
    private Observable video;


    public Subscriber(String name) {
        this.name = name;
    }

    public void update() {
        if(this.video == null) {
            System.out.println(this.getName() + " hasn't subscribed to any channel yet. ");
            return;
        }
        String latestVideo = this.video.getUpdate();
        System.out.println(this.getName() + " received the new video: " + latestVideo);
    }

    public void setVideo(Observable video) {
        this.video = video;
    }

    public String getName() {
        return name;
    }
}
