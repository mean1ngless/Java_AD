import java.util.List;
import java.util.Scanner;

public class Lab2_Main {
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
