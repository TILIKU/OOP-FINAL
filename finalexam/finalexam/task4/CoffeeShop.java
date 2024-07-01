package finalexam.task4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CoffeeShop implements LegalEntity {
    private List<String> orders = new ArrayList<>();
    private final String saveFilePath;

    // Constructor that sets the file path for orders
    public CoffeeShop() {
        this.saveFilePath = "finalexam" + File.separator + "task4" + File.separator + "coffee_orders.txt";
    }

    // Method to add an order
    public void addOrder(String order) {
        orders.add(order);
    }

    // Method to delete an order
    public boolean deleteOrder(String order) {
        return orders.remove(order);
    }

    // Method to list all orders
    public List<String> listAllOrders() {
        return new ArrayList<>(orders); // Return a copy of the orders list to prevent external modifications
    }

    // Method to save orders to a file
    public void saveOrdersToFile() {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(saveFilePath)))) {
            for (String order : orders) {
                writer.println(order);
            }
            System.out.println("Orders saved to " + saveFilePath);
        } catch (IOException e) {
            System.err.println("Error saving orders to file: " + e.getMessage());
        }
    }

    // Method to load orders from a file
    public void loadOrdersFromFile() {
        orders.clear(); // Clear the current orders list
        try (BufferedReader reader = new BufferedReader(new FileReader(saveFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                orders.add(line);
            }
            System.out.println("Orders loaded from file:");
            System.out.println(this); // Print the loaded orders
        } catch (IOException e) {
            System.err.println("Error loading orders from file: " + e.getMessage());
        }
    }

    // Implementing methods from LegalEntity interface
    @Override
    public String getAddress() {
        return "123 Main Street"; // Example address
    }

    @Override
    public String getVatNumber() {
        return "123456789"; // Example VAT number
    }

    // Overriding the toString() method to provide a string representation of CoffeeShop
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CoffeeShop Orders:\n");
        for (String order : orders) {
            sb.append(order).append("\n");
        }
        return sb.toString();
    }

    // Main method for testing, you can ignore this i guess or something
    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop();

        // Add some orders
        coffeeShop.addOrder("Latte");
        coffeeShop.addOrder("Espresso");
        coffeeShop.addOrder("Cappuccino");

        // Print the initial orders
        System.out.println("Initial orders:");
        System.out.println(coffeeShop);

        // Save orders to file
        coffeeShop.saveOrdersToFile();

        // Clear the coffee shop and print the current (empty) orders
        coffeeShop = new CoffeeShop(); // Reinitialize coffeeShop to clear orders list
        System.out.println("\nCoffee shop after clearing:");
        System.out.println(coffeeShop);

        // Load orders from file
        coffeeShop.loadOrdersFromFile();
    }
}

