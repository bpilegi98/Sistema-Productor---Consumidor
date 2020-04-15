public class BeerProducter extends Thread{
    private String firstname;
    private BeerHouse b;

    public BeerProducter(String firstname, BeerHouse b) {
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

    public int produce() throws InterruptedException {
        int produced = (int) (Math.random() * 10) + 2;
        this.b.receiveBeer(produced);
        System.out.println("Productor " + this.firstname + ": Vendi " + produced + " cervezas a BeerHouse.");
        return produced;
    }

    public void run() {
        while (this.b.isOpen()) {
            try {
                this.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Productor " + this.firstname + ": La cerveceria cerro, ya no puedo venderle mis productos.");
    }
}
