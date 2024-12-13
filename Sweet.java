import java.util.Objects;

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

    /**
     * Returns a detailed string representation of the sweet.
     *
     * @return the sweet's details in string format.
     */
    @Override
    public String toString() {
        return String.format("%s: weight=%.2f g, sugar=%.2f%%", name, weight, sugarContent);
    }

    /**
     * Checks equality based on the name, weight, and sugar content.
     *
     * @param obj the object to compare with.
     * @return true if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Sweet sweet = (Sweet) obj;
        return Double.compare(sweet.weight, weight) == 0 &&
                Double.compare(sweet.sugarContent, sugarContent) == 0 &&
                Objects.equals(name, sweet.name);
    }

    /**
     * Returns a hash code based on the name, weight, and sugar content.
     *
     * @return the hash code of the sweet.
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, weight, sugarContent);
    }
}
