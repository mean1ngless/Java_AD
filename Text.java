import java.util.*;
import java.util.stream.Collectors;

class Text {
    private final List<Sentence> sentences;

    public Text(String text) {
        String cleanedText = text.replaceAll("\\s+", " ");
        String[] splitSentences = cleanedText.split("(?<=[.!?])\\s*");
        this.sentences = Arrays.stream(splitSentences)
                .map(Sentence::new)
                .collect(Collectors.toList());
    }

    public List<Sentence> getSentencesSortedByWordCount() {
        return sentences.stream()
                .sorted(Comparator.comparingInt(Sentence::getWordCount))
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return sentences.stream()
                .map(Sentence::toString)
                .collect(Collectors.joining(" "));
    }
}