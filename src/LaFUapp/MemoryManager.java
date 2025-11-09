// uses ArrayList to dynamically create objects in it
import java.util.ArrayList;

public class MemoryManager {
    // all memories will be stored here
    private ArrayList<Memory> memories = new ArrayList<>();

    // takes a new memory, adds to the list, calls m.lost() which prints a message
    public void addMemory(Memory m) {
        memories.add(m);
        m.lost();
    }

    // .isEmpty() checks the ArrayList
    public void displayAll() {
        if (memories.isEmpty()) {
            System.out.println("No memories recorded yet.");
            return;
        }

        System.out.println("=== All Memories ===");
        for (Memory m : memories) {
            // calls display() of each subclass entries (polymorphism) 
            m.display();
            System.out.println("--------------------");
        }
    }

    // String name is the parameter (from the user)
    public void markAsFound(String name) {
        // m is each memory inside ArrayList memories (iterator variable)
        for (Memory m : memories) {
            // .equals checks value equality and IgnoreCase makes it case-INSENSITIVE
            // used only in Strings
            if (m.name.equalsIgnoreCase(name)) {
                m.found();
                // return stops the method when found
                return;
            }
        }
        System.out.println("Memory not found.");
    }

    public void deleteMemory(String name) {
        // .stream().anyMatch() checks if at least one memory matches the name
        boolean exists = memories.stream().anyMatch(m -> m.name.equalsIgnoreCase(name));
        // .removeIf(condition) removes all elements that match a condition (only applicable for collections like ArrayList)
        // lambda expression for the condition 
        // m is removed (the object) completely in Memories
        if (exists) {
            memories.removeIf(m -> m.name.equalsIgnoreCase(name));
            System.out.println(name + " has been deleted from the universe.");
        } else {
            System.out.println(name + " does not exist in the universe.");
        }
        
    }
}
