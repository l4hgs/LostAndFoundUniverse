import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // create an object of MemoryManager. Creates the collection as well (memories)
        MemoryManager manager = new MemoryManager();
        int choice = 0; // declared outside of do-while so while block can read variable choice
        
        do {
             // Menu
            System.out.println("\n=========================================");
            System.out.println("   *       .    ____   ____   *     *      ");
            System.out.println("     .        / ____| / ___|       .");
            System.out.println("             | |      \\___ \\          .");
            System.out.println("    .        | |___    ___) |          .");
            System.out.println("  *       .   \\____|  |____/  .");
            System.out.println("     .         2  1  0  5 .         *");
            System.out.println("==========================================");
            System.out.println("L O S T   &   F O U N D   U N I V E R S E   ");
            System.out.println("------------------------------------------");
            System.out.println("  [1] Add a Lost Memory");
            System.out.println("  [2] View All Memories");
            System.out.println("  [3] Mark Memory as Found");
            System.out.println("  [4] Delete a Memory");
            System.out.println("  [5] Exit");
            System.out.println("------------------------------------------");
            System.out.print("Choose: ");

            try {
                choice = sc.nextInt();
                sc.nextLine(); // consume newline

                switch (choice) {
                     // add a memory
                    case 1:
                        System.out.println("Choose a category: ");
                        System.out.println("1. Person");
                        System.out.println("2. Item");
                        System.out.println("3. Time");
                        System.out.print("Choose: ");                        
                        int cat = sc.nextInt();
                        sc.nextLine(); // similar to cin.ignore in cpp

                        System.out.print("Name: ");
                        String name = sc.nextLine();
                        System.out.print("Description: ");
                        String desc = sc.nextLine();
                        System.out.print("Tag: ");
                        String tag = sc.nextLine();

                        if (cat == 1) {
                            System.out.print("Relationship: ");
                            String rel = sc.nextLine();
                            manager.addMemory(new Person(name, desc, tag, rel));
                        } else if (cat == 2) {
                            System.out.print("Location lost: ");
                            String loc = sc.nextLine();
                            manager.addMemory(new Item(name, desc, tag, loc));
                        } else if (cat == 3) {
                            System.out.print("Date lost: ");
                            String date = sc.nextLine();
                            manager.addMemory(new Time(name, desc, tag, date));
                        } else {
                            System.out.println("Invalid category.");
                        }
                        break;
                     // view all memories
                    case 2:
                        manager.displayAll();
                        break;
                     // memory mark as found
                    case 3:
                        System.out.print("Enter memory name to mark as found: ");
                        String findName = sc.nextLine();
                        manager.markAsFound(findName);
                        break;
                     //delete a memory
                    case 4:
                        System.out.print("Enter memory name to delete: ");
                        String delName = sc.nextLine();
                        manager.deleteMemory(delName);
                        break;
                     // exit
                    case 5:
                        System.out.println("Goodbye, traveler of memories.");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine(); // consume the invalid input to prevent infinite loop
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
                sc.nextLine(); // consume any leftover input
            }
        } while (choice != 5);
            
        sc.close();
    }
}
