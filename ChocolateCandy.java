import java.util.Objects;

/**
 * Class representing a chocolate candy.
 * Extends the Sweet class and adds cocoa content.
 */
class ChocolateCandy extends Sweet {
    private double cocoaContent;

    /**
     * Constructor to initialize a chocolate candy.
     *
     * @param name         The name of the candy.
     * @param weight       The weight of the candy in grams.
     * @param sugarContent The sugar content percentage.
     * @param cocoaContent The cocoa content percentage (0-100).
     */
    public ChocolateCandy(String name, double weight, double sugarContent, double cocoaContent) {
        super(name, weight, sugarContent);
        if (cocoaContent < 0 || cocoaContent > 100) {
            throw new IllegalArgumentException("Cocoa content must be between 0 and 100%");
        }
        this.cocoaContent = cocoaContent;
    }

    public double getCocoaContent() {
        return cocoaContent;
    }

    /**
     * Returns a detailed string representation of the chocolate candy.
     *
     * @return the candy's details in string format.
     */
    @Override
    public String toString() {
        return super.toString() + String.format(", cocoa=%.2f%%", cocoaContent);
    }

    /**
     * Checks equality based on the name, weight, sugar content, and cocoa content.
     *
     * @param obj the object to compare with.
     * @return true if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
        ChocolateCandy that = (ChocolateCandy) obj;
        return Double.compare(that.cocoaContent, cocoaContent) == 0;
    }

    /**
     * Returns a hash code based on the name, weight, sugar content, and cocoa content.
     *
     * @return the hash code of the candy.
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cocoaContent);
    }
}
