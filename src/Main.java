
public class Main {
    public static void main(String[] args) {
        Package pack1 = new Package("Ahmet", "asdf", "Kayseri", "Kocasinan", "38000", 10, 3.5);
        Package pack2 = new TwoDayPackage("Ahmet", "asdf", "Kayseri", "Kocasinan", "38000", 15, 4, 5);
        Package pack3 = new OvernightPackage("Ahmet", "asdf", "Kayseri", "Kocasinan", "38000", 20, 2, 1.5);

        pack1.displayInfo();
        pack2.displayInfo();
        pack3.displayInfo();
    }
}