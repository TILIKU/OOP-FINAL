package finalexam.task2;

public class Person {
    String name, surname, personalNumber;


    // Constructor to initialize all fields
    public Person(String name, String surname, String personalNumber) {
        setName(name);
        setSurname(surname);
        setPersonalNumber(personalNumber);
    }

    // Getter and Setter for name with basic validation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        this.name = name;
    }

    // Getter and Setter for surname with basic validation
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname == null || surname.trim().isEmpty()) {
            throw new IllegalArgumentException("Surname cannot be null or empty.");
        }
        this.surname = surname;
    }

    // Getter and Setter for personalNumber with basic validation
    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        if (personalNumber == null || !personalNumber.matches("\\d+")) {
            throw new IllegalArgumentException("Personal number must be a non-null sequence of digits.");
        }
        this.personalNumber = personalNumber;
    }

    // Method to get the full name
    public String getFullName() {
        return name + " " + surname;
    }

    // Overriding the toString() method to provide a string representation of the Person object
    @Override
    public String toString() {
        return "Person [Name=" + name + ", Surname=" + surname + ", PersonalNumber=" + personalNumber + "]";
    }
}

