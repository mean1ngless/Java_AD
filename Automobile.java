import java.util.Objects;

public class Automobile {
    // Цей клас реалізує автомобіль з такими полями: бренд автомобіля, автомобільний номер, кількість місць у салоні, "чи є машина праворульною", ціна;
    // Реалізовані гетери та сетери, переписано метод toString().
    private String brand;
    private String number;
    private Integer seatsNumber;
    private Boolean rightHandDrive;
    private Double price;

    public Automobile(String Brand, String Number, Integer SeatsNumber, Boolean RightHandDrive, Double Price) {
        this.brand = Brand;
        this.number = Number;
        this.seatsNumber = SeatsNumber;
        this.rightHandDrive = RightHandDrive;
        this.price = Price;
    }

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

    public static Automobile findAutomobile(Automobile[] automobiles, Automobile target) {
        for (Automobile automobile : automobiles) {
            if (automobile.equals(target)) {
                return automobile;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return brand + "\t" + number + "\t" + seatsNumber + "\t" + rightHandDrive + "\t" + price;
    }

    public void setBrand(String Brand) {
        this.brand = Brand;
    }
    public String getBrand() {
        return brand;
    }

    public void setNumber(String Number) {
        this.number = Number;
    }
    public String getNumber() {
        return number;
    }

    public void setSeatsNumber(Integer SeatsNumber) {
        this.seatsNumber = SeatsNumber;
    }
    public Integer getSeatsNumber() {
        return seatsNumber;
    }

    public void setRightHandDrive(Boolean RightHandDrive) {
        this.rightHandDrive = RightHandDrive;
    }
    public Boolean getRightHandDrive() {
        return rightHandDrive;
    }

    public void setPrice(Double Price) {
        this.price = Price;
    }
    public Double getPrice() {
        return price;
    }
}
