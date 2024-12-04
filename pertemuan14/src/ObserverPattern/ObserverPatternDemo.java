package ObserverPattern;
public class ObserverPatternDemo {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        // Create observers
        NewsChannel channel1 = new NewsChannel("Channel 1");
        NewsChannel channel2 = new NewsChannel("Channel 2");

        // Register observers
        newsAgency.addObserver(channel1);
        newsAgency.addObserver(channel2);

        // Set news which will notify observers
        newsAgency.setNews("Breaking News: Design Patterns are amazing!");
    }
}
