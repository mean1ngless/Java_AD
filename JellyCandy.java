/**
 * Class representing a jelly candy.
 * Extends the Sweet class and adds a flavor property.
 */
class JellyCandy extends Sweet {
    private String flavor;

    /**
     * Constructor to initialize a jelly candy.
     *
     * @param name         The name of the candy.
     * @param weight       The weight of the candy in grams.
     * @param sugarContent The sugar content percentage.
     * @param flavor       The flavor of the candy.
     */
    public JellyCandy(String name, double weight, double sugarContent, String flavor) {
        super(name, weight, sugarContent);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    @Override
    public String toString() {
        return super.toString() + ", flavor=" + flavor;
    }
}
