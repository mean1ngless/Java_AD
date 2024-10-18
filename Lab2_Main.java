import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab2_Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your text:");
            // user input
            String text = scanner.nextLine();

            if(text.isBlank()){
                System.out.println("No text entered.");
                return;
            }

            // divide the text into sentences
            String[] sentences = text.split("(?<=[.!?])\\s*");

            // sort sentences by word count, ignoring punctuation marks
            Arrays.sort(sentences, Comparator.comparingInt(
                    sentence -> sentence.split("[\\s,;:—\\-]+").length
            ));

            // output
            System.out.println("Sorted sentences by word count:");
            for (String sentence : sentences) {
                System.out.println(sentence);
            }

        } catch (InputMismatchException e) {
            System.out.println("Input error occurred: " + e.getMessage());
        } catch (Exception e) {
            // catch any other unexpected exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
