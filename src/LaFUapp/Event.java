public class Event extends Memory {
    private String dateLost;

    public Event(String name, String description, String tag, String dateLost) {
        super(name, description, tag);
        this.dateLost = dateLost;
    }

    @Override
    public void lost() {
        System.out.println("\n" + name + " was lost last " + dateLost + "...");
    }

    @Override
    public void found() {
        status = "Found";
        System.out.println("\nYou've found " + name + " again. A time is reborn.");
    }

    @Override
    public void display() {
        System.out.println("Category: Event");
        super.display();
        System.out.println("Date lost: " + dateLost);
    }
}
