import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sentence {
    private final List<Object> components;

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

    public int getWordCount() {
        return (int) components.stream()
                .filter(c -> c instanceof Word)
                .count();
    }

    @Override
    public String toString() {
        return components.stream()
                .map(Object::toString)
                .collect(Collectors.joining());
    }
}