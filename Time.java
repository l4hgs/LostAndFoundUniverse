public class Time extends Memory {
    private String dateLost;

    public Time(String name, String description, String tag, String dateLost) {
        super(name, description, tag);
        this.dateLost = dateLost;
    }

    @Override
    public void lost() {
        System.out.println(name + " was lost last " + dateLost + "...");
    }

    @Override
    public void found() {
        status = "Found";
        System.out.println("You’ve found " + name + " again. A time is reborn.");
    }

    @Override
    public void display() {
        System.out.println("Category: Time");
        super.display();
        System.out.println("Date lost: " + dateLost);
    }
}
