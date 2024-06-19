public class Tv extends Streaming implements Comparable<Tv> {
    // attributes
    int avgMinutes;
    String genre;

    // Constructors
    public Tv() {
        super();
    }

    public Tv(String title, double cost, int avgMinutes, String genre) {
        super(title, cost);
        this.avgMinutes = avgMinutes;
        this.genre = genre;
    }

    // Overridden Method
    public void addCost(double fees, double taxes) {
        double tvTotalCost = cost += fees + taxes;
        System.out.println("This TV shows total cost including additional " +
                "fees and taxes is $" + tvTotalCost);
    }

    // Implementing Comparable interface based on the title
    @Override
    public int compareTo(Tv x) {
        return Integer.compare(this.avgMinutes, x.avgMinutes);
    }
    public String toString() {
        return
                "Title= " + getTitle() +
                ", cost= " + cost +
                ", avgMinutes= " + avgMinutes +
                ", genre= " + genre;
    }
}