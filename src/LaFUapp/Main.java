import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // create an object of MemoryManager. Creates the collection as well (memories)
        MemoryManager manager = new MemoryManager();
        PromptGenerator promptGenerator = new PromptGenerator();

        int choice = 0; // declared outside of do-while so while block can read variable choice
        
        do {
            System.out.println("==============================================================================");
            System.out.println("    _               _                     _  ______                    _ ");
            System.out.println("   | |             | |                   | | |  ___|                  | |");
            System.out.println("   | |     ___  ___| |_    __ _ _ __   __| | | |_ ___  _   _ _ __   __| |");
            System.out.println("   | |    / _ \\/ __| __|  / _` | '_ \\ / _` | |  _/ _ \\| | | | '_ \\ / _` |");
            System.out.println("   | |___| (_) \\__ \\ |_  | (_| | | | | (_| | | || (_) | |_| | | | | (_| |");
            System.out.println("   \\_____/\\___/|___/\\__|  \\__,_|_| |_|\\__,_| \\_| \\___/ \\__,_|_| |_|\\__,_|");
            System.out.println("                        U   N   I   V   E   R   S   E   ");
             // Menu
            System.out.println("\n==============================================================================");
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("Today's Prompt:\n\"" + promptGenerator.getRandomPrompt() + "\"\n");
            System.out.println("                           [1] Add a Lost Memory");
            System.out.println("                           [2] View All Memories");
            System.out.println("                           [3] Mark Memory as Found");
            System.out.println("                           [4] Delete a Memory");
            System.out.println("                           [5] Generate a Prompt");
            System.out.println("                           [6] Universe Stats");
            System.out.println("                           [7] Exit");
            System.out.println("------------------------------------------------------------------------------");
            System.out.print("Choose: ");

            try {
                choice = sc.nextInt();
                sc.nextLine(); // consume newline

                switch (choice) {
                     // add a memory
                    case 1:
                        addLostMemory(sc, manager);
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
                        int promptChoice = 0;
                        do {
                            System.out.println("\n___ Prompt Generator ___");
                            System.out.println("New Prompt:\n\"" + promptGenerator.getRandomPrompt() + "\"");
                            System.out.println("\nWhat would you like to do next?");
                            System.out.println("    [1] Respond (Add a Lost Memory)");
                            System.out.println("    [2] Generate a New Prompt");
                            System.out.println("    [3] Return to Main Menu");
                            System.out.print("Choose: ");
                            
                            promptChoice = sc.nextInt();
                            sc.nextLine(); 

                            if (promptChoice == 1) {
                                // Calls the reusable method directly
                                addLostMemory(sc, manager);
                                break; 
                            } else if (promptChoice == 2) {
                                continue;
                            } else if (promptChoice == 3) {
                                break; // Return to the main menu loop
                            } else {
                                System.out.println("Invalid choice. Please try again.");
                            }
                        } while (promptChoice != 3);
                        break; 
                     // display Statistics number of lost and found memories
                    case 6:
                        manager.displayUniverseStats();
                        break;
                     //exit
                    case 7:
                        System.out.println("\nGoodbye, traveler of memories.\n");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
                sc.nextLine();
            }
            
        } while (choice != 7);
            
        sc.close();
    }
    private static void addLostMemory(Scanner sc, MemoryManager manager) {
        try {
            System.out.println("\n___ Add a Lost Memory ___");
            System.out.println("Choose a category: ");
            System.out.println("    [1] Person");
            System.out.println("    [2] Item");
            System.out.println("    [3] Event");
            System.out.print("Choose: ");                 
            int cat = sc.nextInt();
            sc.nextLine(); 

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
                manager.addMemory(new Event(name, desc, tag, date));
            } else {
                System.out.println("Invalid category.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input during memory creation! Please enter a number for the category.");
            sc.nextLine(); // consume invalid input
        } catch (Exception e) {
             System.out.println("Error adding memory: " + e.getMessage());
        }
    }
}