public class Package {
    String name, address,city,state,zipCode;
    double weight,costPerOunce;

    public Package(String name, String address, String city, String state, String zipCode, double weight, double costPerOunce) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        if (weight <= 0) System.out.println("Weight cannot be lower than 0!");
        else this.weight = weight;
        if (costPerOunce <= 0) System.out.println("Cost per ounce cannot be lower than 0!");
        else this.costPerOunce = costPerOunce;
    }

    public double calculateCost() { return weight * costPerOunce; }

    public void displayInfo() {
        System.out.println("[Standart Package]\n" +
                "Name: " + name +
                ", Address: " + address +
                ", City: " + city +
                ", State: " + state +
                ", Zip Code: " + zipCode +
                "\n Weight: " + weight + " | " + "Cost Per Ounce: $" + costPerOunce +
                "\n Total shipping cost: $" + calculateCost() +
                "\n==================================================\n");
    }
}
