import java.util.Comparator;

public class ObjectComparators {
    // Компаратор для сортування за брендом(за зростанням)
    public static final Comparator<Automobile> BY_BRAND = Comparator.comparing(Automobile::getBrand);
    // Компаратор для сортування за номером(за зростанням)
    public static final Comparator<Automobile> BY_NUMBER = Comparator.comparing(Automobile::getNumber);
    // Компаратор для сортування за кількістю місць у салоні(за зростанням)
    public static final Comparator<Automobile> BY_SEATS_NUMBER = Comparator.comparing(Automobile::getSeatsNumber);
    // Компаратор для сортування за стороную положення руля(за зростанням)
    public static final Comparator<Automobile> BY_RIGHT_HAND = Comparator.comparing(Automobile::getRightHandDrive);
    // Компаратор для сортування за ціною(за зростанням)
    public static final Comparator<Automobile> BY_PRICE = Comparator.comparing(Automobile::getPrice);

    // Компаратор для сортування за брендом(за спаданням)
    public static final Comparator<Automobile> BY_BRAND_DESC = BY_BRAND.reversed();
    // Компаратор для сортування за номером(за спаданням)
    public static final Comparator<Automobile> BY_NUMBER_DESC = BY_NUMBER.reversed();
    // Компаратор для сортування за кількістю місць у салоні(за спаданням)
    public static final Comparator<Automobile> BY_SEATS_NUMBER_DESC = BY_SEATS_NUMBER.reversed();
    // Компаратор для сортування за стороную положення руля(за спаданням)
    public static final Comparator<Automobile> BY_RIGHT_HAND_DESC = BY_RIGHT_HAND.reversed();
    // Компаратор для сортування за ціною(за спаданням)
    public static final Comparator<Automobile> BY_PRICE_DESC = BY_PRICE.reversed();
}
