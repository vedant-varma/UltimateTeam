public class Person {
    private String name;
    private int age;
    private Country nationality;
    private Type type;

    public Person() {

    }

    public Person(String name, int age, Country nationality, Type type) {
        this.age = age;
        this.name = name;
        this.nationality = nationality;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Country getNationality() {
        return nationality;
    }

    public void setNationality(Country nationality) {
        this.nationality = nationality;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        String s = "";
        s += "Name: " + name + "\n";
        s += "Age: " + age + "\n";
        s += "Nationality: " + nationality + "\n";
        s += "Type: { " + type + " }\n";
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Person)) {
            return false;
        }
        return this.name.equals(((Person) o).name) && this.age == ((Person) o).age &&
                this.nationality.equals(((Person) o).nationality) && this.type.equals(((Person) o).type);
    }

    public static void main(String[] args) {

    }

   
}
