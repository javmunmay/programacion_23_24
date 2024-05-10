package U9.T2MYSQL;

public class Office {
    private String officeCode;
    private String city;

    // Constructor
    public Office(String officeCode, String city) {
        this.officeCode = officeCode;
        this.city = city;
    }

    // Getters
    public String getOfficeCode() {
        return officeCode;
    }

    public String getCity() {
        return city;
    }
}
