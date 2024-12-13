import java.util.Objects;

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

    /**
     * Returns a detailed string representation of the jelly candy.
     *
     * @return the candy's details in string format.
     */
    @Override
    public String toString() {
        return super.toString() + ", flavor=" + flavor;
    }

    /**
     * Checks equality based on the name, weight, sugar content, and flavor.
     *
     * @param obj the object to compare with.
     * @return true if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
        JellyCandy that = (JellyCandy) obj;
        return Objects.equals(flavor, that.flavor);
    }

    /**
     * Returns a hash code based on the name, weight, sugar content, and flavor.
     *
     * @return the hash code of the candy.
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), flavor);
    }
}
