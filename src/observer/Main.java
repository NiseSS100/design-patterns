package observer;

public class Main {

    public static void main(String[] args) {

        Channel video = new Channel();

        Observer obs1 = new Subscriber("Viewer 01");
        Observer obs2 = new Subscriber("Viewer 02");
        Observer obs3 = new Subscriber("Viewer 03");

        video.subscribe(obs1);
        video.subscribe(obs2);
        video.subscribe(obs3);

        video.setVideo("New video of Cats&Dogs.");

        video.setVideo("Watch the latest video of top 10 funny animal moments.");

    }
}
