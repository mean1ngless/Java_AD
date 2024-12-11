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

    @Override
    public String toString() {
        return super.toString() + String.format(", cocoa=%.2f%%", cocoaContent);
    }
}
