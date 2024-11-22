import java.util.List;
import java.util.Scanner;

/**
 * The main class for the application.
 * It takes user input, processes the text, and outputs sorted sentences by word count.
 */
public class Lab2_Main {

    /**
     * The entry point of the application.
     *
     * @param args command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your text:");
            String inputText = scanner.nextLine();

            if (inputText.isBlank()) {
                System.out.println("No text entered.");
                return;
            }

            Text text = new Text(inputText);
            List<Sentence> sortedSentences = text.getSentencesSortedByWordCount();

            System.out.println("Sorted sentences by word count:");
            sortedSentences.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
