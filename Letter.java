/**
 * Represents a single letter in a word.
 */
public class Letter {

    /** The character value of the letter. */
    private final char value;

    /**
     * Constructs a Letter object with the specified character.
     *
     * @param value the character value of the letter.
     */
    public Letter(char value) {
        this.value = value;
    }

    /**
     * Gets the character value of the letter.
     *
     * @return the character value.
     */
    public char getValue() {
        return value;
    }

    /**
     * Converts the Letter object to its string representation.
     *
     * @return the letter as a string.
     */
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}