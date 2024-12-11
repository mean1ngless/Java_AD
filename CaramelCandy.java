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

    @Override
    public String toString() {
        return super.toString() + ", filling=" + (hasFilling ? "yes" : "no");
    }
}
