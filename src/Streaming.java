public class Streaming {
    //super attributes
    private String title;
    public double cost;

    //Constructors
    public Streaming() {
    }

    public Streaming(String title, double cost) {
        this.title = title;
        this.cost = cost;
    }

    //Getter and Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //Super Method
    public void addCost(double fees, double taxes) {
        double streamingTotalCost = cost += fees + taxes;
        System.out.println("This streaming services total cost including additional " +
                "fees and taxes is $" + streamingTotalCost);
    }
}

