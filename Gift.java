import java.util.*;
/**
 * Class representing a gift that contains a collection of sweets.
 */
class Gift {
    private List<Sweet> sweets;

    /**
     * Constructor to initialize an empty gift.
     */
    public Gift() {
        sweets = new ArrayList<>();
    }

    /**
     * Adds a sweet to the gift.
     *
     * @param sweet The sweet to add (must not be null).
     */
    public void addSweet(Sweet sweet) {
        if (sweet == null) {
            throw new IllegalArgumentException("Sweet cannot be null");
        }
        sweets.add(sweet);
    }

    /**
     * Calculates the total weight of the gift.
     *
     * @return The total weight of all sweets in grams.
     */
    public double getTotalWeight() {
        return sweets.stream().mapToDouble(Sweet::getWeight).sum();
    }

    /**
     * Sorts the sweets in the gift by their sugar content in ascending order.
     */
    public void sortBySugarContent() {
        sweets.sort(Comparator.comparingDouble(Sweet::getSugarContent));
    }

    /**
     * Finds sweets with cocoa content within a specified range.
     *
     * @param min The minimum cocoa content percentage.
     * @param max The maximum cocoa content percentage.
     * @return A list of sweets that match the criteria.
     */
    public List<Sweet> findSweetsByCocoaContent(double min, double max) {
        if (min < 0 || max > 100 || min > max) {
            throw new IllegalArgumentException("Cocoa content range must be between 0 and 100 and min <= max");
        }
        List<Sweet> result = new ArrayList<>();
        for (Sweet sweet : sweets) {
            if (sweet instanceof ChocolateCandy) {
                double cocoaContent = ((ChocolateCandy) sweet).getCocoaContent();
                if (cocoaContent >= min && cocoaContent <= max) {
                    result.add(sweet);
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Gift contains: " + sweets;
    }
}