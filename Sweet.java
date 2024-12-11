// Узагальнений клас для солодощів
/**
 * Abstract class representing a general sweet.
 * Contains common properties such as name, weight, and sugar content.
 */
abstract class Sweet {
    private String name;
    private double weight;
    private double sugarContent;

    /**
     * Constructor to initialize a sweet.
     *
     * @param name         The name of the sweet.
     * @param weight       The weight of the sweet in grams (must be non-negative).
     * @param sugarContent The sugar content percentage (0-100).
     */
    public Sweet(String name, double weight, double sugarContent) {
        if (weight < 0) {
            throw new IllegalArgumentException("Weight cannot be less than 0");
        }
        if (sugarContent < 0 || sugarContent > 100) {
            throw new IllegalArgumentException("Sugar content must be between 0 and 100%");
        }
        this.name = name;
        this.weight = weight;
        this.sugarContent = sugarContent;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getSugarContent() {
        return sugarContent;
    }

    @Override
    public String toString() {
        return String.format("%s: weight=%.2f, sugar=%.2f%%", name, weight, sugarContent);
    }
}
