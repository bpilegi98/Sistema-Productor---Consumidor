public class Main {
    public static void main(String[] args) {

        BeerHouse beerHouse = new BeerHouse(25);
        BeerConsumer consumer = new BeerConsumer("Bianca", beerHouse);
        BeerProducter producter = new BeerProducter("Juan", beerHouse);

        producter.start();
        consumer.start();
    }
}
