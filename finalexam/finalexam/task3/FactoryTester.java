package finalexam.task3;

public class FactoryTester {
    public static void main(String[] args) {
        // Create a PaperFactory instance
        PaperFactory factory = new PaperFactory();

        // Add some people to the factory
        factory.addPerson(new Person("John", "Doe", "123456789"));
        factory.addPerson(new Person("Jane", "Smith", "987654321"));
        factory.addPerson(new Person("Alice", "Johnson", "111222333"));

        // Print the initial staff list
        System.out.println("Initial staff list:");
        System.out.println(factory);

        // Save the staff list to a file in the 'task3' package directory
        factory.saveToFile();

        // Clear the factory and print the current (empty) staff list
        factory = new PaperFactory(); // Reinitialize factory to clear staff list
        System.out.println("\nFactory after clearing:");
        System.out.println(factory);

        // Load the staff list from the file in the 'task3' package directory
        factory.loadFromFile();
    }
}
