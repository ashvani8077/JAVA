public class EncapsulationExample {
    // Private fields
    private String name;
    private int age;

    // Constructor
    public EncapsulationExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for 'name'
    public String getName() {
        return name;
    }

    // Setter method for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for 'age'
    public int getAge() {
        return age;
    }

    // Setter method for 'age'
    public void setAge(int age) {
        // Additional validation can be added here
        this.age = age;
    }

    // Other methods
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an instance of the class
        EncapsulationExample obj = new EncapsulationExample("John Doe", 25);

        // Accessing fields through getter methods
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());

        // Modifying fields through setter methods
        obj.setName("Jane Doe");
        obj.setAge(30);

        // Displaying updated details
        obj.displayDetails();
    }
}



