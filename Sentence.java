import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Represents a sentence consisting of words and punctuation marks.
 */
public class Sentence {

    /** List of components (words and punctuation) in the sentence. */
    private final List<Object> components;

    /**
     * Constructs a Sentence object from a string.
     * Components are extracted by splitting the string into words and punctuation marks.
     *
     * @param sentence the input sentence string.
     */
    public Sentence(String sentence) {
        this.components = new ArrayList<>();
        String[] parts = sentence.split("(?=[.,!?;:])|(?<=\\s)");
        for (String part : parts) {
            if (part.matches("\\s*")) {
                continue;
            }
            if (part.matches("[.,!?;:—]")) {
                components.add(new Punctuation(part.charAt(0)));
            } else {
                components.add(new Word(part));
            }
        }
    }

    /**
     * Gets the number of words in the sentence.
     *
     * @return the word count.
     */
    public int getWordCount() {
        return (int) components.stream()
                .filter(c -> c instanceof Word)
                .count();
    }

    /**
     * Converts the Sentence object to its string representation.
     * Joins all components into a single string.
     *
     * @return a string representation of the sentence.
     */
    @Override
    public String toString() {
        return components.stream()
                .map(Object::toString)
                .collect(Collectors.joining());
    }
}