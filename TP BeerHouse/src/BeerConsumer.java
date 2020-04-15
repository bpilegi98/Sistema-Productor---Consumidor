public class BeerConsumer extends Thread{
    private String firstname;
    private BeerHouse b;

    public BeerConsumer(String firstname, BeerHouse b) {
        super();
        this.firstname = firstname;
        this.b = b;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public BeerHouse getB() {
        return b;
    }

    public void setB(BeerHouse b) {
        this.b = b;
    }

    public int consume() {
        int consumed = (int) (Math.random() * 15) + 2;
        int bought = this.b.sellBeer(consumed);
        if (consumed == bought) {
            System.out.println("Consumidor " + this.firstname + ": Compre " + consumed + " cervezas.");
        } else {
            System.out.println("Consumidor " + this.firstname + ": Solo pude comprar  " + bought + " cervezas.");

        }
        return bought;
    }

    public void run() {
        while (this.b.isOpen()) {
            this.consume();
        }
        System.out.println("Consumidor " + this.firstname + ": La cerveceria cerro, ya no puedo consumir mas cerveza.");
    }
}
