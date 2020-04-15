public class BeerHouse {

    public static int CAPACIDAD = 100;
    public static int stock;
    public static boolean open;

    public BeerHouse(int stock) {
        this.stock = stock;
        this.open = true;
    }

    public static int getCAPACIDAD() {
        return CAPACIDAD;
    }

    public static int getStock() {
        return stock;
    }

    public static void setStock(int stock) {
        BeerHouse.stock = stock;
    }

    public static boolean isOpen() {
        return open;
    }

    public static void setOpen(boolean open) {
        BeerHouse.open = open;
    }

    public synchronized void receiveBeer(int b) {
        while ((stock + b) > (this.getCAPACIDAD())) {
            System.out.println("El stock de la cerveceria llego a su maxima capacidad, esperando que consuman...");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setStock(this.getStock() + b);
        System.out.println("BeerHouse: He recibido " + b + " cervezas, ahora mi stock es " + this.getStock() + " / " + this.getCAPACIDAD());
    }

    public synchronized int sellBeer(int b) {
        if (this.getStock() < b) {
            int sold = this.getStock();
            this.setStock(0);
            this.setOpen(false);
            return sold;
        } else {
            this.setStock(this.getStock() - b);
            notifyAll();
            return b;
        }
    }
}
