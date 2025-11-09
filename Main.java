/* TO DO:
- add a save file function to save locally
- try catch for error handling
- fix console format (design)
- fix readme file (documentation) */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // create an object of MemoryManager. Creates the collection as well (memories)
        MemoryManager manager = new MemoryManager();
        int choice; // declared outside of do-while so while block can read variable choice

        do {
            System.out.println("\n=== Lost and Found Universe ===");
            System.out.println("1. Add a lost memory");
            System.out.println("2. View all memories");
            System.out.println("3. Mark memory as found");
            System.out.println("4. Delete a memory");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                // add a memory
                case 1:
                    System.out.println("Choose a category: ");
                    System.out.println("1. Person");
                    System.out.println("2. Item");
                    System.out.println("3. Time");
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

        } while (choice != 5);

        sc.close();
    }
}
