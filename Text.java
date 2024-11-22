import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Represents a text consisting of multiple sentences.
 * Provides functionality to sort sentences by word count.
 */
public class Text {

    /** List of sentences in the text. */
    private final List<Sentence> sentences;

    /**
     * Constructs a Text object from the input string.
     * Sentences are identified by splitting the text at punctuation marks (., !, ?).
     *
     * @param text the input text to process.
     */
    public Text(String text) {
        String cleanedText = text.replaceAll("\\s+", " ");
        String[] splitSentences = cleanedText.split("(?<=[.!?])\\s*");
        this.sentences = Arrays.stream(splitSentences)
                .map(Sentence::new)
                .collect(Collectors.toList());
    }

    /**
     * Retrieves a list of sentences sorted by their word count in ascending order.
     *
     * @return a sorted list of sentences.
     */
    public List<Sentence> getSentencesSortedByWordCount() {
        return sentences.stream()
                .sorted(Comparator.comparingInt(Sentence::getWordCount))
                .collect(Collectors.toList());
    }

    /**
     * Converts the Text object to its string representation.
     * Joins all sentences into a single string.
     *
     * @return a string representation of the text.
     */
    @Override
    public String toString() {
        return sentences.stream()
                .map(Sentence::toString)
                .collect(Collectors.joining(" "));
    }
}
