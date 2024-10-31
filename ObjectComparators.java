import java.util.Comparator;

/**
 * Клас {@code ObjectComparators} містить статичні компаратори для порівняння об'єктів
 * класу {@link Automobile} за різними критеріями сортування.
 */
public class ObjectComparators {

    /**
     * Основний комбінований компаратор для сортування {@link Automobile}:
     * спершу порівнює об'єкти за кількістю місць (поле {@code SeatsNumber}) у порядку зростання,
     * а в разі однакової кількості місць — за ціною (поле {@code Price}) у порядку спадання.
     */
    public static final Comparator<Automobile> BY_F1_ASC_F2_DESC =
            Comparator.comparing(Automobile::getSeatsNumber)
                    .thenComparing(Automobile::getPrice, Comparator.reverseOrder());
}
