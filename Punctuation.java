/**
 * Represents a punctuation mark in a sentence.
 */
public class Punctuation {

    /** The punctuation symbol. */
    private final char symbol;

    /**
     * Constructs a Punctuation object with the specified symbol.
     *
     * @param symbol the punctuation character.
     */
    public Punctuation(char symbol) {
        this.symbol = symbol;
    }

    /**
     * Converts the Punctuation object to its string representation.
     *
     * @return the punctuation symbol as a string.
     */
    @Override
    public String toString() {
        return String.valueOf(symbol);
    }
}