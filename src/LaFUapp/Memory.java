// abstraction serves as blueprint for subclasses
// can't be instantiated

public abstract class Memory {
    protected String name;
    protected String description;
    protected String tag;
    protected String status; // "Lost" or "Found"

    public Memory(String name, String description, String tag) {
        this.name = name;
        this.description = description;
        this.tag = tag;
        this.status = "Lost"; // default when created
    }

    // lost() and found() methods are unique in each subclasses
    public abstract void lost();
    public abstract void found();

    // getter and setter is required for access outside class for modification
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    // display() is inherited for all subclasses
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Tag: " + tag);
        System.out.println("Status: " + status);
    }

    // only getter to access outside of Memory class
    // .getClass() returns the class of the current object ("Person.class")
    // .getSimpleName() gives its class name as text ("Person")
    public String getCategory() {
        return this.getClass().getSimpleName();
    }
}
