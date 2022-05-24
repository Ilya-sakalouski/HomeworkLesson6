package src.runner;

import src.computer.Computer;
import src.computer.HDD;
import src.computer.RAM;
import src.creditCard.CreditCard;

public class Homework6Runner {
    public static void main(String[] args) {
        // TODO  Задача 1:

        CreditCard creditCard1 = new CreditCard(1, 1000);
        CreditCard creditCard2 = new CreditCard(2, 2000);
        CreditCard creditCard3 = new CreditCard(3, 3000);

        creditCard1.addMoney(1,500);
        creditCard2.addMoney(2,400);
        creditCard3.withdrawMoney(3, 1000);
        creditCard1.accountCurrentValue();
        creditCard2.accountCurrentValue();
        creditCard3.accountCurrentValue();

        System.out.println("\n");

        // TODO Задача 2:

        RAM ram1 = new RAM("Ram1", 500);
        RAM ram2 = new RAM("Ram2", 800);
        HDD hdd1 = new HDD("Hdd1", 1000, true);
        HDD hdd2 = new HDD("Hdd2", 1500, false);

        Computer computer1 = new Computer(1000, "Asus", ram1, hdd1);
        Computer computer2 = new Computer(2000, "Dell", ram2, hdd2);
        computer1.currentComputerInfo(ram1,hdd1);
        computer2.currentComputerInfo(ram2,hdd2);

    }
}
