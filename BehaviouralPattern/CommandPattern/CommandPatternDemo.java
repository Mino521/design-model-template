package BehaviouralPattern.CommandPattern;

public class CommandPatternDemo {
    // Advantages: 1. Reduces system coupling. 2, New commands can be easily added to the system.
    //
    // Disadvantages: the use of command mode may lead to excessive specific command classes in some systems.
    //
    // Usage Scenario: Command mode can be used wherever it is considered a command, for example: 1, every button in the GUI is a command. 2. Simulate CMD.
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
