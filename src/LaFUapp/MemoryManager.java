// uses ArrayList to dynamically create objects in it
import java.util.ArrayList;

public class MemoryManager {
    // all memories will be stored here
    private ArrayList<Memory> memories = new ArrayList<>();
    // counters for displayUniverseStats();
    private int totalLost = 0;
    private int totalFound = 0;

    // takes a new memory, adds to the list, calls m.lost() which prints a message
    public void addMemory(Memory m) {
        memories.add(m);
        m.lost();
        totalLost++;
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
                // only mark and update counters if the memory is currently Lost
                if (m.getStatus().equals("Lost")) {
                    m.found();
                    totalFound++;
                    totalLost--; 
                } else {
                    System.out.println(name + " is already marked as Found.");
                }
                return;
            }
        }
        System.out.println("Memory not found.");
    }

    public void deleteMemory(String name) {
        // Iterate using a standard loop so we can safely remove items and update counters.
        boolean foundAndDeleted = false;
        
        for (int i = 0; i < memories.size(); i++) {
            Memory m = memories.get(i);
            
            if (m.name.equalsIgnoreCase(name)) {
                // *** UPDATE 3: Adjust counters based on the memory's current status ***
                if (m.getStatus().equals("Lost")) {
                    totalLost--;
                } else { // Status must be "Found"
                    totalFound--;
                }
                
                memories.remove(i);
                System.out.println(name + " has been deleted from the universe.");
                foundAndDeleted = true;
                // We use break since names should be unique for this menu functionality
                break;
            }
        }
        
        if (!foundAndDeleted) {
            System.out.println(name + " does not exist in the universe.");
        }
    }

    // for case 6
    public void displayUniverseStats() {
        System.out.println("\nUNIVERSAL INTROSPECTION");
        System.out.println("==========================================");
        // Output the results using the stored variables
        System.out.println("You have found **" + totalFound + "** memories.\n **" + totalLost + "** are still missing.");
        System.out.println("Total memories recorded: " + (totalFound + totalLost) + ".");
        System.out.println("==========================================");
    }    
}
