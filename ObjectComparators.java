import java.util.Comparator;

public class ObjectComparators {
    public static final Comparator<Automobile> byBrand = Comparator.comparing(Automobile::getBrand);
    public static final Comparator<Automobile> byNumber = Comparator.comparing(Automobile::getNumber);
    public static final Comparator<Automobile> bySeatsNumber = Comparator.comparing(Automobile::getSeatsNumber);
    public static final Comparator<Automobile> byRightHand = Comparator.comparing(Automobile::getRightHandDrive);
    public static final Comparator<Automobile> byPrice = Comparator.comparing(Automobile::getPrice);
}
