import java.util.HashSet;
import java.util.function.ToDoubleBiFunction;

/**
 * Class that holds the database (hashset) for a group / pool of Persons
 */
public class Pool {
    private HashSet<Person> set;

    public Pool() {
        set = new HashSet<>();
    }

    public Pool(HashSet<Person> set) {
        this.set = set;
    }

    public HashSet<Person> getSet() {
        return set;
    }

    public void setSet(HashSet<Person> set) {
        this.set = set;
    }

    // Here we are taking in the parameter Person when main is adding a player, check whether if this affects the contains logic
    //TODO Debug to ensure that the same person / player is not added in twice to the pool.
    public void add(Person person) {
        if(set.contains(person)) {
            System.out.println("Already contains " + person.getName());
            return;
        }
        set.add(person);
    }

    public void remove(Person person) {
        set.remove(person);
    }

    public Person getPerson(String name) {
        for(Person person : set) {
            if(person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        if(set.isEmpty()) {
            return "Empty Pool";
        }
        StringBuilder s = new StringBuilder("Pool of Persons:\n");
        int count = 1;
        for(Person person : set) {
            s.append(count).append(". ").append(person.toString()).append("\n");
            count++;
        }
        return s.toString();
    }
}
