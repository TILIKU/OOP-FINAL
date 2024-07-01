package finalexam.task2;

public class FactoryTester {
    public static void main(String[] args) {
        // Create a PaperFactory instance
        PaperFactory factory = new PaperFactory();

        // Create some Person instances
        Person person1 = new Person("John", "Doe", "123456789");
        Person person2 = new Person("Jane", "Smith", "987654321");
        Person person3 = new Person("Alice", "Johnson", "111222333");
        Person person4 = new Person("Bob", "Brown", "444555666");

        // Add persons to the factory
        factory.addPerson(person1);
        factory.addPerson(person2);
        factory.addPerson(person3);

        // Print the current staff list
        System.out.println("Initial staff list:");
        System.out.println(factory);

        // Try to find a person by personal number
        System.out.println("Searching for person with personal number '987654321':");
        Person foundPerson = factory.findPersonByPersonalNumber("987654321");
        System.out.println("Found: " + foundPerson);

        // Try to delete a person from the factory
        System.out.println("Attempting to remove Jane Smith (personal number '987654321'):");
        boolean removed = factory.deletePerson(person2);
        System.out.println("Person removed: " + removed);

        // Print the updated staff list
        System.out.println("Updated staff list after removal:");
        System.out.println(factory);

        // Attempt to remove a person who is not in the factory
        System.out.println("Attempting to remove Bob Brown (personal number '444555666') who is not in the factory:");
        removed = factory.deletePerson(person4);
        System.out.println("Person removed: " + removed);

        // Add a new person to the factory
        System.out.println("Adding Bob Brown to the factory:");
        factory.addPerson(person4);

        // Print the final staff list
        System.out.println("Final staff list:");
        System.out.println(factory);
    }
}
