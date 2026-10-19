public class OvernightPackage extends Package{
    double additionalFeePerOunce;

    public OvernightPackage(String name, String address, String city, String state, String zipCode, double weight, double costPerOunce, double additionalFeePerOunce) {
        super(name, address, city, state, zipCode, weight, costPerOunce);
        this.additionalFeePerOunce = additionalFeePerOunce;
    }

    @Override
    public double calculateCost() { return super.calculateCost() + (weight * additionalFeePerOunce); }

    @Override
    public void displayInfo() {
        System.out.println("[Overnight Package]\n" +
                "Name: " + name +
                ", Address: " + address +
                ", City: " + city +
                ", State: " + state +
                ", Zip Code: " + zipCode +
                "\n Weight: " + weight + " | " + "Cost Per Ounce: $" + costPerOunce + " | " + "Additional Fee Per Ounce: $" + additionalFeePerOunce +
                "\n Total shipping cost: $" + calculateCost() +
                "\n==================================================\n");
    }
}
