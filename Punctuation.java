import java.util.*;
import java.util.stream.Collectors;

class Punctuation {
    private final char symbol;

    public Punctuation(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return String.valueOf(symbol);
    }
}
