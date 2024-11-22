import java.util.List;
import java.util.stream.Collectors;

class Word {
    private final List<Letter> letters;

    public Word(String word) {
        this.letters = word.chars()
                .mapToObj(c -> new Letter((char) c))
                .collect(Collectors.toList());
    }

    public int length() {
        return letters.size();
    }

    @Override
    public String toString() {
        return letters.stream()
                .map(Letter::toString)
                .collect(Collectors.joining());
    }
}
