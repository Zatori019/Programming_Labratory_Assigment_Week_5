public class TwoDayPackage extends Package{
    double flatFee;

    public TwoDayPackage(String name, String address, String city, String state, String zipCode, double weight, double costPerOunce, double flatFee) {
        super(name, address, city, state, zipCode, weight, costPerOunce);
        this.flatFee = flatFee;
    }

    @Override
    public double calculateCost() { return super.calculateCost() + flatFee; }

    @Override
    public void displayInfo() {
        System.out.println("[Two Day Package]\n" +
                "Name: " + name +
                ", Address: " + address +
                ", City: " + city +
                ", State: " + state +
                ", Zip Code: " + zipCode +
                "\n Weight: " + weight + " | " + "Cost Per Ounce: $" + costPerOunce + " | " + "Flat Fee: $" + flatFee +
                "\n Total shipping cost: $" + calculateCost() +
                "\n==================================================\n");
    }
}
