import java.util.List;
import java.util.stream.Collectors;

/**
 * Represents a word consisting of multiple letters.
 */
public class Word {

    /** List of letters that form the word. */
    private final List<Letter> letters;

    /**
     * Constructs a Word object from a string.
     * Letters are extracted from the string.
     *
     * @param word the input word string.
     */
    public Word(String word) {
        this.letters = word.chars()
                .mapToObj(c -> new Letter((char) c))
                .collect(Collectors.toList());
    }

    /**
     * Gets the length of the word in terms of the number of letters.
     *
     * @return the length of the word.
     */
    public int length() {
        return letters.size();
    }

    /**
     * Converts the Word object to its string representation.
     *
     * @return the word as a string.
     */
    @Override
    public String toString() {
        return letters.stream()
                .map(Letter::toString)
                .collect(Collectors.joining());
    }
}