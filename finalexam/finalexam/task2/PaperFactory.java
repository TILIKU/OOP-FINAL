package finalexam.task2;

import java.util.ArrayList;
import java.util.List;

public class PaperFactory {
    private List<Person> staff = new ArrayList<>();

    public void addPerson(Person p) {
        if (p == null) {
            throw new IllegalArgumentException("Person cannot be null.");
        }
        staff.add(p);
    }

    public boolean deletePerson(Person p) {
        return staff.remove(p);
    }

    //ill add couple more methods because this just feels unfinished with just two idk
    // Method to find a person by their personal number
    public Person findPersonByPersonalNumber(String personalNumber) {
        for (Person person : staff) {
            if (person.getPersonalNumber().equals(personalNumber)) {
                return person;
            }
        }
        return null; // Return null if no person found
    }

    // Method to list all persons in the staff
    public List<Person> listAllStaff() {
        return new ArrayList<>(staff); // Return a copy of the staff list to prevent external modifications
    }

    // Overriding the toString() method to provide a string representation of the PaperFactory
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PaperFactory Staff:\n");
        for (Person person : staff) {
            sb.append(person).append("\n");
        }
        return sb.toString();
    }

}
