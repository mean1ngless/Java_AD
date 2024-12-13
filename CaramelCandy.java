import java.util.Objects;

/**
 * Class representing a caramel candy.
 * Extends the Sweet class and adds a filling property.
 */
class CaramelCandy extends Sweet {
    private boolean hasFilling;

    /**
     * Constructor to initialize a caramel candy.
     *
     * @param name         The name of the candy.
     * @param weight       The weight of the candy in grams.
     * @param sugarContent The sugar content percentage.
     * @param hasFilling   Whether the candy has a filling.
     */
    public CaramelCandy(String name, double weight, double sugarContent, boolean hasFilling) {
        super(name, weight, sugarContent);
        this.hasFilling = hasFilling;
    }

    public boolean hasFilling() {
        return hasFilling;
    }

    /**
     * Returns a detailed string representation of the caramel candy.
     *
     * @return the candy's details in string format.
     */
    @Override
    public String toString() {
        return super.toString() + ", filling=" + (hasFilling ? "yes" : "no");
    }

    /**
     * Checks equality based on the name, weight, sugar content, and filling status.
     *
     * @param obj the object to compare with.
     * @return true if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
        CaramelCandy that = (CaramelCandy) obj;
        return hasFilling == that.hasFilling;
    }

    /**
     * Returns a hash code based on the name, weight, sugar content, and filling status.
     *
     * @return the hash code of the candy.
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hasFilling);
    }
}
