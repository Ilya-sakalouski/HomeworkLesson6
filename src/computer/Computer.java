package src.computer;

public class Computer {
    int price;
    String model;

    public Computer(int price, String model) {
        this.price = price;
        this.model = model;
    }

    public Computer(int price, String model, RAM ram1, HDD hdd1 ) {
        this.price = price;
        this.model = model;

    }

    public void currentComputerInfo() {
        System.out.print("Price= " + price + ", model: " + model);

    }
}
