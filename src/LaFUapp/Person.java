public class Person extends Memory {
    private String relationship;

    public Person(String name, String description, String tag, String relationship) {
        super(name, description, tag);
        this.relationship = relationship;
    }

    // overriding the superclass's methods
    @Override 
    public void lost() {
        System.out.println("\n" + name + " (" + relationship + ") was lost...");
    }

    @Override
    public void found() {
        // status is inherited and set as default to "Lost" in the superclass
        status = "Found";
        System.out.println("\nYou've found " + name + " again. A connection reborn.");
    }

    @Override
    public void display() {
        System.out.println("Category: Person");
        super.display();
        System.out.println("Relationship: " + relationship);

    }
}
