package observer;
import java.util.ArrayList;
import java.util.List;

public class Channel implements Observable{
    private List<Observer> observers;
    private String video;

    public Channel() {
        this.observers = new ArrayList<>();
    }

    public void subscribe(Observer observer) {
        this.observers.add(observer);
        observer.setVideo(this);
    }

    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        for(Observer observer: this.observers) {
            observer.update();
        }
    }

    public String getUpdate() {
        return this.video;
    }

    public void setVideo(String video) {
        this.video = video;
        this.notifyObservers();
    }
}
