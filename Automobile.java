import java.math.BigDecimal;

public class Automobile {
    private String Brand;
    private String Number;
    private Integer SeatsNumber;
    private Boolean RightHandDrive;
    private BigDecimal Price;

    public Automobile(String Brand, String Number, Integer SeatsNumber, Boolean RightHandDrive, BigDecimal Price) {
        this.Brand = Brand;
        this.Number = Number;
        this.SeatsNumber = SeatsNumber;
        this.RightHandDrive = RightHandDrive;
        this.Price = Price;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }
    public String getBrand() {
        return Brand;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }
    public String getNumber() {
        return Number;
    }

    public void setSeatsNumber(Integer SeatsNumber) {
        this.SeatsNumber = SeatsNumber;
    }
    public Integer getSeatsNumber() {
        return SeatsNumber;
    }

    public void setRightHandDrive(Boolean RightHandDrive) {
        this.RightHandDrive = RightHandDrive;
    }
    public Boolean getRightHandDrive() {
        return RightHandDrive;
    }

    public void setPrice(BigDecimal Price) {
        this.Price = Price;
    }
    public BigDecimal getPrice() {
        return Price;
    }
}
