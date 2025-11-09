public class Item extends Memory{
    private String locationLost;

    public Item(String name, String description, String tag, String locationLost) {
        super(name, description, tag);
        this.locationLost = locationLost;
    }

    @Override 
    public void lost() {
        System.out.println(name + " was lost at " + locationLost + "...");
    }

    @Override
    public void found() {
        status = "Found";
        System.out.println("You've found " + name + " again, even if it's lost.");
    }

    @Override
    public void display() {
        System.out.println("Category: Item");
        super.display();
        System.out.println("Location lost: " + locationLost);

    }
}
