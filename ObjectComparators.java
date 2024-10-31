import java.util.Comparator;

public class ObjectComparators {
    // за зростанням
    public static final Comparator<Automobile> byBrand = Comparator.comparing(Automobile::getBrand);
    public static final Comparator<Automobile> byNumber = Comparator.comparing(Automobile::getNumber);
    public static final Comparator<Automobile> bySeatsNumber = Comparator.comparing(Automobile::getSeatsNumber);
    public static final Comparator<Automobile> byRightHand = Comparator.comparing(Automobile::getRightHandDrive);
    public static final Comparator<Automobile> byPrice = Comparator.comparing(Automobile::getPrice);

    // за спаданням
    public static final Comparator<Automobile> byBrandDesc = byBrand.reversed();
    public static final Comparator<Automobile> byNumberDesc = byNumber.reversed();
    public static final Comparator<Automobile> bySeatsNumberDesc = bySeatsNumber.reversed();
    public static final Comparator<Automobile> byRightHandDesc = byRightHand.reversed();
    public static final Comparator<Automobile> byPriceDesc = byPrice.reversed();
}
