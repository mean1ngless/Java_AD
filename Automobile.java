import java.util.Objects;

/**
 * Клас Automobile представляє автомобіль з інформацією про бренд, автомобільний номер, кількість місць у салоні,
 * чи є автомобіль праворульним та його ціною.
 */
public class Automobile {
    private String brand;
    private String number;
    private Integer seatsNumber;
    private Boolean rightHandDrive;
    private Double price;

    /**
     * Конструктор для створення об'єкта класу {@link Automobile}.
     *
     * @param Brand          назва бренду автомобіля
     * @param Number         автомобільний номер
     * @param SeatsNumber    кількість місць у салоні
     * @param RightHandDrive {@code true}, якщо автомобіль праворульний; {@code false} - якщо ліворульний
     * @param Price          ціна автомобіля
     */
    public Automobile(String Brand, String Number, Integer SeatsNumber, Boolean RightHandDrive, Double Price) {
        this.brand = Brand;
        this.number = Number;
        this.seatsNumber = SeatsNumber;
        this.rightHandDrive = RightHandDrive;
        this.price = Price;
    }

    /**
     * Перевіряє, чи є поточний об'єкт рівним іншому об'єкту {@code obj}.
     *
     * @param obj об'єкт для порівняння з поточним
     * @return {@code true}, якщо об'єкти рівні; {@code false} - інакше
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Automobile that = (Automobile) obj;
        return Objects.equals(brand, that.brand) &&
                Objects.equals(number, that.number) &&
                Objects.equals(seatsNumber, that.seatsNumber) &&
                Objects.equals(rightHandDrive, that.rightHandDrive) &&
                Objects.equals(price, that.price);
    }

    /**
     * Повертає рядкове представлення об'єкта {@link Automobile}.
     *
     * @return рядок, що містить інформацію про бренд, номер, кількість місць, праворульність та ціну
     */
    @Override
    public String toString() {
        return brand + "\t" + number + "\t" + seatsNumber + "\t" + rightHandDrive + "\t" + price;
    }

    /**
     * Встановлює назву бренду автомобіля.
     *
     * @param Brand назва бренду
     */
    public void setBrand(String Brand) {
        this.brand = Brand;
    }

    /**
     * Повертає назву бренду автомобіля.
     *
     * @return бренд автомобіля
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Встановлює номер автомобіля.
     *
     * @param Number автомобільний номер
     */
    public void setNumber(String Number) {
        this.number = Number;
    }

    /**
     * Повертає номер автомобіля.
     *
     * @return автомобільний номер
     */
    public String getNumber() {
        return number;
    }

    /**
     * Встановлює кількість місць у салоні автомобіля.
     *
     * @param SeatsNumber кількість місць
     */
    public void setSeatsNumber(Integer SeatsNumber) {
        this.seatsNumber = SeatsNumber;
    }

    /**
     * Повертає кількість місць у салоні автомобіля.
     *
     * @return кількість місць
     */
    public Integer getSeatsNumber() {
        return seatsNumber;
    }

    /**
     * Встановлює праворульність автомобіля.
     *
     * @param RightHandDrive {@code true}, якщо автомобіль праворульний; {@code false} - якщо ліворульний
     */
    public void setRightHandDrive(Boolean RightHandDrive) {
        this.rightHandDrive = RightHandDrive;
    }

    /**
     * Повертає інформацію про праворульність автомобіля.
     *
     * @return {@code true}, якщо автомобіль праворульний; {@code false} - якщо ліворульний
     */
    public Boolean getRightHandDrive() {
        return rightHandDrive;
    }

    /**
     * Встановлює ціну автомобіля.
     *
     * @param Price ціна автомобіля
     */
    public void setPrice(Double Price) {
        this.price = Price;
    }

    /**
     * Повертає ціну автомобіля.
     *
     * @return ціна автомобіля
     */
    public Double getPrice() {
        return price;
    }
}
