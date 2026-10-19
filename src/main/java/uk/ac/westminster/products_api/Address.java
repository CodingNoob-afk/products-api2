package uk.ac.westminster.products_api;

public class Address {

    private String street;
    private String city;
    private String postcode;

    public Address(String postcode, String city, String street) {
        this.postcode = postcode;
        this.city = city;
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getPostcode() {
        return postcode;
    }
}
