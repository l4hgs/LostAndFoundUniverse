import java.util.Random;

public class PromptGenerator {
    private String[] prompts = {
        // for person memories
        "Who is a person you lost touch with, and what is the last thing you remember them saying?",
        "Is there someone you miss, even it they're not gone forever?",
        "How has losing that person changed you?",
        "Write about a person you found that changed your path, even if briefly.",
        "What moment with them do you revisit with them?",
        // for item memories
        "What is something small you lost but still remember clearly?",
        "What's an object you've found that became more important than you expected?",
        "Describe the item you lost that caused the most initial panic or sadness.",
        "If you could find one lost item today, regardless of value, what would it be?",
        "Do you think losing it changed anything in your daily routine?",
        // for event memories
        "Describe a time you felt completely 'found' or at peace.",
        "If you could go back to one 'lost time,' when would it be and why?",
        "What is a personal quality you feel you have 'lost' over the years?", 
        "Describe a moment in time you wish you could revisit just to observe it again.",
        "Is there a period in your life you feel nostalgic for?"
        
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