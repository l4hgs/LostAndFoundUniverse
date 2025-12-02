import java.util.Random;

public class PromptGenerator {
    private String[] prompts = {
        // for item memories
        "What is something small you lost \nbut still remember clearly?",
        "What's an object you've found that \nbecame more important than you expected?",
        "Describe the item you lost that caused \nthe most initial panic or sadness.",
        "If you could find one lost item today, \nregardless of value, what would it be?",

        // for event memories
        "Describe a time you felt completely \n'found' or at peace.",
        "If you could go back to one 'lost \ntime,' when would it be and why?",
        "What is a personal quality you feel \nyou have 'lost' over the years?", 
        "Describe a moment in time you wish you \ncould revisit just to observe it again.",
        
        // for person memories
        "Who is a person you lost touch with, and\n what is the last thing you remember them\nsaying?",
        "Write about a person you found that \nchanged your path, even if briefly.",
    };
    
    // initialized random object
    private Random random = new Random();

    public String getRandomPrompt() {
        // Step A: Check if the array is empty
        if (prompts.length == 0) {
            return "No prompts available. The array is empty!";
        }
        // Get a random index (a number) from 0 up to (but not including) the array length
        int index = random.nextInt(prompts.length);
        
        return prompts[index];
    }
    
}