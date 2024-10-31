/**
 * Головний клас Lab3_Main для демонстрації роботи з масивом об'єктів {@link Automobile},
 * сортування масиву за різними критеріями та пошук автомобіля за заданими параметрами.
 */
public class Lab3_Main {
    /**
     * Головний метод програми.
     * Створює масив об'єктів {@link Automobile}, виконує сортування за ціною (спадання) та номером (зростання),
     * а також демонструє пошук автомобіля в масиві.
     *
     * @param args аргументи командного рядка, не використовуються
     */
    public static void main(String[] args) {
        Automobile[] automobiles = {
                new Automobile("Mazda", "AB4R2T", 4, false, 20950.45),
                new Automobile("Toyota", "XC9B2Y", 5, true, 18999.99),
                new Automobile("Honda", "HY6T8K", 4, false, 21500.75),
                new Automobile("Ford", "JK3R5Q", 4, true, 17500.50),
                new Automobile("Chevrolet", "LM2D9F", 2, false, 24300.00),
                new Automobile("Nissan", "QA7U3J", 5, true, 19950.30),
                new Automobile("BMW", "VG4M1L", 4, false, 32999.99),
                new Automobile("Audi", "TE6Y9P", 5, true, 27950.40),
                new Automobile("Mercedes", "RW8F2C", 4, false, 34900.00),
                new Automobile("Hyundai", "PO1L6D", 4, true, 17999.95),
                new Automobile("Volkswagen", "UZ5Q3X", 5, false, 21900.85)
        };

        System.out.println("Sorted by Price(desc):");
        MergeSort.mergeSort(automobiles, ObjectComparators.BY_F1_ASC_F2_DESC);
        for (Automobile element : automobiles) {
            System.out.println(element.toString());
        }

        Automobile target = new Automobile("Toyota", "XC9B2Y", 5, true, 18999.98);
        System.out.println("\nПеревіряємо автомобіль: " + target.toString());
        Automobile found = findAutomobile(automobiles, target);

        if (found != null) {
            System.out.println("Знайдено: " + found);
        } else {
            System.out.println("Такий автомобіль не знайдено.");
        }
    }

    /**
     * Перевіряє, чи є у масиві {@code automobiles} автомобіль, ідентичний {@code target}.
     *
     * @param automobiles масив об'єктів {@link Automobile}
     * @param target автомобіль для пошуку
     * @return автомобіль, якщо знайдений, інакше {@code null}
     */
    public static Automobile findAutomobile(Automobile[] automobiles, Automobile target) {
        for (Automobile automobile : automobiles) {
            if (automobile.equals(target)) {
                return automobile;
            }
        }
        return null;
    }
}
