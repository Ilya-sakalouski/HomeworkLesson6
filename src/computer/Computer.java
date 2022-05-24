package src.computer;

public class Computer {
    int price;
    String model;

    public Computer(int price, String model) {
        this.price = price;
        this.model = model;
    }

    public Computer(int price, String model, RAM ram, HDD hdd ) {
        this.price = price;
        this.model = model;

    }

    public void currentComputerInfo(RAM ram, HDD hdd) {
        System.out.print("Price= " + price + ", model: " + model );
        ram.ramCurrentValue();
        hdd.hddCurrentValue();

    }
}
